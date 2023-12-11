import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Esercitazione{
    public static Random rd = new Random();
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int dadiAttuali, punteggioUtente=0, punteggioComputer=0;
        do {
            dadiAttuali = scheltaDadiAttuali();
        } while (dadiAttuali<6 || dadiAttuali>10);
        int[] dadiGiocatore = new int[dadiAttuali];
        int[] dadiComputer = new int[dadiAttuali];
        int[] arraySequenzaComputer = new int[6];
        int[] arraySequenzaGiocatore = new int[6];
        do {
            lanciaDadi(dadiGiocatore, dadiComputer);
            arraySequenzaComputer = generaSequenza(dadiComputer);
            punteggioComputer = punteggioComputer + calcoloPunteggio(arraySequenzaComputer);
            do {
                arraySequenzaGiocatore = sceltaSequenzagiocatore(dadiGiocatore);
            } while (controlloSequenzaUtente(dadiGiocatore, arraySequenzaGiocatore) == false);
            punteggioUtente = punteggioUtente + calcoloPunteggio(arraySequenzaGiocatore);
            System.out.println("punteggio giocatore: " + punteggioUtente);
            System.out.println("punteggio computer: " + punteggioComputer);
        } while (punteggioComputer < 100 && punteggioUtente < 100);
        if(punteggioComputer == 100)
            System.out.println("Ha vinto il computer");
        else
            System.out.println("hai vinto");
    }

    public static int scheltaDadiAttuali(){
        System.out.println("Quanti dadi vuoi lanciare?\nMassimo 10 minimo 6");
        return in.nextInt();
    }

    public static void lanciaDadi(int[] dadiGiocatore, int[] dadiComputer){
        for (int i = 0; i < dadiComputer.length; i++) {
            dadiGiocatore[i] = rd.nextInt(6)+1;
            dadiComputer[i] = rd.nextInt(6)+1;
        }
    }
    
    public static int[] generaSequenza(int[] array){
        int[] arraySequenza = new int[6];
        int numeroAttualeSequenza=0;
        arraySequenza[numeroAttualeSequenza] = ricercaMinore(array);
        numeroAttualeSequenza++;
        for (int i = 1; i < array.length; i++) {
            if(array[i] == arraySequenza[numeroAttualeSequenza]+1){
                arraySequenza[numeroAttualeSequenza] = array[i];
                numeroAttualeSequenza++;
            }
        }
        return arraySequenza;
    }

    public static int calcoloPunteggio(int[] array){
        int punteggio=0;
        for (int i = ricercaMinoreIndice(array); i < array.length; i++) {
            if (array[i] == 0)
                break;
            else
                punteggio = punteggio + 5;
        }
        if (punteggio == 5)
            punteggio = 0;
        return punteggio;
    }

    public static int ricercaMinore(int[] array){
        int minore = array[0], indicePosizioneMinore=0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > minore){
                minore = array[i];  
                indicePosizioneMinore=i;
            }
        return array[indicePosizioneMinore];
    }

    public static int ricercaMinoreIndice(int[] array){
        int minore = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] < minore && array[i] != 0)
                minore = array[i];  
        return ricercaNumero(array, minore);
    }

    public static int ricercaNumero(int[] array, int numero){
        for (int i = 0; i < array.length; i++)
            if (array[i] == numero)
                return i; 
        return -1;
    }

    public static int[] sceltaSequenzagiocatore(int[] array){
        int[] scelta = new int[6];
        int input;
        System.out.println("Questa sono i tuoi numeri: "+Arrays.toString(array));
        System.out.println("Inserisci la sequenza: (se hai finito di inserire la sequenza digita 0)");
        for (int i = 0; i < scelta.length; i++) {
            System.out.println("inserisci il tuo " + (i+1) + " numero");
            input = in.nextInt();
            if (input == 0)
                break;
            else
                scelta[i] = input;
        }
        return scelta;
    }

    public static boolean controlloSequenzaUtente(int[] arrayNumeri, int[]arrayScelta){
        for (int i = 0; i < arrayScelta.length; i++) {
            if(arrayScelta[i] != 0){
                if (esisteNumero(arrayScelta, arrayNumeri[i]))
                    continue;
                else
                System.out.println("sequenza errata");
                    return false;
            }
        }
        System.out.println("sequenza corretta");
        return true;
    }

    public static boolean esisteNumero(int[] array, int numero){
        for (int i = 0; i < array.length; i++)
            if (array[i] == numero)
                return true; 
        return false;
    }
}