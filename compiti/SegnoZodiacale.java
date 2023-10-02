import java.util.Scanner;

public class SegnoZodiacale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il giorno di nascita: ");
        int giorno = input.nextInt();

        System.out.print("Inserisci il mese di nascita (in numero): ");
        int mese = input.nextInt();

        if ((mese == 2 && giorno >= 20 && giorno <= 29) || (mese == 3 && giorno >= 1 && giorno <= 20)) {
            System.out.println("La persona è del segno dei Pesci.");
        } else {
            System.out.println("La persona non è del segno dei Pesci.");
        }
    }
}