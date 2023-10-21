import java.util.Scanner;

public class Quadrato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int lato = input.nextInt();

        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}