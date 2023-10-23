import java.util.Scanner;

public class NumeroMaggioreIfTernario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Num1, Num2;

        System.out.println("Primo numero");
        Num1 = input.nextInt();
        System.out.println("Secondo numero");
        Num2 = input.nextInt();

        String minmag = (Num1 < Num2) ? "Il secondo numero è il maggiore" : "Il primo numero è iil maggiore";
        System.out.println(minmag);

        input.close();
    }
}
