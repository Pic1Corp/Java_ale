import java.util.Scanner;

public class TriangoloIsoscele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la dimensione del lato del triangolo: ");
        int lato = input.nextInt();

        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}