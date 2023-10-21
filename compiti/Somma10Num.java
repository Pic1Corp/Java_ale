import java.util.Scanner;

public class Somma10Num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int tot = 0, assoluto;

        for (int i = 1; i <= 10; i++){
            System.out.println("inserisci i numeri");
            tot += input.nextInt();
        }   
        
        assoluto = (tot >= 0) ? tot : -tot;
        System.out.println(assoluto);

        input.close();
    }
}
