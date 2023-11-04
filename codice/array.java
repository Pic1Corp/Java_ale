/*
 * costruisci un array e inizzializalo con tutti i numeri pardi di dimensione 100 e stampa a schermo
 * inizzializza un array di 100 posizioni con le lettere dell'alfabeto minuscole 
 * inizzializza un array di 100 posizioni con le posioni pari i numeri pari e nelle posioni dispari con multipli di 7
 * inizzializza un array di 100 posizioni con i divisori di un numero preso in input
 * inizzializza un array di 100 posizioni con numeri presi da input e la sequenza è terminata con 0 
 * inizzializza un array di 100 posizioni con i numeri della sequenza di fibonacci
* inizzializza un array di 100 posizioni con i fattoriali con un numero preso in input 
*/

import java.util.Scanner;

public class array {
    public static void main (String[]arg){
    
        int posizione = 0, numeroUt, numFibonacci = 1;
        int[] array1, array3, array4, array5, array7;
        long[] array6;
        char[] array2;
        array1 = new int[100];
        array2 = new char[100];
        array3 = new int[100];
        array4 = new int[100];
        array5 = new int[100];
        array6 = new long[100];
        array7 = new int[100];

        //es1
        for (int i = 0, num = 2; i < 100; i++, num += 2)
                array1[i] = num;
        System.out.println("Array dei numeri pari:");
        for (int i : array1) 
            System.out.print(i + " ");
        System.out.println();

        //es2
        for (int i = 0; i <= 25; i++)
            array2[i] = (char) (i+97);
    
        //es3
        for (int i = 2, l = 0; i < 102; i++){
            if (i%2 == 0)
                array3[i-2] = i;
            else{
                array3[i-2] = l*7;
                l++;
            }
        }

        //es4
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("inserisci il numero minore di 100");
            numeroUt = input.nextInt();
        }while(numeroUt > 100 && numeroUt < 0);
        for (int i = 1; i <= numeroUt; i++){
            if (numeroUt%i == 0){
                array4[posizione] = i;
                posizione++;
            }
        }

        //es5
        posizione=0;
        do{
            System.out.println("inserisci un numero");
            numeroUt = input.nextInt();
            array5[posizione]=numeroUt;
            posizione++; 
        }while (numeroUt != 0);
        for (int i : array5) 
            System.out.print(i + " ");

        //es7
        System.out.println("dimmi il numero fattoriale");
        numeroUt = input.nextInt();
        for(int i=0; i<100; i++){
            array7[i]=numeroUt;
            numeroUt-=1;
        }
        input.close();

        //es6
        for (int i = 0; i <= 100; i++){
            array6[i]=numFibonacci;
            numFibonacci+=array6[i-1];
        }

    }
}
