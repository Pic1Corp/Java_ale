public class Test1 {
    /** 
     * trova il valore del primo elemento di un array che ha un valore specifico
     * @param array array di interi da controllare
     * @param value valore da cercare
     * @return indice dell'elemento trovato oppure -1 se non è stato trovato
     */
    public static int RicercaSequenziale(int[] array, int value) {
        for(int i=0; i<array.length; i++){
            if(value==array[i])
                return i;
        }
        return -1;
    }

    /** 
     * trova il valore minimo in un array
     * @param array array di interi da controllare
     * @return int valore minimo
     */
    public static int RicercaPosMinimo(int[] array) {
        int vMin=array[0];
        for(int i=1;i<array.length; i++){
            if (vMin>array[i]){
                vMin=array[i];
            }
        }
        return vMin;
    }

    /** 
     * trova il valore massimo in un array
     * @param array array di interi da controllare
     * @return int valore massimo
     */
    public static int RicercaPosMassimo(int[] array) {
        int vMax=array[0];
        for(int i=1;i<array.length; i++){
            if (vMax<array[i]){
                vMax=array[i];
            }
        }
        return vMax;
    }

    /** 
     * ordina un array in modo crescente
     * @param array array da ordinare
     * @return int[] array ordinato
     */
    public static int[] seleSort(int[] array) {
        int temp;
        for(int i=0; i<array.length;i++){
            for (int j = 0; j < array.length; j++) {
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    /** 
     * ordina l'array con il bubble sort
     * @param arr[] array da ordinare
     */
    public static int[] bubleSort(int array[]) { 
        boolean ordinato;
        int temp;
        do {
            ordinato=true;
            for(int i=array.length-1; i>0; i--){
                if(array[i-1]>array[i]){
                    temp=array[i];
                    array[i]=array[i-1];
                    array[i-1]=temp;
                    ordinato=false;
                }
            }
        } while (!ordinato);
        return array;
    }

    public static int[] bubleSortPico(int arr[]) { 
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
     * @param minimo posizione da cui inizia la ricerca
     * @param massimo posizione dove finisce la ricerca
     * @return ritorna l'indice del numero all'interno dell'array e se -1 se non esiste il valore all'interno dell'array
     */
    public static int binarySearch(int array[], int ValoreCercare, int minimo, int massimo) {
        int middle;
        do {
            middle=(minimo+massimo)/2;
            if(ValoreCercare== array[middle])
                    return middle;
                if (ValoreCercare<array[middle]) 
                    massimo=middle-1;
                else
                    minimo=middle+1;
        } while (massimo>=minimo);
        return -1;
    }

    /**
     * Sposta gli elementi dell'array di interi fornito verso destra di una posizione.
     * L'elemento più a destra verrà spostato nella posizione seconda da destra,
     * e così via. L'elemento più a sinistra rimane invariato.
     *
     * @param array l'array di interi da spostare.
     * @param pos la posizione di partenza per lo spostamento
     * @return int[] l'array di interi spostato
     */
    public static int[] shiftDx(int[] array, int pos) {
        for(int i= array.length-1; i>0;i--)
                array[i]=array[i-1];
        return array;
    }

    /**
     * Sposta gli elementi dell'array di interi fornito verso sinistra di una posizione.
     * L'elemento più a sinistra verrà spostato nella posizione seconda da sinistra,
     * e così via. L'elemento più a destra rimane invariato.
     *
     * @param array l'array di interi da spostare.
     * @param pos la posizione di partenza per lo spostamento
     * @return int[] l'array di interi spostato
     */
    public static int[] shiftSx(int[] array, int pos){
        for (int i=pos; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        return array;
    }

    /**
     * Esegue una rotazione verso sinistra degli elementi dell'array di interi fornito.
     * L'elemento più a sinistra viene spostato nella posizione più a destra, e
     * gli altri elementi vengono spostati di una posizione verso sinistra.
     *
     * @param array l'array di interi da sottoporre a rotazione.
     * @param pos la posizione di partenza per lo spostamento
     * @return int[] l'array di interi spostato
     */
    public static int[] rotazioneSx(int[] array, int pos){
        int temp=array[0];
        shiftSx(array, pos);
        array[array.length-1]=temp;
        return array;
    }
}