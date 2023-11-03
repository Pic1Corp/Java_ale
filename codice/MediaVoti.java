import java.util.Scanner;

public class MediaVoti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo voto: ");
        int Voto1 = input.nextInt();

        System.out.print("Inserisci il secondo voto: ");
        int Voto2 = input.nextInt();

        System.out.print("Inserisci il terzo voto: ");
        int Voto3 = input.nextInt();

        double media = (Voto1 + Voto2 + Voto3) / 3.0;

        String Giudizio;
        if (media < 4.5) {
            Giudizio = "Gravemente insufficiente";
        }
        else if (media < 6.0) {
            Giudizio = "Insufficiente";
        }
        else if (media < 7.5) {
            Giudizio = "Sufficiente";
        }
        else {
            Giudizio = "Buono";
        }

        System.out.println("La media dei voti è: " + media);
        System.out.println("Il giudizio corrispondente è: " + Giudizio);

        input.close();
    }
}