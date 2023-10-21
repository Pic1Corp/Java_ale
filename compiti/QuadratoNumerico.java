public class QuadratoNumerico {
    // Metodo per stampare un quadrato numerico
    public static void stampaQuadrato(int lato) {
        int[][] matrice = new int[lato][lato];
        int numero = 1;

        for (int i = 0; i < lato; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < lato; j++) {
                    matrice[i][j] = numero++;
                }
            } else {
                for (int j = lato - 1; j >= 0; j--) {
                    matrice[i][j] = numero++;
                }
            }
        }

        // Stampa della matrice
        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int lato = 5; // Inserisci qui la lunghezza del lato del quadrato numerico

        System.out.println("Quadrato numerico con lato " + lato + ":");
        stampaQuadrato(lato);
    }
}
