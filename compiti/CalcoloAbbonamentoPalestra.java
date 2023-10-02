import java.util.Scanner;

public class CalcoloAbbonamentoPalestra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di mesi: ");
        int numeroMesi = input.nextInt();

        System.out.print("Inserisci il sesso (M/F): ");
        char sesso = input.next().charAt(0);

        System.out.print("Inserisci la fascia oraria (1/2): ");
        int fasciaOraria = input.nextInt();

        double costoMensile;

        if (sesso == 'M') {
            if (fasciaOraria == 1) {
                costoMensile = 10;
            } else {
                costoMensile = 15;
            }
        } else {
            if (fasciaOraria == 1) {
                costoMensile = 7;
            } else {
                costoMensile = 11;
            }
        }

        double costoAbbonamento = costoMensile * numeroMesi;

        if (numeroMesi > 6) {
            costoAbbonamento *= 0.75; // Sconto del 25%
        } else if (numeroMesi > 3) {
            costoAbbonamento *= 0.85; // Sconto del 15%
        }

        System.out.println("Il costo dell'abbonamento è: " + costoAbbonamento + " €");

        input.close();
    }
}