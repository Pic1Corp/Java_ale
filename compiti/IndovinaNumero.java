import java.util.Random;
import java.util.Scanner;

public class IndovinaNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroCasuale = random.nextInt(100) + 1;
        int tentativi = 7;

        System.out.println("Indovina il numero compreso tra 1 e 100!");

        while (tentativi > 0) {
            System.out.print("Tentativo rimanenti: " + tentativi + ". Inserisci un numero: ");
            int numeroInserito = input.nextInt();

            if (numeroInserito == numeroCasuale) {
                System.out.println("Complimenti! Hai indovinato il numero!");
                break;
            }
            else if (numeroInserito < numeroCasuale) {
                System.out.println("Il numero inserito è troppo piccolo.");
            }
            else {
                System.out.println("Il numero inserito è troppo grande.");
            }

            tentativi--;
        }

        if (tentativi == 0) {
            System.out.println("Hai terminato i tentativi. Il numero da indovinare era: " + numeroCasuale);
        }

        input.close();
    }
}