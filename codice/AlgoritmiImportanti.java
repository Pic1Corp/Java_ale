public class AlgoritmiImportanti {
    public static void main(String[] args) {
    }

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
}
