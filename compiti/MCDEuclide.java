import java.util.Scanner;

public class MCDEuclide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b;

        do {
            System.out.println("Inserisci il primo numero: ");
            a = input.nextDouble();
        }while (a <= 0);
        do {
            System.out.println("Inserisci il secondo numero: ");
            b = input.nextDouble();
        } while(b <= 0);

        if(b < a) {
            double c = a;
            a = b;
            b = c;
        }

        while (b != 0) {
            double r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);

        input.close();
    }
}