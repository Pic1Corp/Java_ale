import java.util.Scanner;

public class LeggiCarattereAlfabetico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char carattere;

        do {
            System.out.print("Inserisci un carattere alfabetico: ");
            carattere = scanner.next().charAt(0);
        } while(carattere >= 'a' && carattere <= 'z' || carattere >= 'A' && carattere <= 'Z');

        System.out.println("Hai inserito il carattere alfabetico: " + carattere);

        scanner.close();

    }
}
