import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sommaDivNum1 = 0, sommaDivNum2 = 0, num1 = 0, num2 = 0;
        /*
        sommaDivNum1 = somma dei divisori numero 1
        sommaDivNum2 = somma dei divisori numero 2
        num1 = numero 1
        num2 = numero 2
         */

        //richiesta numeri
        System.out.println("inserisci il primo numero naturale intero");
        num1 = input.nextInt();
        System.out.println("inserisci il secondo numero naturale intero");
        num2 = input.nextInt();

        sommaDivNum1 = ControlloSommaDivisori(num1); //controllo divisori e somma divisori numero 1
        sommaDivNum2 = ControlloSommaDivisori(num2); //controllo divisori e somma divisori numero 2

        //uscita a schermo del risulatato
        if (sommaDivNum1 == num2 && sommaDivNum2 == num1)
            System.out.println("i numeri sono fidanzati");
        else
            System.out.println("I numeri non sono fidanzati");
        //chiusura dello scanner
        input.close();
    }

    //modulo per controllo divisori e somma divisori
    public static int ControlloSommaDivisori(int a){
        int sommaDivisori = 0;
        for (int i = 2; i < a; i++)
            if (a%i == 0)
                sommaDivisori += i;
        return sommaDivisori;
    }
}
