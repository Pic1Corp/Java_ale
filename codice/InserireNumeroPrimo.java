import java.util.Scanner;

public class InserireNumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPrimo = true;
        int numero;

        do{
            isPrimo = true;
            System.out.print("Inserisci un numero intero positivo: ");
            numero = input.nextInt();
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
        }while(isPrimo == false);

        System.out.println(numero + " è un numero primo.");

        input.close();
    }
}