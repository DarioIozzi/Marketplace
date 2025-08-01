package Model;

public class Servizio {

    int id_servizio;
    int id_venditore;
    String titolo;
    String descrizione;
    float prezzo;
    String categoria;
    String dataPubblicazione;
    boolean visibile;

    public Servizio(int id_servizio, int id_venditore, String titolo, String descrizione, float prezzo, String categoria, String dataPubblicazione, boolean visibile) {
        this.id_servizio = id_servizio;
        this.id_venditore = id_venditore;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.dataPubblicazione = dataPubblicazione;
        this.visibile = visibile;
    }

    public int getId_servizio() {
        return id_servizio;
    }

    public void setId_servizio(int id_servizio) {
        this.id_servizio = id_servizio;
    }

    public int getId_venditore() {
        return id_venditore;
    }

    public void setId_venditore(int id_venditore) {
        this.id_venditore = id_venditore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(String dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public boolean isVisibile() {
        return visibile;
    }

    public void setVisibile(boolean visibile) {
        this.visibile = visibile;
    }

    public void Stampa() {
        System.out.println("------------------------------------------");
        System.out.println("ID: " + id_servizio);
        System.out.println("Venditore: " + id_venditore);
        System.out.println("Titolo: " + titolo);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Data di pubblicazione: " + dataPubblicazione);
        System.out.println("Visibile: " + visibile);
    }
}
