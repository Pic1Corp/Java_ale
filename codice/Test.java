import java.util.Arrays;
import java.util.Random;

class Test{
    public static void main(String[] args) {
        //dichiaro l'array con le lettera di riferimento
        char[] array = {'a', 'b', 'c'};
        //array con le lettere in posizione casuale
        char[] arrayGenerato = test(array);
        //mando a schermo arrayGenerato con la libreria Arrays
        System.out.println(Arrays.toString(arrayGenerato));
    }

    public static char[] test (char[] array){
        // creo l'oggetto random
        Random rd = new Random();
        // dichiaro l'array con le lettere da generare
        char[] arrayGenerato = new char[5];
        //loop per riempiere l'array
        for (int i = 0; i < arrayGenerato.length; i++)
            // posizione nella posizione i un lettera presa dall'array di riferimento (parametro)
            arrayGenerato[i] = array[rd.nextInt(3)];
        // ritoro l'array generato
        return arrayGenerato;
    } 
}