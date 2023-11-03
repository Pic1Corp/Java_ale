public class For {
    public static void main(String[] args) {
        // Esempio di utilizzo del ciclo for in Java

        // Ciclo for per iterare da 0 a 4
        for (int i = 0; i < 5; i++) {
            // Inizio del ciclo for con variabile di controllo 'i' inizializzata a 0
            // Continua il ciclo fintanto che 'i' è minore di 5
            // Incrementa 'i' ad ogni iterazione

            // Stampa il valore di 'i'
            System.out.println("Valore di i: " + i);
        }

        // Esempio con array
        int[] numbers = {2, 4, 6, 8, 10};

        // Ciclo for per iterare attraverso un array
        for (int j = 0; j < numbers.length; j++) {
            // Inizio del ciclo for con variabile di controllo 'j' inizializzata a 0
            // Continua il ciclo fintanto che 'j' è minore della lunghezza dell'array 'numbers'
            // Incrementa 'j' ad ogni iterazione

            // Stampa l'elemento corrente dell'array 'numbers'
            System.out.println("Elemento " + j + " dell'array: " + numbers[j]);
        }
    }
}
