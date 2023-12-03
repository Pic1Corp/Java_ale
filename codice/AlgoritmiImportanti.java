public class AlgoritmiImportanti {

    /** 
     * trova il valore del primo elemento di un array che ha un valore specifico
     * @param array array di interi da controllare
     * @param value valore da cercare
     * @return indice dell'elemento trovato oppure -1 se non è stato trovato
     */
    public static int RicercaSequenziale(int[] array, int value) {
        for (int i=0; i<array.length; i++){
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    
    /** 
     * trova il valore minimo in un array
     * @param array array di interi da controllare
     * @return int valore minimo
     */
    public static int RicercaPosMinimo(int[] array) {
        int posmin=0, min=array[0];
        for (int i=1; i<array.length; i++){
            if(array[i] < min) {
                posmin = i;
                min=array[i];
            }
        }
        return posmin;
    }

        
        /** 
         * trova il valore massimo in un array
         * @param array array di interi da controllare
         * @return int valore massimo
         */
        public static int RicercaPosMassimo(int[] array) {
        int posmax=0, max=array[0];
        for (int i=1; i<array.length; i++){
            if(array[i] > max) {
                posmax = i;
                max = array[i];
            }
        }
        return posmax;
    }

    
    /** 
     * ordina un array in modo crescente
     * @param array array da ordinare
     * @return int[] array ordinato
     */
    public static int[] ordinaArray(int[] array) {
        int temp=0;
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    
    /** 
     * ordina l'array con il bubble sort
     * @param arr[] array da ordinare
     */
    public static int[] bubbleSort(int arr[]) { 
        int LunghezzaArray = arr.length; 
        for (int i = 0; i < LunghezzaArray - 1; i++) 
            for (int j = 0; j < LunghezzaArray - i - 1; j++) 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                }
        return arr;
    } 

    
    /** 
     * trova l'indice del valore da cercare in un array
     * @param array[] array da controllare
     * @param ValoreCercare valore da cercare nell'array
     * @param low posizione da cui inizia la ricerca
     * @param high posizione dove finisce la ricerca
     * @return ritorna l'indice del numero all'interno dell'array e se -1 se non esiste il valore all'interno dell'array
     */
    public static int binarySearch(int array[], int ValoreCercare, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
        if (array[mid] == ValoreCercare)
            return mid;
        if (array[mid] < ValoreCercare)
            low = mid + 1;
        else
            high = mid - 1;
        }
        return -1;
    }

    /**
     * Sposta gli elementi dell'array di interi fornito verso destra di una posizione.
     * L'elemento più a destra verrà spostato nella posizione seconda da destra,
     * e così via. L'elemento più a sinistra rimane invariato.
     *
     * @param array l'array di interi da spostare.
     */
    public static void shiftDx(int[] array, int pos) {
        for (int i = array.length - 1; i > pos; i--) {
            array[i] = array[i - 1];
        }
    }    

    /**
     * Sposta gli elementi dell'array di interi fornito verso sinistra di una posizione.
     * L'elemento più a sinistra verrà spostato nella posizione seconda da sinistra,
     * e così via. L'elemento più a destra rimane invariato.
     *
     * @param array l'array di interi da spostare.
     */
    public static void shiftSx(int[] array, int pos){
        for (int i=pos; i<array.length-1; i++){
            array[i] = array[i+1];
        }
    }

    /**
     * Esegue una rotazione verso destra degli elementi dell'array di interi fornito.
     * L'elemento più a destra viene spostato nella posizione più a sinistra, e
     * gli altri elementi vengono spostati di una posizione verso destra.
     *
     * @param array l'array di interi da sottoporre a rotazione.
     */
    public static void rotazioneDx(int[] array, int pos){
        int temp=array[array.length-1];
        shiftDx(array, pos);
        array[0]=temp;
    }

    /**
     * Esegue una rotazione verso sinistra degli elementi dell'array di interi fornito.
     * L'elemento più a sinistra viene spostato nella posizione più a destra, e
     * gli altri elementi vengono spostati di una posizione verso sinistra.
     *
     * @param array l'array di interi da sottoporre a rotazione.
     */
    public static void rotazioneSx(int[] array, int pos){
        int temp=array[0];
        shiftSx(array, pos);
        array[array.length-1]=temp;
    }

    public static void inserisciNumeriInArray(int[] array, int n, int posizione){
        shiftDx(array, posizione);
        array[posizione]=n;
    }
}
