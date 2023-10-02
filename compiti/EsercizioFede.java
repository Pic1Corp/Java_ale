import java.util.Scanner;

public class EsercizioFede{
    public static void main(String[] args) {
        int num1, num2;
        int risultato = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci il numero 1: ");
        num1 = input.nextInt();
        System.out.println("inserisci il numero 2: ");
        num2 = input.nextInt();

        for (int i = 0; i < num2; i++) {
            risultato += num1;
        }

        System.out.println("il risultato è: " + risultato);
    }
}
