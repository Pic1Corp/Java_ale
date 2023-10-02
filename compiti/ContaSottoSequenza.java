import java.util.Scanner;

public class ContaSottoSequenza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sequenza = input.nextLine();
        int conteggioMassimo = 0;
        int conteggioCorrente = 0;

        for (int i = 0; i < sequenza.length(); i++) {
            char carattere = sequenza.charAt(i);
            if (carattere == '*') {
                conteggioCorrente++;
                if (conteggioCorrente > conteggioMassimo) {
                    conteggioMassimo = conteggioCorrente;
                }
            }
            else if (carattere != '?' && carattere != '*') {
                break;
            }
            else {
                conteggioCorrente = 0;
            }
        }

        System.out.println("La lunghezza della più lunga sotto-sequenza di '*' di fila è: " + conteggioMassimo);
    }
}