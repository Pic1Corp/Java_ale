public class Tabelline {
    public static void main(String[] args) {
        for (int i = 4; i <= 8; i++) {
            System.out.print("Tabellina del " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                int risultato = i * j;
                System.out.print(i + " x " + j + " = " + risultato);
                if (j < 10) {
                    System.out.print(", "); 
                }
            }
            System.out.println(); 
        }
    }
}
