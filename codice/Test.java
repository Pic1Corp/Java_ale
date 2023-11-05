import java.util.Random;
import java.util.Scanner;

public interface Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int[] binA = new int[32];
        char [] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int num, inputU, indexA=0, binI=0, conseq=0, contWhile;
        do {
            num=rd.nextInt(1023);
            contWhile = num;
            indexA=0;
            while(contWhile>0){
                binA[indexA++] = contWhile%2;
                contWhile/=2;
            }
            binI = 0;
            for (int i=indexA-1; i>=0; i--){
                binI += binA[i];
                if (i != 0)
                    binI= binI*10;
            }
            System.out.println("Trasforma in esadecimale il seguente numero binario: " + binI);
        } while (conseq<=5);
    }
}