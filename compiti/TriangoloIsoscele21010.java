public class TriangoloIsoscele21010 {
    // Metodo per stampare un triangolo isoscele in base all'altezza data
    public static void stampaTriangolo(int altezza) {
        for (int i = 1; i <= altezza; i++) {
            for (int j = 1; j <= altezza - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int altezza = 5; // Inserisci qui l'altezza desiderata del triangolo isoscele

        System.out.println("Triangolo isoscele con altezza " + altezza + ":");
        stampaTriangolo(altezza);
    }
}
