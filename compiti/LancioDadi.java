import java.util.Random;
import java.util.Scanner;

public class LancioDadi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vittorie = 0, turno = 0, punteggioGiocatore, punteggioComputer;
        char risposta = 'y';
        while (true){
            turno++;
            if (turno > 1){
                System.out.println("Vuoi continuare? [y/n]");
                risposta = input.nextLine().charAt(0);
                if (risposta == 'n'){
                    break;
                }
            }
            System.out.println("Turno: " + turno);
            System.out.println("Turno giocatore");
            punteggioGiocatore = TotDadi(2);
            System.out.println("Turno Computer");
            punteggioComputer = TotDadi(2);
            if (punteggioGiocatore > punteggioComputer)
                vittorie++;
        }
        System.out.println("Hai vinto " + vittorie + " volte");
        input.close();
    }

    public static int TotDadi(int a){   
        Random random = new Random();
        int punteggio = 0 , punteggioTot = 0;
        for (int i = 0; i < a; i++){
            punteggio += random.nextInt(5);
            if (punteggio == 0)
                LatoFaccia1();
            else if (punteggio == 1)
                LatoFaccia2();
            else if (punteggio == 2)
                LatoFaccia3();
            else if (punteggio == 3)
                LatoFaccia4();
            else if (punteggio == 4)
                LatoFaccia5();
            else if (punteggio == 5)
                LatoFaccia6();
            punteggioTot += punteggio;
        }
        return punteggioTot;
    }
    public static void LatoFaccia1(){
        System.out.println("-----------");
        System.out.println("|         |");
        System.out.println("|    *    |");
        System.out.println("|         |");
        System.out.println("-----------");
    }
    public static void LatoFaccia2(){
        System.out.println("-----------");
        System.out.println("| *       |");
        System.out.println("|         |");
        System.out.println("|       * |");
        System.out.println("-----------");
    }
    public static void LatoFaccia3(){
        System.out.println("-----------");
        System.out.println("| *       |");
        System.out.println("|    *    |");
        System.out.println("|       * |");
        System.out.println("-----------");
    }
    public static void LatoFaccia4(){
        System.out.println("-----------");
        System.out.println("| *     * |");
        System.out.println("|         |");
        System.out.println("| *     * |");
        System.out.println("-----------");
    }
    public static void LatoFaccia5(){
        System.out.println("-----------");
        System.out.println("| *     * |");
        System.out.println("|    *    |");
        System.out.println("| *     * |");
        System.out.println("-----------");
    }
    public static void LatoFaccia6(){
        System.out.println("-----------");
        System.out.println("| *     * |");
        System.out.println("| *     * |");
        System.out.println("| *     * |");
        System.out.println("-----------");
    }
}
