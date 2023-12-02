import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mastermind {
    private static Random rd = new Random();
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean sequenzaIndovinata = false;
        char[] colori = {'b', 'a', 'v', 'm', 'g', 'r', 'n', 'f', 'c'};
        sequenzaDiColoriDaIndovinare(colori);
        char[] sequenzaDaIndovinare = generaColoriDaIndovinare(colori);
        while (!sequenzaIndovinata) {
            char[] sequenzaUtente = sceltaColoriUtente(colori, sequenzaDaIndovinare);
            int[] conteggioColoriIndovinati = verificaSequenza(sequenzaDaIndovinare, sequenzaUtente);
            stampaIndovinati(conteggioColoriIndovinati, sequenzaDaIndovinare, sequenzaUtente);
            sequenzaIndovinata = conteggioColoriIndovinati[1] == sequenzaDaIndovinare.length;
        }
        System.out.println("Congratulazioni! Hai indovinato la sequenza. Il programma termina.");
    }

    /**
     * Genera una sequenza casuale di colori da indovinare.
     *
     * @param coloriDisponibili Array dei colori disponibili.
     * @return Sequenza casuale di colori.
     */
    public static char[] generaColoriDaIndovinare(char[] coloriDisponibili) {
        char[] sequenzaDaIndovinare = new char[5];
        int index;
        for (int i = 0; i < sequenzaDaIndovinare.length; i++) {
            index = rd.nextInt(coloriDisponibili.length);
            sequenzaDaIndovinare[i] = coloriDisponibili[index];
        }
        return sequenzaDaIndovinare;
    }

    /**
     * Permette all'utente di inserire una sequenza di colori.
     *
     * @param coloriDisponibili   Array dei colori disponibili.
     * @param sequenzaDaIndovinare La sequenza da indovinare.
     * @return Sequenza inserita dall'utente.
     */
    public static char[] sceltaColoriUtente(char[] coloriDisponibili, char[] sequenzaDaIndovinare) {
        char[] sequenzaDellUtente = new char[5];
        int index = 0;
        char input;
        while (index < 5) {
            System.out.println("Inserisci il " + (index + 1) + "° colore");
            input = in.nextLine().charAt(0);
            if (input == 'x') {
                System.out.println(Arrays.toString(sequenzaDaIndovinare));
            } else if (esisteColore(coloriDisponibili, input)) {
                sequenzaDellUtente[index] = input;
                index++;
            }
        }
        return sequenzaDellUtente;
    }

    /**
     * Verifica la sequenza inserita dall'utente rispetto a quella da indovinare.
     *
     * @param sequenzaDaIndovinare La sequenza da indovinare.
     * @param sequenzaUtente       La sequenza inserita dall'utente.
     * @return Un array con il conteggio dei colori indovinati.
     * [0] rappresenta il totale dei colori indovinati, [1] rappresenta la posizione corretta.
     */
    public static int[] verificaSequenza(char[] sequenzaDaIndovinare, char[] sequenzaUtente) {
        int[] conteggioColoriIndovinati = new int[2];
        for (int i = 0; i < sequenzaDaIndovinare.length; i++) {
            for (int j = 0; j < sequenzaDaIndovinare.length; j++) {
                if (sequenzaDaIndovinare[i] == sequenzaUtente[j]) {
                    conteggioColoriIndovinati[0]++;
                    if (i == j)
                        conteggioColoriIndovinati[1]++;
                }
            }
        }
        return conteggioColoriIndovinati;
    }

    /**
     * Verifica se un colore è presente nell'array dei colori disponibili.
     *
     * @param coloriDisponibili Array dei colori disponibili.
     * @param colore            Colore da verificare.
     * @return True se il colore è presente, False altrimenti.
     */
    public static boolean esisteColore(char[] coloriDisponibili, char colore) {
        for (int i = 0; i < coloriDisponibili.length; i++) {
            if (coloriDisponibili[i] == colore)
                return true;
        }
        return false;
    }

    /**
     * Stampa i risultati dell'indovinamento.
     *
     * @param indovinati          Array con il conteggio dei colori indovinati.
     * @param sequenzaDaIndovinare La sequenza da indovinare.
     * @param sequenzaUtente       La sequenza inserita dall'utente.
     */
    public static void stampaIndovinati(int[] indovinati, char[] sequenzaDaIndovinare, char[] sequenzaUtente) {
        char vuoto = 77;
        char pieno = 73;
        boolean[] giaIndovinato = new boolean[sequenzaDaIndovinare.length];
        if (indovinati[0] > 0 || indovinati[1] > 0) {
            stampaRisultato(indovinati, sequenzaDaIndovinare, sequenzaUtente, vuoto, pieno, giaIndovinato);
        } else {
            stampaNessunIndovinamento();
        }
    }

    /**
     * Stampa il risultato dell'indovinamento.
     *
     * @param indovinati          Array con il conteggio dei colori indovinati.
     * @param sequenzaDaIndovinare La sequenza da indovinare.
     * @param sequenzaUtente       La sequenza inserita dall'utente.
     * @param vuoto               Il carattere rappresentante un colore indovinato ma in posizione errata.
     * @param pieno               Il carattere rappresentante un colore indovinato in posizione corretta.
     * @param giaIndovinato       Array di booleani per tracciare i colori già indovinati.
     */
    public static void stampaRisultato(int[] indovinati, char[] sequenzaDaIndovinare, char[] sequenzaUtente, char vuoto, char pieno, boolean[] giaIndovinato) {
        for (int i = 0; i < sequenzaUtente.length; i++) {
            char carattereUtente = sequenzaUtente[i];
            if (giaIndovinato[i]) {
                // Carattere già indovinato, passa al successivo
                continue;
            }
            for (int j = 0; j < sequenzaDaIndovinare.length; j++) {
                char carattereDaIndovinare = sequenzaDaIndovinare[j];
                if (!giaIndovinato[j] && carattereUtente == carattereDaIndovinare) {
                    // Indovinato il carattere
                    stampaCarattereIndovinato(j, indovinati, vuoto, pieno);
                    giaIndovinato[j] = true;
                    break;
                }
            }
        }
        System.out.println();
    }

    /**
     * Stampa il carattere indovinato.
     *
     * @param j         Indice del carattere indovinato nella sequenza da indovinare.
     * @param indovinati Array con il conteggio dei colori indovinati.
     * @param vuoto     Il carattere rappresentante un colore indovinato ma in posizione errata.
     * @param pieno     Il carattere rappresentante un colore indovinato in posizione corretta.
     */
    public static void stampaCarattereIndovinato(int j, int[] indovinati, char vuoto, char pieno) {
        if (j < indovinati[1]) {
            System.out.print(pieno);
        } else if (j < indovinati[0]) {
            System.out.print(vuoto);
        }
    }


    /**
     * Stampa un messaggio nel caso in cui non ci siano indovinamenti.
     */
    public static void stampaNessunIndovinamento() {
        System.out.println("Nessun indovinamento.");
    }

    /**
     * Stampa la sequenza di colori da indovinare (solo per debugging).
     *
     * @param sequenzaDaIndovinare La sequenza da indovinare.
     */
    public static void sequenzaDiColoriDaIndovinare(char[] sequenzaDaIndovinare) {
        System.out.println(Arrays.toString(sequenzaDaIndovinare));
    }
}