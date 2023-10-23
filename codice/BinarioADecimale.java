import java.util.Scanner;

public class BinarioADecimale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero binario: ");
        String input = scanner.nextLine();

        // Converte il numero binario in decimale
        int decimal = Integer.parseInt(input, 2);
        System.out.println("Il corrispondente decimale è: " + decimal);
        scanner.close();
    }
}
