import java.util.Random;
import java.util.Scanner;

public interface Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        int num;

        num = rd.nextInt(1023);
        String hex = Integer.toHexString(num);
        String bin = Integer.toBinaryString(num);
        System.out.println("Hex value is " + hex);
        System.out.println("Bin value is " + bin);

        in.close();
    }
}

