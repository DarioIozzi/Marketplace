package Model;

public class Venditore extends Utente{
    String descrizione;
    float rating;

    public Venditore(String id, String nome, String cognome, String email, String password, String telefono, String descrizione) {
        super(id, nome, cognome, email, password, telefono);
        this.descrizione = descrizione;
        this.rating = 0.0f; // inizialmente il rating è 0
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public void Stampa() {
        super.Stampa();
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Rating: " + rating);
    }
}
