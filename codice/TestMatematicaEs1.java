import java.util.Random;
import java.util.Scanner;

public class TestMatematicaEs1 {
    public static void main(String[] args) {
        EquivalenzeLv2();
        Scanner in = new Scanner(System.in);
        int inputU = 0;
        String nome;
        System.out.println("inserire il nome:");
        nome = in.nextLine();
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
                Frazioni();
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
        System.out.println("Benvenuto in calcolo veloce, ecco le regole:\r\n" + 
            "Dovrai risolvere delle somme, sottrazioni, divisioni e moltiplicazioni.\r\n" + 
            "Dopo aver risolto 5 operazioni di sequito consecutive passerai al prossimo blocco di operazioni.\r\n" + 
            "Il numero di cifre è dato dal livello scelto dall'utente.\r\n" + 
            "Nelle divisione arrodonda per aver il risultato in un intero.\r\n" + 
            "Buona fortuna.\r\n");
    }

    public static void RegoleF1(){
        System.out.println("Regole:\r\n" + 
                "Verra mostrato una frazione scritta così: n/d [numeratore/denominatore].\r\n" + 
                "Devi dire se la frazione è apparenti[a],proprie[p] ed inproprie[i].\r\n" + 
                "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" +
                "Buona fortuna!");
    }

    public static void RegoleF2(){
        System.out.println("Regole:\r\n" + 
            "Verra mostrato una frazione scritta così: n/d [numeratore/denominatore].\r\n" + 
            "Devi ridurre ai minimi termini frazioni.\r\n" + 
            "Dicendomi prima il numeratore (verra chiesto cosi [n {risposta}]).\r\n" + 
            "Pou il denominatore (verra chiesto cosi [d {risposta}]).\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }

    public static void RegoleF3(){
        System.out.println("Regole:\r\n" + 
            "Verra mostrato una frazione scritta così: n/d * n/d [numeratore/denominatore * numeratore/denominatore].\r\n" + 
            "Devi moltiplicare le frazioni e poi ridurre ai minimi termini la frazione.\r\n" + 
            "L'input dovrà essera già il numeratore e il denominatore della frazione ridotta ai minimi termini.\r\n" + 
            "Dicendomi prima il numeratore (verra chiesto cosi [n: {risposta}]).\r\n" + 
            "Pou il denominatore (verra chiesto cosi [d: {risposta}]).\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }

    public static void RegoleF4(){
        System.out.println("Verra mostrato una frazione scritta così: n/d + n/d [numeratore/denominatore + numeratore/denominatore].\r\n" + 
            "Devi sommare le frazioni.\r\n" + 
            "Dicendomi prima il numeratore (verra chiesto cosi [n: {risposta}]).\r\n" + 
            "Pou il denominatore (verra chiesto cosi [d: {risposta}]).\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }

    public static void RegoleEq1(){
        System.out.println("Ti verrà mostrato un numero decimale.\r\n" + 
            "Devi convertirlo in binario.\r\n" + 
            "Scrivi il numero binario corrispondente.\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }

    public static void RegoleEq2(){
        System.out.println("Ti verrà mostrato un numero binario.\r\n" + 
            "Devi convertirlo in decimale.\r\n" + 
            "Scrivi il numero decimale corrispondente.\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }

    public static void RegoleEq3(){
        System.out.println("Ti verrà mostrato un numero binario.\r\n" + //
            "Devi convertirlo in esadecimale.\r\n" + //
            "Scrivi il numero esadecimale corrispondente.\r\n" + //
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + //
            "Buona fortuna!");
    }

    public static void RegoleEq4(){
        System.out.println("Ti verrà mostrato un numero esadecimale.\r\n" + //
            "Devi convertirlo in binario.\r\n" + //
            "Scrivi il numero binario corrispondente.\r\n" + //
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + //
            "Buona fortuna!");
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
        Sottrazione(numCifMin,numCifMax);
        Moltiplicazioni(numCifMin, numCifMax);
        Divisioni(numCifMin, numCifMax);
    }

    public static void Frazioni(){
    Scanner in = new Scanner(System.in);
        int inputU = 0;
        do{
            System.out.println("Benvenuto in frazioni, prima delle regole scegli un livello:\r\n" + //
                "1. stabilire la natura di una frazione(apparenti[a],proprie[p] ed inproprie[i]).\r\n" + //
                "2. ridurre ai minimi termini frazioni con numeratore e denominatore con due cifre.\r\n" + //
                "3. moltiplicare frazioni con numeratore e denominatore con una cifra e risultato ridotto ai minimi termini.\r\n" + //
                "4. sommare frazioni con numeratore e denominatore con una cifra.");
            inputU = in.nextInt();
            switch (inputU) {
                case 1:
                    RegoleF1();
                    FrazioniLv1();
                    break;
                case 2:
                    RegoleF2();
                    FrazioniLv2();
                    break;
                case 3:
                    RegoleF3();
                    FrazioniLv3();
                    break;
                case 4:
                    RegoleF4();
                    FrazioniLv4();
                    break;
                default:
                    System.out.println("opzione non valida");
                    break;
            }
        }while(true);
    }

    public static void Equivalenze() {
        Scanner in = new Scanner(System.in);
        int inputU = 0;
        do{
            System.out.println("Benvenuto in equivalenze, prima delle regole scegli un livello:\r\n" + 
                "1: da decimale a binario\r\n" + 
                "2: da binario a decimale\r\n" + 
                "3 da binario a esadecimale\r\n" + 
                "4: da esadecimale a binario");
            inputU = in.nextInt();
            switch (inputU) {
                case 1:
                    RegoleEq1();
                    EquivalenzeLv1();
                    break;
                case 2:
                    RegoleEq2();
                    EquivalenzeLv2();
                    break;
                case 3:
                    RegoleEq3();
                    EquivalenzeLv3();
                    break;
                case 4:
                    RegoleEq4();
                    EquivalenzeLv4();
                    break;
                default:
                    System.out.println("opzione non valida");
                    break;
            }
        }while(true);
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

    public static void Sottrazione(int b, int a){//a=numero min b=numero max
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2;
        do {
            do {
                num1 = rd.nextInt(a-b+1)+b;
                num2 = rd.nextInt(a-b+1)+b;
            } while (num1 < num2);
            result = num1-num2;
            System.out.println(num1 + " - " + num2 + " = ? ");
            inputU = in.nextInt();
            if (inputU == result){
                conseq ++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
        } while (conseq <= 5);
    }

    public static void Moltiplicazioni(int a, int b){//a=numero min b=numero max
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2;
        do {
            num1 = rd.nextInt(b-a+1)+a;
            num2 = rd.nextInt(b-a+1)+a;
            result = num1*num2;
            System.out.println(num1 + " * " + num2 + " = ? ");
            inputU = in.nextInt();
            if (inputU == result){
                conseq ++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
        } while (conseq <= 5);
    }

    public static void Divisioni(int a, int b){//a=numero min b=numero max
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2;
        do {
            do {
            num2 = rd.nextInt(b-a+1)+a;
            } while (num2 == 0);
            num1 = rd.nextInt(b-a+1)+a;
            result = (int) Math.ceil(num1/num2);
            System.out.println(num1 + " / " + num2 + " = ? ");
            inputU = in.nextInt();
            if (inputU == result){
                conseq ++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
        } while (conseq <= 5);
    }

    public static void FrazioniLv1(){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int inputU, conseq=0, numeratore, denominatore;
        char tipoFrazione = '*';
        do {
            numeratore = rd.nextInt();
            denominatore = rd.nextInt();
            if (numeratore > denominatore)
                tipoFrazione = 'i';
            else if (numeratore < denominatore)
                tipoFrazione = 'p';
            else if (numeratore == denominatore)
                tipoFrazione = 'a';
            System.out.println("Determina la natura della frazione " + numeratore + "/" + denominatore);
            inputU = in.next().charAt(0);
            in.nextLine();
            if (inputU == tipoFrazione) 
                conseq++;
        } while (conseq<=5);
    }

    public static void FrazioniLv2(){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int inputUN, inputUD, conseq=0, numeratoreNMCD, denominatoreNMCD, numeratoreSMCD, denominatoreSMCD;
        do {
            numeratoreNMCD = rd.nextInt(100);
            denominatoreNMCD = rd.nextInt(100);
            if (denominatoreNMCD < 0)
                denominatoreNMCD = denominatoreNMCD * -1;
            else if (numeratoreNMCD < 0)
                numeratoreNMCD = numeratoreNMCD *-1;
            numeratoreSMCD = numeratoreNMCD / MCD(numeratoreNMCD, denominatoreNMCD);
            denominatoreSMCD = denominatoreNMCD / MCD(numeratoreNMCD, denominatoreNMCD);
            System.out.println("Riduci la frazione " + numeratoreNMCD + "/" + denominatoreNMCD + " ai minimi termini");
            System.out.print("n: ");
            inputUN = in.nextInt();
            System.out.println();
            System.out.print("d: ");
            inputUD = in.nextInt();
            if (inputUN == numeratoreSMCD && inputUD == denominatoreSMCD){
                System.out.println("corretto");
                conseq++;
            }
            else
                System.out.println("errato, la frazione ridotta ai minimi termini è: " + numeratoreSMCD + "/" + denominatoreSMCD);
        } while (conseq<=5);
    }

    public static void FrazioniLv3(){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int numeratore1, numeratore2, denominatore1, denominatore2, numeratoreRis, denominatoreRis, numeratoreRisMCD, denominatoreRisMCD, inputUD, inputUN, conseq=0;
        do {
            numeratore1 = rd.nextInt(100);
            denominatore1 = rd.nextInt(100);
            numeratore2 = rd.nextInt(100);
            denominatore2 = rd.nextInt(100);
            numeratoreRis = numeratore1 * numeratore2;
            denominatoreRis = denominatore1 * denominatore2;
            numeratoreRisMCD = numeratoreRis / MCD(numeratoreRis, denominatoreRis);
            denominatoreRisMCD = denominatoreRis / MCD(numeratoreRis, denominatoreRis);
            System.out.println("moltiplica le frazione " + numeratore1 + "/" + denominatore1 + " e " + numeratore2 + "/" + denominatore2 + " e riduci ai minimi termini");
            System.out.print("n: ");
            inputUN = in.nextInt();
            System.out.println();
            System.out.print("d: ");
            inputUD = in.nextInt();
            if (inputUN == numeratoreRisMCD && inputUD == denominatoreRisMCD){
                System.out.println("corretto");
                conseq++;
            }
            else
                System.out.println("errato, la frazione ridotta ai minimi termini è: " + numeratoreRisMCD + "/" + denominatoreRisMCD);
        } while (conseq <= 5);
    }

    public static void FrazioniLv4(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int numeratore1, numeratore2, denominatore1, denominatore2, numeratoreRis, denominatoreRis, MCDDenominatori, inputUD, inputUN, conseq=0;
        do {
            numeratore1 = rd.nextInt(100);
            denominatore1 = rd.nextInt(100);
            numeratore2 = rd.nextInt(100);
            denominatore2 = rd.nextInt(100);
            MCDDenominatori = (denominatore1<denominatore2)? MCD(denominatore2, denominatore1) : MCD(denominatore1, denominatore2);
            numeratoreRis = (numeratore1 * MCDDenominatori) + (numeratore2 * MCDDenominatori);
            denominatoreRis = (denominatore1 * MCDDenominatori) + (denominatore2 * MCDDenominatori);
            System.out.println("Somma le frazione " + numeratore1 + "/" + denominatore1 + " e " + numeratore2 + "/" + denominatore2);
            System.out.print("n: ");
            inputUN = in.nextInt();
            System.out.println();
            System.out.print("d: ");
            inputUD = in.nextInt();
            if (inputUN == numeratoreRis && inputUD == denominatoreRis || inputUN == numeratoreRis/MCD(numeratoreRis, denominatoreRis) && inputUD == denominatoreRis/MCD(numeratoreRis, denominatoreRis)){
                System.out.println("corretto");
                conseq++;
            }
            else
                System.out.println("errato, la frazione ridotta ai minimi termini è: " + numeratoreRis + "/" + denominatoreRis);


        } while (conseq<=5);
    }

    public static int MCD (int a, int b){
        if (b == 0)
            return a;
        else
            return MCD(b, a%b);
    }

    public static void EquivalenzeLv1(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int[] binA = new int[32];
        int num, inputU, index=0, binI=0, conseq=0, contWhile;
        do {
            num=rd.nextInt(1023);
            contWhile = num;
            index=0;
            while(contWhile>0){
                binA[index++] = contWhile%2;
                contWhile/=2;
            }
            binI = 0;
            for (int i=index-1; i>=0; i--){
                binI += binA[i];
                if (i != 0)
                    binI= binI*10;
            }
            System.out.println("Trasforma in binario il seguente numero: " + num);
            inputU = in.nextInt();
            if (inputU == binI){
                conseq++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + binI);
        } while (conseq<=5);
        
    }

    public static void EquivalenzeLv2(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int[] binA = new int[32];
        int num, inputU, index=0, binI=0, conseq=0, contWhile;
        do {
            num=rd.nextInt(1023);
            contWhile = num;
            index=0;
            while(contWhile>0){
                binA[index++] = contWhile%2;
                contWhile/=2;
            }
            binI = 0;
            for (int i=index-1; i>=0; i--){
                binI += binA[i];
                if (i != 0)
                    binI= binI*10;
            }
            System.out.println("Trasforma in decimale il seguente numero binario: " + binI);
            inputU = in.nextInt();
            if (inputU == num){
                conseq++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + num);
        } while (conseq<=5);
    }

    public static void EquivalenzeLv3(){
        
    }

    public static void EquivalenzeLv4(){
        
    }
}
