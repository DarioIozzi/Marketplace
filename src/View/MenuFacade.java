package View;
import Controller.*;
import java.util.Scanner;

public class MenuFacade extends Menu {

    public MenuFacade() {
        // fixme controllare se nell'esetendere una classe astratta devo usare super() nel costruttore
        super();
        super.controller = ControllerBase.getInstance();
    }
    public void display() {
        int scelta = 0;
        do {
            //TODO valutare l'aggiunta di U o V all'inizio dell'id utente per riconoscere se utente o venditore
            //TODO ad ora id è considerato lo username, aggiungere un campo username e uno id generato automaticamente?
            Scanner scanner = new Scanner(System.in);
            System.out.println("Benvenuto nella nostra applicazione!");
            System.out.println("1. Login");
            System.out.println("2. Registrazione");
            System.out.println("3. Chiudi applicazione");
            System.out.println("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("LOGIN");
                    System.out.println("Inserisci il tuo username: ");
                    String idL = scanner.next();
                    System.out.println("Inserisci la tua password: ");
                    String passL = scanner.next();
                    controller.login(idL, passL);
                    break;
                case 2:
                    System.out.println("REGISTRAZIONE");
                    System.out.println("Sei un venditore? (s/n)");
                    String type = scanner.next();
                    System.out.println("Inserisci il tuo username: ");
                    String idR = scanner.next();
                    System.out.println("La tua password: ");
                    String passR = scanner.next();
                    System.out.println("Nome: ");
                    String nome = scanner.next();
                    System.out.println("Cognome: ");
                    String cognome = scanner.next();
                    System.out.println("Email: ");
                    String email = scanner.next();
                    System.out.println("Telefono: ");
                    String telefono = scanner.next();
                    if(type.equals("s")) {
                        System.out.println("Descrizione: ");
                        String descrizione = scanner.next();
                        controller.register(idR, passR, nome, cognome, email, telefono, descrizione);
                        break;
                    }
                    controller.register(idR, passR, nome, cognome, email, telefono);
                    break;
                case 3:
                    System.out.println("CHIUSURA IN CORSO ...");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }while(scelta != 3);
    }
}
