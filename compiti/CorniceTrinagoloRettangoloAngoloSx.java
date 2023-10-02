import java.util.Scanner;

public class CorniceTrinagoloRettangoloAngoloSx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int lato = input.nextInt();

        for(int i = 0; i <= lato - 1; i++){
            System.out.print("*");
            if (i >= 0 && i < lato - 1) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
            }
            else{
                for ( int j = 0; j<lato-2; j++)
                    System.out.print("*");
            }
            System.out.print("*");
            System.out.println("");


        }
    }
}
