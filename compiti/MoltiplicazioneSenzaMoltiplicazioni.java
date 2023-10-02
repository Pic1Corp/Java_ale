public class MoltiplicazioneSenzaMoltiplicazioni {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int risultato = 0;

        for (int i = 0; i < num2; i++) {
            risultato += num1;
        }

        System.out.println("Il risultato della moltiplicazione è: " + risultato);
    }
}