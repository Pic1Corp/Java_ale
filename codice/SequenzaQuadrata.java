public class SequenzaQuadrata {
    public static void printSquareSequence(int n) {
        if (n < 1) {
            System.out.println("Si prega di inserire un numero intero positivo maggiore di 0.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "*" + i + "=" + i * i);
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Stampa dei quadrati dei primi " + n + " numeri:");
        printSquareSequence(n);
    }
}
