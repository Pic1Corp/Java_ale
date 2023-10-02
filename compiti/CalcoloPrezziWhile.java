import java.util.Scanner;

public class CalcoloPrezziWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di prodotti: ");
        int numProdotti = input.nextInt();

        double prezzoTotale = 0;
        double prezzoMedio;
        double prezzoMassimo = Double.MIN_VALUE;
        double prezzoMinimo = Double.MAX_VALUE;

        int count = 1;
        while (count <= numProdotti) {
            System.out.print("Inserisci il prezzo del prodotto " + count + ": ");
            double prezzo = input.nextDouble();

            prezzoTotale += prezzo;

            if (prezzo > prezzoMassimo) {
                prezzoMassimo = prezzo;
            }

            if (prezzo < prezzoMinimo) {
                prezzoMinimo = prezzo;
            }

            count++;
        }

        prezzoMedio = prezzoTotale / numProdotti;

        System.out.println("Prezzo totale: " + prezzoTotale);
        System.out.println("Prezzo medio: " + prezzoMedio);
        System.out.println("Prezzo massimo: " + prezzoMassimo);
        System.out.println("Prezzo minimo: " + prezzoMinimo);

        input.close();
    }
}