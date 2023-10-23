import java.util.Random;
import java.util.Scanner;

public class GiocoDellaMorraMetodi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char scelta, pc;
        int win, manche, win1 = 0, win2 = 0;
        System.out.println("Inserisci il numero di manche da giocare: ");
        manche = in.nextInt();
        in.nextLine();
        for(int i = 0; i < manche; i++) {
            System.out.println("Inserisci la tua scelta: (s/c/f)");
            scelta = in.nextLine().toLowerCase().charAt(0);
            pc = mossaComputer();
            System.out.println("il computer sceglie " + pc);
            win = vincitore(scelta, pc);
            switch (win) {
                case 0 -> {System.out.println("Vince il giocatore."); win1++;}
                case 1 -> {System.out.println("Vince il computer."); win2++;}
                case 2 -> System.out.println("Pareggio.");
                case -1 -> {
                    System.out.println("Qualcosa è andato storto. ");
                    return;
                }
            }
            in.close();
        }
        System.out.print("Il vincitore è: " + (win1>win2?"Il giocatore ":win1<win2?"Il computer ":"Nessuno, pareggio."));
        if(win1 != win2)
            System.out.println("di " + Math.max(win1, win2) + "punti.");
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