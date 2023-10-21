import java.util.Scanner;

public class CorniceQuadrato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int lato = input.nextInt();

        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                if (i == 0 || i == lato - 1 || j == 0 || j == lato - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}