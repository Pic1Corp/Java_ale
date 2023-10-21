import java.util.Scanner;

public class TriangoloFloyd{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int altezza, numStamp = 0;
        
        System.out.println("Di quanto è l'altezza?");
        altezza = input.nextInt();
        System.out.println("");
        for (int i = 0; i < altezza; i++){
            for (int j = 0; j <= i ; j++){
                numStamp++;
                System.out.print(numStamp + " ");
            }
            System.out.println("");
        }
        input.close();
    }
}