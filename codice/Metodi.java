import java.util.example;

/**
 * Questa classe illustra l'implementazione di diversi metodi in Java.
 * I commenti sono inclusi per spiegare il funzionamento di ciascun metodo.
 */
public class Metodi {

    /**
     * Questo metodo restituisce la somma di due numeri interi.
     *
     * @param a Primo numero intero
     * @param b Secondo numero intero
     * @return Somma di a e b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Questo metodo verifica se un numero è pari o dispari.
     *
     * @param num Il numero da verificare
     * @return True se il numero è pari, altrimenti false
     */
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Questo metodo calcola il fattoriale di un numero intero non negativo.
     *
     * @param n Il numero di cui calcolare il fattoriale
     * @return Fattoriale di n
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Questo metodo stampa un messaggio di saluto personalizzato.
     *
     * @param name Il nome della persona da salutare
     */
    public void greet(String name) {
        System.out.println("Ciao, " + name + "! Benvenuto.");
    }

    /**
     * Metodo principale per avviare l'esecuzione del programma.
     * Può essere utilizzato per testare i vari metodi definiti in questa classe.
     *
     * @param args Argomenti della riga di comando
     */
    public static void main(String[] args) {
        Math example = new Math;

        // Test del metodo add
        int sum = example.add(5, 3);
        System.out.println("La somma è: " + sum);

        // Test del metodo isEven
        int num = 4;
        if (example.isEven(num)) {
            System.out.println(num + " è un numero pari.");
        } else {
            System.out.println(num + " è un numero dispari.");
        }

        // Test del metodo factorial
        int factorialResult = example.factorial(5);
        System.out.println("Il fattoriale di 5 è: " + factorialResult);

        // Test del metodo greet
        example.greet("Mario");
    }
}
