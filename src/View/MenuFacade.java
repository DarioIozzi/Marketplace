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
            Scanner scanner = new Scanner(System.in);
            System.out.println("Benvenuto nella nostra applicazione!");
            System.out.println("Sei un cliente o un venditore?");
            System.out.println("1. Login");
            System.out.println("2. Registrazione");
            System.out.println("3. Chiudi applicazione");
            System.out.println("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("LOGIN");
                    // fixme da fare
                    break;
                case 2:
                    System.out.println("REGISTRAZIONE");
                    // fixme da fare
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
