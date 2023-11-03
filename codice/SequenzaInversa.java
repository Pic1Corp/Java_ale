public class SequenzaInversa {

    public static void printInverseSequence(int n) {
        if (n <= 0) {
            System.out.println("Inserire un numero intero positivo.");
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.print(1.0 / i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        System.out.println("L'inverso dei primi " + n + " numeri naturali:");
        printInverseSequence(n);
    }
}
