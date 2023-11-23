import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        int[] numeriVincenti = new int[5];
        int[] numeriGiocati = new int[5];
        inserimentoNumeriVincenti(numeriVincenti);
        sceltaNumeri(numeriGiocati);
        stampoVincita(controlloVincita(numeriGiocati, numeriVincenti));
    }
    
    
    /** 
     * inserisce all'intero dell'array i numeri vincenti
     * @param array array con i numeri vincenti
     */
    public static void inserimentoNumeriVincenti(int[] array){
        Random rd = new Random();
        for(int i=0; array.length>i; i++){
            array[i]  = (rd.nextInt(89))+1;
        }
    }

    
    /** 
     * lascia all'utente scegliere i numeri su cui scommettere
     * @param array array con i numeri scelti dall'untente
     */ 
    public static void sceltaNumeri(int[] array){
        Scanner in = new Scanner(System.in);
        int input=0;
        for(int i=0; array.length>i; i++) {
            do {
                System.out.println("Quale è il " + (i+1) + "° numero?");
                input = in.nextInt();
            } while(input<=0 || input>90);
            array[i] = input;
        }
        in.close();
    }

    
    /** 
     * controlla se l'utente ha scelto numeri vincenti
     * @param numGiocati array con i numeri del giocatore
     * @param numVincenti array con i numeri vincenti
     * @return numero di numeri vincenti
     */
    public static int controlloVincita(int[] numGiocati, int[] numVincenti){
        int cont = 0;
        for(int i=0; numGiocati.length>i; i++){
            for(int j=0; numVincenti.length>j; j++){
                if(numGiocati[i] == numVincenti[j]){
                    cont++;
                    break;
                }
            }
        }
        return cont;
    }

    
    /** 
     * manda ha schermo se l'utende ha indovinato qualche numero
     * @param vincita quantitaivo dei numeri indovinati
     */
    public static void stampoVincita(int vincita){
        switch (vincita) {
            case 0:
                System.out.println("Non hai indovinato nessun numero");
                break;
            case 1:
                System.out.println("Hai indovinato solo un numero");
                break;
            case 2:
                System.out.println("Hai indovinato 2 numeri");
                break;
            case 3:
                System.out.println("Hai indovinato 3 numeri");
                break;
            case 4:
                System.out.println("Hai indovinato 4 numeri");
                break;
            case 5:
                System.out.println("Hai indovinato 5 numeri");
                break;
            default:
                break;
        }
    }
}

