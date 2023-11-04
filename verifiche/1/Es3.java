import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int altezza, rigaPari = 0, numStampPari = 1, numStampDispari;
        /*
        rigaPari = contatore se la riga è pari perche se è pari i numeri sono decresenti
        numStampPari = contatore del numero da stampare nelle riche pari
        numStampDispari = contatore del numero da stampare nelle riche dispari
         */

        //richiesta numero
        System.out.println("Inserisci l'altezza del triangolo:");
        altezza = input.nextInt();
        //disegno triangolo
        for (int i = 0; i <= altezza; i++){
            if (rigaPari%2 == 0){
                for (int j = 0; j < altezza - i; j++) {
                    System.out.print(" " + numStampPari);
                    numStampPari++;
                }
            }
            else {
                numStampDispari = numStampPari + altezza - i - 1;
                for (int j =  0; j < altezza - i; j++) {
                    System.out.print(" " + numStampDispari);
                    numStampDispari--;
                    numStampPari++;
                }
            }
            rigaPari++;
            System.out.println(" ");
        }
        //chiusura dello scanner
        input.close();
    }
}
