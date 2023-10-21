public class NumNatSomm20 {
    public static void main (String[]args){
        int num1 = 0, num2 = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                if (num1 + num2 == 20){
                    System.out.println(num1 + " " + num2);
                }
                num1++;
            }
            num1 = 0;
            num2++;
        }
    }
}
