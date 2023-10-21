public class TabellinaDelSei {
    public static void main(String[] args) {
        int numero = 6;
        int limite = 10; // Puoi cambiare il limite se desideri una tabellina più lunga

        for (int i = 1; i <= limite; i++) {
            int risultato = numero * i;
            System.out.print(risultato + "\t");
        }
    }
}
