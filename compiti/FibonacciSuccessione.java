import java.util.Scanner;

public class FibonacciSuccessione {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        do{
            System.out.println("Inserisci il numero di numeri generati: ");
            n = in.nextInt();
        } while(n <= 2);

        int prec1 = 0; int prec2 = 1;

        for(int i = 0; i < n; i++) {
            int current = prec1 + prec2;
            System.out.println(current);
            prec1 = prec2;
            prec2 = current;
        }

        in.close();
    }
}
