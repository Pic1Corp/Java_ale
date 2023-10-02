import java.util.Scanner;

public class CalcolaPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di termini N per il calcolo di π: ");
        int N = input.nextInt();
        input.close();

        double pi = calculatePi(N);

        System.out.println("Il valore approssimato di π con " + N + " termini della serie è: " + pi);
    }

    public static double calculatePi(int N) {
        double pi = 0.0;

        for (int i = 0; i < N; i++) {
            double term = 4.0 / (2 * i + 1);

            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
        }

        return pi;
    }
}
