import java.util.Scanner;

public class Fattoriale5E10InputControllato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = scanner.nextInt();

        if (Math.abs(numero) >= 5 && Math.abs(numero) <= 10) {
            long fattoriale = calcolaFattoriale(Math.abs(numero));
            System.out.println("Il fattoriale di " + Math.abs(numero) + " è: " + fattoriale);
        } else {
            System.out.println("Il numero inserito non rientra nell'intervallo consentito.");
        }
        scanner.close();
    }

    private static long calcolaFattoriale(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
