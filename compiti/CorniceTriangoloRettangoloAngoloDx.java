import java.util.Scanner;
public class CorniceTriangoloRettangoloAngoloDx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int lato = input.nextInt();

        for(int i = 0; i < lato; i++){
            for (int j = 1; j < lato; j++) {
                if(j == lato - i || i == lato - 1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
