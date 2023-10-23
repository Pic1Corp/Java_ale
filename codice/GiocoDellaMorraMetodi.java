import java.util.Random;
import java.util.Scanner;

public class GiocoDellaMorraMetodi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char scelta, sceltaComputer;
        int risultato, manche, vittorieGiocatore = 0, vittorieComputer = 0;
        System.out.println("Inserisci il numero di manche da giocare: ");
        manche = input.nextInt();
        input.nextLine();
        for(int i = 0; i < manche; i++) {
            System.out.println("Inserisci la tua scelta: (s/c/f)");
            scelta = input.nextLine().toLowerCase().charAt(0);
            sceltaComputer = mossaComputer();
            System.out.println("Il computer sceglie " + sceltaComputer);
            risultato = vincitore(scelta, sceltaComputer);
            switch (risultato) {
                case 0 -> {System.out.println("Vince il giocatore."); vittorieGiocatore++;}
                case 1 -> {System.out.println("Vince il computer."); vittorieComputer++;}
                case 2 -> System.out.println("Pareggio.");
                case -1 -> {
                    System.out.println("Qualcosa è andato storto. ");
                    return;
                }
            }
        }
        input.close();
        System.out.print("Il vincitore è: " + (vittorieGiocatore > vittorieComputer ? "Il giocatore " : vittorieGiocatore < vittorieComputer ? "Il computer " : "Nessuno, pareggio."));
        if(vittorieGiocatore != vittorieComputer)
            System.out.println("di " + Math.max(vittorieGiocatore, vittorieComputer) + " punti.");
    }
    public static char mossaComputer() {
        Random rand = new Random();
        int num = rand.nextInt(3);
        return switch (num) {
            case 0 -> 's';
            case 1 -> 'c';
            case 2 -> 'f';
            default -> ' ';
        };
    }
    public static int vincitore(char a, char b) {

        return switch (a) {
            case 's' -> switch (b) {
                case 's' -> 2;
                case 'c' -> 1;
                default -> 0;
            };
            case 'c' -> switch (b) {
                case 's' -> 0;
                case 'c' -> 2;
                default -> 1;
            };
            case 'f' -> switch (b) {
                case 's' -> 1;
                case 'c' -> 0;
                default -> 2;
            };
            default -> -1;
        };
    }
}