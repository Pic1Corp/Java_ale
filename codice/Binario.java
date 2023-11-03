import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero decimale: ");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = "";

        // Conversione da decimale a binario e memorizzazione
        while (decimal > 0) {
            int bit = decimal % 2;
            binary = bit + binary;
            decimal /= 2;
        }

        // Stampa il numero binario al contrario
        System.out.println("Numero binario al contrario: " + binary);
    }
}
