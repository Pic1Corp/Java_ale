import java.util.Scanner;

public class NumeroPari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Inserisci un numero pari: ");
            numero = scanner.nextInt();
        } while (numero % 2 != 0);

        System.out.println("Hai inserito un numero pari: " + numero);
    }
}