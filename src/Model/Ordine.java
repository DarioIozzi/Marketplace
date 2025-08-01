package Model;

enum StatoOrdine {
    IN_ATTESA,
    ACCETTATO,
    RIFIUTATO,
    COMPLETATO
}
public class Ordine {
    private int id_ordine;
    int id_cliente;
    int id_venditore;
    int id_servizio;        //fixme valutare se id o oggetto
    private String data;
    private StatoOrdine stato;

    public Ordine(int id_ordine, int id_cliente, int id_venditore, int id_servizio, String data, StatoOrdine stato) {
        this.id_ordine = id_ordine;
        this.id_cliente = id_cliente;
        this.id_venditore = id_venditore;
        this.id_servizio = id_servizio;
        this.data = data;
        this.stato = stato;

    }

    public int getId_ordine() {
        return id_ordine;
    }

    public void setId_ordine(int id_ordine) {
        this.id_ordine = id_ordine;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_venditore() {
        return id_venditore;
    }

    public void setId_venditore(int id_venditore) {
        this.id_venditore = id_venditore;
    }

    public int getId_servizio() {
        return id_servizio;
    }

    public void setId_servizio(int id_servizio) {
        this.id_servizio = id_servizio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }

    public void Stampa() {
        System.out.println("------------------------------------------");
        System.out.println("ID: " + id_ordine);
        System.out.println("ID Cliente: " + id_cliente);
        System.out.println("ID Venditore: " + id_venditore);
        System.out.println("Servizio: " + id_servizio);
        System.out.println("Data: " + data);
        System.out.println("Stato: " + stato);
    }
}
