package Controller;
import java.sql.*;
import Model.Venditore;
import org.mindrot.jbcrypt.BCrypt;
import Model.Utente;

// SINGLETON
public class ControllerBase {
    private static ControllerBase instance;
    private Utente utenteCorrente;
    private Connection conn;

    private ControllerBase() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tuo_database", "utente", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        utenteCorrente = null;
    }
    public static ControllerBase getInstance() {
        if (instance == null) {
            instance = new ControllerBase();
        }
        return instance;
    }
    public Utente getUtenteCorrente() {
        return utenteCorrente;
    }
    public void setUtenteCorrente(Utente utente) {
        this.utenteCorrente = utente;
    }

    public void register(String id, String nome, String cognome, String email, String password, String telefono) {
        String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());

        try {
            String query = "INSERT INTO utenti (id, nome, cognome, email, password, telefono) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, cognome);
            stmt.setString(4, email);
            stmt.setString(5, passwordHash);
            stmt.setString(6, telefono);
            stmt.executeUpdate();
            System.out.println("✅ Registrazione completata.");
            utenteCorrente = new Utente(id, nome, cognome, email, passwordHash, telefono);
        } catch (SQLException e) {
            System.out.println("❌ Errore durante la registrazione: " + e.getMessage());
        }
    }

    public void register(String id, String nome, String cognome, String email, String password, String telefono, String descrizione) {
        String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());

        try {
            String query = "INSERT INTO utenti (id, nome, cognome, email, password, telefono, descrizione) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, cognome);
            stmt.setString(4, email);
            stmt.setString(5, passwordHash);
            stmt.setString(6, telefono);
            stmt.setString(7, descrizione);
            stmt.executeUpdate();
            System.out.println("✅ Registrazione completata.");
            utenteCorrente = new Venditore(id, nome, cognome, email, passwordHash, telefono, descrizione);
        } catch (SQLException e) {
            System.out.println("❌ Errore durante la registrazione: " + e.getMessage());
        }
    }

    public void login(String id, String password) {
        try {
            String query = "SELECT password FROM utenti WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
                String email = rs.getString("email");
                String passwordHash = rs.getString("password");
                String telefono = rs.getString("telefono");
                if (BCrypt.checkpw(password, passwordHash)) {
                    System.out.println("✅ Login riuscito!");
                    utenteCorrente = new Utente(id, nome, cognome, email, passwordHash, telefono);
                } else {
                    System.out.println("❌ Password errata.");
                }
            } else {
                System.out.println("❌ Utente non trovato.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Errore durante il login: " + e.getMessage());
        }
    }

    public void logout() {
        this.utenteCorrente = null;
        System.out.println("🔒 Logout effettuato con successo!");
    }
}
