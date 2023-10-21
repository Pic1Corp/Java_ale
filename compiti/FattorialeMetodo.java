import java.util.Scanner;

public class FattorialeMetodo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Quale è il numero intero da calcolare il suo fattoriale");
        num = input.nextInt();

        System.out.println("Il fattoriale di " + num + " è "+fatt(num));
        input.close();
    }
    
    public static int fatt(int x) {
            int i;
            int f=1;
        
            for(i=1; i<=x; i=i+1) {
                f=f*i;
            }
        
            return f;
        }
}
