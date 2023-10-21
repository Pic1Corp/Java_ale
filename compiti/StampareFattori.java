import java.util.Scanner;

public class StampareFattori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();

        System.out.println("I fattori di " + numero + " sono:");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}