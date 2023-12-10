import java.util.Random;
public class ControlloTerna {
    public static void main(String[] args) {
        int[] array = new int[5];
        inizialliazaArray(array);
        int[] arraySceltiNumeri = {1, 2, 3, 4, 5};
        System.out.println(isTerna(array, arraySceltiNumeri));
    }

    public static void inizialliazaArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(91);
        }
    }

    public static boolean isTerna(int[] arrayNumeriIndovinati, int[] arraySceltiNumeri) {
        int numeriIndovinatiNellaTerna = 0;
        for (int numero : arrayNumeriIndovinati) {
            for (int scelto : arraySceltiNumeri) {
                if (numero == scelto) {
                    numeriIndovinatiNellaTerna++;
                    break;  // Esci dal ciclo interno se trovi una corrispondenza
                }
            }
        }
        // Verifica se hai almeno 3 numeri indovinati nella terna
        return numeriIndovinatiNellaTerna >= 3;
    }
    
}
