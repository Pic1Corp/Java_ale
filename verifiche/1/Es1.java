import java.util.Scanner;
public class Es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double litri, prezzo;
        int mesi;

        //richiesta di informazioni
        System.out.println("Di quanti litri è il l'olio?");
        litri = input.nextDouble();
        System.out.println("Di quanti mesi è conservato?");
        mesi = input.nextInt();
        //calcolo prezzo
        prezzo = CalcoloPrezzo(mesi, litri);
        //stampa il prezzo
        System.out.println("il prezzo dell'olio è " + prezzo);
        //chiusura dello scanner
        input.close();
    }
    //creazione modulo per calcolare il prezzo
    public static double CalcoloPrezzo (int a, double b){
        double prezzo = 0;
        if (a <= 6)
            prezzo = (15*b);
        else if (a > 6 && a <= 12)
            prezzo = (12*b);
        else if (a > 12)
            prezzo = (9*b);
        return prezzo;
    }
}