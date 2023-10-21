import java.util.Scanner;

public class ScontoMetodo {
    public static void main(String[]args){
        double prezzoOriginale = 0, sconto = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto è  il prezzo dell'articolo");
        prezzoOriginale = input.nextDouble();
        System.out.println("Di quanto è lo sconto?");
        sconto = input.nextDouble();

        System.out.println("Il prezzo dell'articolo quanto è scontato è " + calcoloSconto(prezzoOriginale, sconto));
        input.close();

    }
    public static double calcoloSconto(double prezzoNS, double sconto){
        double prezzoS;
        prezzoS = (sconto == 100)?  0 :  (prezzoNS*sconto/100);
        return prezzoNS - prezzoS;
    }
}
