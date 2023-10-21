public class TavolaPitagorica {
    public static void main(String[] args) {
        int dimensione = 10;

        System.out.println("Tavola Pitagorica (" + dimensione + "x" + dimensione + "):");

        for (int riga = 1; riga <= dimensione; riga++) {
            for (int colonna = 1; colonna <= dimensione; colonna++) {
                int prodotto = riga * colonna;

                System.out.print(prodotto + "\t");
            }
            System.out.println();
        }
    }
}
