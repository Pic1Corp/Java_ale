/*
    trasforma un carattere da minuscolo a maiuscolo con un modulo
    crea un modulo per determinare se un numero primo
    crea un metodo che calcoli l'area di un cerchio
    crea un metodo che dica se 3 numeri possono creare un triangolo
    crea un metodo che dica la lunghezza del numero
    crea un metodo che trovi tra tre numeri il maggiore
    crea un metodo che disegni un rombo
*/

public class MetodiEs {
    public static void main (String[]args){

    }

    public static char MinAMaius (char a){
        return (char) (a - 32);
    }

    public static boolean NumPrimo (int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double AreaCerchio (int a){
        double Area = 0;
        return Area;
    }

    public static boolean TreNumTriangolo (int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }

    public static int LunghezzaNum (int a){
        if(a == 0) {
            return 1;
        }
        int lunghezza = 0;
        while (a != 0) {
            a /= 10;
            lunghezza++;
        }
        return lunghezza;
    }

    public static int ValMagg (int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void DisegnoRombo (int n){
        if (n % 2 == 0) {
            n++; // se n è pari si incrementa di 1
        }
        int spazi = n / 2;
        int asterischi = 1;
        // triangolo sopra
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < spazi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asterischi; j++) {
                System.out.print("*");
            }
            System.out.println();
            spazi--;
            asterischi += 2;
        }
        // triangolo sotto
        spazi = 1;
        asterischi = n - 2;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < spazi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asterischi; j++) {
                System.out.print("*");
            }
            System.out.println();
            spazi++;
            asterischi -= 2;
        }
    }
}
