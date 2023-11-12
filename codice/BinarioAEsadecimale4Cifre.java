public class BinarioAEsadecimale4Cifre {
    public static void main(String[] args) {
        char[] arrayEsadec = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int[] array = {1, 0, 1, 1, 0, 0, 1};
        int var2, sommaGrup4, index=array.length-1;
        String numEsadec = "";
        while (index >= 0) { 
            sommaGrup4 = 0;
            var2 = 0; 
            for (int i = 0; i < 4; i++) { 
                if (index == -1)
                    break;
                sommaGrup4 += array[index] * Math.pow(2, var2);
                var2++;
                index--; 
            }
            numEsadec = arrayEsadec[sommaGrup4] + numEsadec; 
        }
        System.out.println("The hexadecimal number is: " + numEsadec);
    }
}
