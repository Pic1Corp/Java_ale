import java.util.Random;
import java.util.Scanner;

public class MediaNumeriCasuali {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int numDaGen = 0, media = 0;

        do{
            System.out.println("Quanti numeri vanno generati?");
            numDaGen = input.nextInt();
        }while(numDaGen > 100 || numDaGen <= 0);

        for (int  i = 0; i <= numDaGen; i++)
            media =+ random.nextInt(1001);

        System.out.println("La media dei "+ numDaGen + " numeri da generare è:");
            if (media < 100)
                System.out.println("Inferiore a 100");
            else if (media >= 100 && media < 200)
                System.out.println("Tra 100 e 200");
            else if (media >= 200 && media < 500)
                System.out.println("Tra 200 e 500");
            else
                System.out.println("Superiore a 500");
            
        input.close();
    }
}
