import java.util.Scanner;

public class CoppieNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumCoppie = 0, Num1 = 0, Num2, Intervallo1, Intervallo2, Somma;

        System.out.println("Quale è il primo numero(minore) dell'intervallo?");
        Intervallo1 = input.nextInt();
        System.out.println("Quale è il ultimo numero(maggiore) dell'intervallo?");
        Intervallo2 = input.nextInt();
        System.out.println("Quale è il numero di coppie?");
        NumCoppie = input.nextInt();

        for(int i = 0; i != NumCoppie; i++){
            System.out.println("Quale è il primo numero: ");
            Num1 = input.nextInt();
            System.out.println("Quale è il secondu numero: ");
            Num2 = input.nextInt();

            Somma=Num1+Num2;

            if (Somma >= Intervallo1 && Somma <= Intervallo2)
                System.out.println("La somma " + Somma + " è compresa nell'intervallo tra " + Intervallo1 + " e " + Intervallo2);
            else
                System.out.println("La somma " + Somma + " non è compresa nell'intervallo tra " + Intervallo1 + " e " + Intervallo2);

        }

        input.close();
    }
}