public class NumeriPerfetti {

    public static boolean isNumeroPerfetto(int numero) {
        int sommaDivisori = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sommaDivisori += i;
            }
        }

        return sommaDivisori == numero;
    }

    public static void main(String[] args) {
        int limiteSuperiore = 10000; // Puoi cambiare il limite superiore a tuo piacimento

        System.out.println("Numeri perfetti fino a " + limiteSuperiore + ":");

        for (int i = 2; i <= limiteSuperiore; i++) {
            if (isNumeroPerfetto(i)) {
                System.out.println(i);
            }
        }
    }
}
