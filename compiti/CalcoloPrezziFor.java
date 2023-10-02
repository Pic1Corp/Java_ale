import java.util.Scanner;

public class CalcoloPrezziFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di prodotti: ");
        int numeroProdotti = input.nextInt();

        double prezzoTotale = 0;
        double prezzoMinimo = Double.MAX_VALUE;
        double prezzoMassimo = Double.MIN_VALUE;

        for (int i = 1; i <= numeroProdotti; i++) {
            System.out.print("Inserisci il prezzo del prodotto " + i + ": ");
            double prezzo = input.nextDouble();

            prezzoTotale += prezzo;

            if (prezzo < prezzoMinimo) {
                prezzoMinimo = prezzo;
            }

            if (prezzo > prezzoMassimo) {
                prezzoMassimo = prezzo;
            }
        }

        double prezzoMedio = prezzoTotale / numeroProdotti;

        System.out.println("Il prezzo totale è: " + prezzoTotale);
        System.out.println("Il prezzo medio è: " + prezzoMedio);
        System.out.println("Il prezzo massimo è: " + prezzoMassimo);
        System.out.println("Il prezzo minimo è: " + prezzoMinimo);

        input.close();
    }
}