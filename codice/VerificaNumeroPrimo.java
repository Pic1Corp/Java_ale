//Stabilire se un numero è primo
import java.util.Scanner;

public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero positivo: ");
        int numero = input.nextInt();
        input.close();

        boolean isPrimo = true;

        if (numero <= 1) 
            isPrimo = false;
        else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        if (isPrimo) {
            System.out.println(numero + " è un numero primo.");
        } else {
            System.out.println(numero + " non è un numero primo.");
        }
    }
}
