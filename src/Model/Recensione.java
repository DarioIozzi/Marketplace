package Model;

public class Recensione {
    private int id_recensione;
    private Utente id_autore;
    private Utente id_venditore;
    private int voto;
    private String testo;

    public Recensione(int id_recensione,Utente autore, Utente venditore,int voto, String testo ) {
        this.id_recensione = id_recensione;
        this.id_autore = autore;
        this.id_venditore = venditore;
        this.voto = voto;
        this.testo = testo;
    }

    public int getId_recensione() {
        return id_recensione;
    }

    public void setId_recensione(int id_recensione) {
        this.id_recensione = id_recensione;
    }

    public Utente getAutore() {
        return id_autore;
    }

    public void setAutore(Utente autore) {
        this.id_autore = autore;
    }

    public Utente getVenditore() {
        return id_venditore;
    }

    public void setVenditore(Utente venditore) {
        this.id_venditore = venditore;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public void Stampa() {
        System.out.println("------------------------------------------");
        System.out.println("ID: " + id_recensione);
        System.out.println("Autore: " + id_autore);
        System.out.println("Venditore: " + id_venditore);
        System.out.println("Voto: " + voto);
        System.out.println("Testo: " + testo);
    }
}
