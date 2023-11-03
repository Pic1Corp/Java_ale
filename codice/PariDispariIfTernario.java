import java.util.Scanner;

public class PariDispariIfTernario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num;
        String pariDispari;

        System.out.println("Inserisci il numero:");
        num = input.nextDouble();

        pariDispari = (num % 2 == 0) ? "Il numero è pari" : "Il numero è dispari";
        System.out.println(pariDispari);

        input.close();
    }
}
