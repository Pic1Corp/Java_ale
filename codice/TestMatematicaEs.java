import java.util.Random;
import java.util.Scanner;

public class TestMatematicaEs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputU = 0;

        System.out.println("inserire il nome:");
        String nome = in.nextLine();
        do{
            System.out.println("benvenuto " + nome + ", cosa vuoi fare?\r\n" + "1.calcolo veloce\r\n" +"2.frazioni\r\n" +"3.conversione di base\r\n" + "4.geometria");
            inputU = in.nextInt();
        }while(inputU < 1 || inputU > 4);
        switch (inputU) {
            case 1:
                RegoleCV();
                CalcoloVeloce();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                System.out.println("opzione non valida");
                break;
        }
        in.close();
    }

    public static void RegoleCV(){
        Scanner in = new Scanner(System.in);
        String inputU = "easter egg";
        do{
        System.out.println("Benvenuto in calcolo veloce, ecco le regole:\r\n" + 
                "Dovrai risolvere delle somme, sottrazioni, divisioni e moltiplicazioni.\r\n" + 
                "Dopo aver risolto 5 operazioni di sequito consecutive passerai al prossimo blocco di operazioni.\r\n" + 
                "il numero di cifre è dato dal livello scelto dall'utente.\r\n" + 
                "Buona fortuna.\r\n" + 
                "Per iniziare scrivi PRONTO.");
                inputU = in.nextLine();
        }while(inputU == "PRONTO");
    }

    public static void CalcoloVeloce(){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int lv, numCifMax=0, numCifMin=0;
        System.out.println("Inserisci il livello di difficoltà: ");
        lv = in.nextInt();
        for (int i=0; i<lv; i++){
            if (i!=0){
                numCifMax*=10;
                numCifMin*=10;
                numCifMin+=9;
            }
            numCifMax+=9;
        }
        Somma(numCifMin,numCifMax);
    }

    public static void Somma(int c, int d){//c=numero min d=numero max
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2;
        do {
            num1 = rd.nextInt(d-c+1)+c;
            num2 = rd.nextInt(d-c+1)+c;
            result = num1+num2;
            System.out.println(num1 + " + " + num2 + " = ? ");
            inputU = in.nextInt();
            if (inputU == result){
                conseq ++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
        } while (conseq <= 5);
    }
}
