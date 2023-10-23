//buongiorno prof io non so programmare in c perchè non l'ho mai fatto quindi l'ho fatto in java
import java.util.Scanner;

public class TipoTriangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza del lato A:");
        double A = input.nextDouble();
        System.out.println("Inserisci la lunghezza del lato B:");
        double B = input.nextDouble();
        System.out.println("Inserisci la lunghezza del lato C:");
        double C = input.nextDouble();

        // Verifica se i lati A, B e C formano un triangolo valido
        if (A > 0 && B > 0 && C > 0 && A + B > C && A + C > B && B + C > A) {
            if (A == B && B == C) {
                System.out.println("Il triangolo è equilatero.");
            } else if (A == B || B == C || A == C) {
                System.out.println("Il triangolo è isoscele.");
            } else {
                // Verifica se il triangolo è rettangolo usando il teorema di Pitagora
                double[] lati = {A, B, C};
                java.util.Arrays.sort(lati);
                if (Math.pow(lati[0], 2) + Math.pow(lati[1], 2) == Math.pow(lati[2], 2)) {
                    System.out.println("Il triangolo è rettangolo.");
                } else {
                    System.out.println("Il triangolo è scaleno.");
                }
            }
        } else {
            System.out.println("I lati inseriti non formano un triangolo valido.");
        }

        input.close();
    }
}
