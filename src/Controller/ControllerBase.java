package Controller;

import Model.Utente;

// SINGLETON
public class ControllerBase {
    private static ControllerBase instance;
    private Utente utenteCorrente;
    private ControllerBase() {
        // Inizializza la connessione al database
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
    public Utente register(String id, String password) {
        // fixme implementare la logica di registrazione
        return null;
    }
    public Utente login(String id, String password) {
        // fixme implementare la logica di autenticazione
        return null;
    }
    public void logout() {
        this.utenteCorrente = null;
        System.out.println("🔒 Logout effettuato con successo!");
    }
}
