import java.util.Scanner;

public class ContrasSottoSeguenza2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = 0, lenMax = 0; //len = lunghezza e lenMax = lunghezza massima
        char car, carPrec, carLenMax; //car = carattere e carPrec = carattere precedente


        System.out.println("Inserisci una seguenza di caratteri, dove ogni carattere è seguito da invio");
        car = input.nextLine().charAt(0);
        carPrec = car;
        carLenMax = 'a';


        //legge fino a quando inserisco ? o *
        while(car == '?' || car == '*') {

            if (carPrec == car) { //quando la seguenza termina
                len++;
                if (len > lenMax) { //controlla la seguenza massima
                    lenMax = len;
                    carLenMax = car;
                }
            }
            else if (carPrec != car)
                len = 1;
            else
                len++;

            carPrec = car; // faccio in modo che prima di leggere il nuovo caratere salvo quello attuale nel precedente
            car = input.nextLine().charAt(0);
        }
        System.out.println("La lunghezza della più lunga sequenza di "+ carLenMax + " di fila è: " + lenMax);

        input.close();
    }
}
