import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, cifreNum = 1;
        /*
        num = numero
        cifreNum = cifre del numero
         */

        //richiesta numero
        System.out.println("Quale è il numero");
        num = input.nextInt();
        //controllo se numero è negativo
        if(num < 0)
            num = num * (-1);
        //contatore delle cifre
        for (int i = 0; i <= num; i++){
            if (num % 10 == 0)
                cifreNum++;
            else
                break;
            num = num/10;
        }
        //risposta riportata a scermo
        System.out.println("Il numero è composto da " + cifreNum + " cifre");
        //chiusura dello scanner
        input.close();
    }
}
