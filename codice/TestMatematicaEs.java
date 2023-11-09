import java.util.Random;
import java.util.Scanner;

public class TestMatematicaEs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputU = 0;
        int percentualeMedia=0, volteGiocate=0;
        String nome;
        System.out.println("inserire il nome:");
        nome = in.nextLine();
        do {
            System.out.println("benvenuto " + nome + ", cosa vuoi fare?\r\n" + "1.calcolo veloce\r\n" +"2.frazioni\r\n" +"3.conversione di base\r\n" + "4.geometria");
            inputU = in.nextLine().charAt(0);
            switch (inputU) {
                case '1':
                    regoleCV();
                    percentualeMedia+=calcoloVeloce();
                    break;
                case '2':
                    percentualeMedia+=frazioni();
                    break;
                case '3':
                    percentualeMedia+=equivalenze();
                    break;
                case '4':
                    percentualeMedia+=geometria();
                    break;
                }
            volteGiocate++;
        } while (inputU != '!');
        percentualeMedia*=100;
        percentualeMedia/=volteGiocate;
        if (percentualeMedia >= 95 && percentualeMedia <= 100)
            System.out.println("Sei un guro!");
        else if (percentualeMedia >= 80 && percentualeMedia < 95)
            System.out.println("Ti consigliamo di esercitarti maggiormente!");
        else if (percentualeMedia >= 65 && percentualeMedia < 80)
            System.out.println("Sei sicuro di aver scelto la scuola corretta!");
        else
            System.out.println("credo proprio che dovresti darti alle materie umanistiche!");
        in.close();
    }
/**
 * Prints the rules for the "Fast Calculation" game on the console.
 * The rules include instructions to solve addition, subtraction, division, and multiplication operations.
 * After successfully solving 5 consecutive operations, the player will move to the next set of operations.
 * The number of digits is determined by the user-selected level.
 * The division operation rounds to obtain the result as an integer.
 *
 * 
 */
    public static void regoleCV(){
        System.out.println("Benvenuto in calcolo veloce, ecco le regole:\r\n" + 
            "Dovrai risolvere delle somme, sottrazioni, divisioni e moltiplicazioni.\r\n" + 
            "Dopo aver risolto 5 operazioni di sequito consecutive passerai al prossimo blocco di operazioni.\r\n" + 
            "Il numero di cifre è dato dal livello scelto dall'utente.\r\n" + 
            "Nelle divisione arrodonda per aver il risultato in un intero.\r\n" + 
            "Buona fortuna.\r\n");
    }
/**
 * Prints the rules for the exercise of evaluating fractions on the console.
 * The rules include displaying a fraction in the format: n/d [numerator/denominator].
 * The player must identify whether the fraction is proper[p], improper[i], or mixed[a].
 * After correctly identifying 5 consecutive fractions, the exercise will be completed.
 * 
 * 
 */
    public static void regoleF1(){
        System.out.println("Regole:\r\n" + 
                "Verra mostrato una frazione scritta così: n/d [numeratore/denominatore].\r\n" + 
                "Devi dire se la frazione è apparenti[a],proprie[p] ed inproprie[i].\r\n" + 
                "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" +
                "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of reducing fractions to their lowest terms on the console.
 * The rules include displaying a fraction in the format: n/d [numerator/denominator].
 * The player must reduce the fractions to their lowest terms, providing the simplified numerator
 * and denominator when prompted.
 * After correctly reducing 5 consecutive fractions, the exercise will be completed.
 * 
 * 
 */
    public static void regoleF2(){
        System.out.println("Regole:\r\n" + 
            "Verra mostrato una frazione scritta così: n/d [numeratore/denominatore].\r\n" + 
            "Devi ridurre ai minimi termini frazioni.\r\n" + 
            "Dicendomi prima il numeratore (verra chiesto cosi [n {risposta}]).\r\n" + 
            "Pou il denominatore (verra chiesto cosi [d {risposta}]).\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of multiplying fractions and reducing them to their lowest terms on the console.
 * The rules include displaying a fraction multiplication in the format: n/d * n/d [numerator/denominator * numerator/denominator].
 * The player must multiply the fractions and then reduce the result to its lowest terms.
 * The input should already be the simplified numerator and denominator of the reduced fraction.
 * Provide the simplified numerator when prompted (prompt format: [n: {response}]).
 * Provide the simplified denominator when prompted (prompt format: [d: {response}]).
 * After correctly completing 5 consecutive fractions, you will finish the exercise.
 * 
 * 
 */
    public static void regoleF3(){
        System.out.println("Regole:\r\n" + 
            "Verra mostrato una frazione scritta così: n/d * n/d [numeratore/denominatore * numeratore/denominatore].\r\n" + 
            "Devi moltiplicare le frazioni e poi ridurre ai minimi termini la frazione.\r\n" + 
            "L'input dovrà essera già il numeratore e il denominatore della frazione ridotta ai minimi termini.\r\n" + 
            "Dicendomi prima il numeratore (verra chiesto cosi [n: {risposta}]).\r\n" + 
            "Pou il denominatore (verra chiesto cosi [d: {risposta}]).\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of adding fractions on the console.
 * The rules include displaying a fraction addition in the format: n/d + n/d [numerator/denominator + numerator/denominator].
 * The player must add the fractions and provide the sum in its simplified form.
 * Provide the numerator when prompted (prompt format: [n: {response}]).
 * Provide the denominator when prompted (prompt format: [d: {response}]).
 * After correctly completing 5 consecutive fractions, you will finish the exercise.
 * 
 * 
 */
    public static void regoleF4(){
        System.out.println("Verra mostrato una frazione scritta così: n/d + n/d [numeratore/denominatore + numeratore/denominatore].\r\n" + 
            "Devi sommare le frazioni.\r\n" + 
            "Dicendomi prima il numeratore (verra chiesto cosi [n: {risposta}]).\r\n" + 
            "Pou il denominatore (verra chiesto cosi [d: {risposta}]).\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of converting decimal numbers to binary on the console.
 * The rules include displaying a decimal number and instructing the player to convert it to binary.
 * Write the corresponding binary number.
 * After correctly converting 5 consecutive decimal numbers, you will finish the exercise.
 * 
 * 
 */
    public static void regoleEq1(){
        System.out.println("Ti verrà mostrato un numero decimale.\r\n" + 
            "Devi convertirlo in binario.\r\n" + 
            "Scrivi il numero binario corrispondente.\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of converting binary numbers to decimal on the console.
 * The rules include displaying a binary number and instructing the player to convert it to decimal.
 * Write the corresponding decimal number.
 * After correctly converting 5 consecutive binary numbers, you will finish the exercise.
 * 
 * 
 */
    public static void regoleEq2(){
        System.out.println("Ti verrà mostrato un numero binario.\r\n" + 
            "Devi convertirlo in decimale.\r\n" + 
            "Scrivi il numero decimale corrispondente.\r\n" + 
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of converting binary numbers to hexadecimal on the console.
 * The rules include displaying a binary number and instructing the player to convert it to hexadecimal.
 * Write the corresponding hexadecimal number.
 * After correctly converting 5 consecutive binary numbers, you will finish the exercise.
 * 
 * 
 */
    public static void regoleEq3(){
        System.out.println("Ti verrà mostrato un numero binario.\r\n" + //
            "Devi convertirlo in esadecimale.\r\n" + //
            "Scrivi il numero esadecimale corrispondente.\r\n" + //
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + //
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of converting hexadecimal numbers to binary on the console.
 * The rules include displaying a hexadecimal number and instructing the player to convert it to binary.
 * Write the corresponding binary number.
 * After correctly converting 5 consecutive hexadecimal numbers, you will finish the exercise.
 * 
 * 
 */
    public static void regoleEq4(){
        System.out.println("Ti verrà mostrato un numero esadecimale.\r\n" + //
            "Devi convertirlo in binario.\r\n" + //
            "Scrivi il numero binario corrispondente.\r\n" + //
            "Dopo averne fatte giuste 5 consecutive avrai finito l'esercizio.\r\n" + //
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of calculating the area and perimeter of a square on the console.
 * The rules include instructions on how to calculate the area and perimeter of a square
 * given the value of the side length, with indications on how to provide the calculated values.
 * Additionally, it indicates the number of consecutive correct calculations required to complete level 1.
 * 
 * 
 */
    public static void regoleG1(){
        System.out.println("Ti verrà fornita la lunghezza del lato di un quadrato.\r\n" + 
            "Devi calcolare l'area e il perimetro del quadrato corrispondente.\r\n" + 
            "Scrivi i valori calcolati.\r\n" + 
            "Dopo aver completato correttamente 5 esercizi consecutivi avrai finito il livello 1.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of comparing the areas of an isosceles triangle and a square on the console.
 * The rules include providing the length of the side of an isosceles triangle and the length of the side of a square.
 * The player must identify which shape occupies the larger area between the isosceles triangle and the square.
 * Write down which geometric figure occupies the larger area.
 * After correctly completing 5 consecutive exercises, you will finish level 2.
 * 
 * 
 */
    public static void regoleG2(){
        System.out.println("Ti verrà fornita la lunghezza del lato di un triangolo isoscele e la lunghezza del lato di un quadrato.\r\n" + 
            "Devi identificare chi occupa la superficie maggiore tra il triangolo isoscele e il quadrato.\r\n" + 
            "Scrivi quale figura geometrica occupa la maggiore superficie.\r\n" + 
            "Dopo aver completato correttamente 5 esercizi consecutivi avrai finito il livello 2.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of calculating the volume of a cube on the console.
 * The rules include providing the length of the side of a cube.
 * The player must calculate the volume of the corresponding cube.
 * Write down the calculated volume value.
 * After correctly completing 5 consecutive exercises, you will finish level 3.
 * 
 * 
 */
    public static void regoleG3(){
        System.out.println("Ti verrà fornita la lunghezza del lato di un cubo.\r\n" + 
            "Devi calcolare il volume del cubo corrispondente.\r\n" + 
            "Scrivi il valore del volume calcolato.\r\n" + 
            "Dopo aver completato correttamente 5 esercizi consecutivi avrai finito il livello 3.\r\n" + 
            "Buona fortuna!");
    }
/**
 * Prints the rules for the exercise of comparing the volumes of a cube and a parallelepiped on the console.
 * The rules include providing the length of the side of a cube and the measurements of the base, height, and depth of a parallelepiped.
 * The player must identify which shape occupies the larger volume between the cube and the parallelepiped.
 * Write down which geometric figure occupies the larger volume.
 * After correctly completing 5 consecutive exercises, you will finish level 4.
 * 
 * 
 */
    public static void regoleG4(){
        System.out.println("Ti verrà fornita la lunghezza del lato di un cubo e le misure di base, altezza e profondità di un parallelepipedo.\r\n" + 
            "Devi identificare quale figura geometrica occupa il maggior volume tra il cubo e il parallelepipedo.\r\n" + 
            "Scrivi quale figura geometrica occupa il maggiore volume.\r\n" + 
            "Dopo aver completato correttamente 5 esercizi consecutivi avrai finito il livello 4.\r\n" + 
            "Buona fortuna!");
    }

/**
 * Performs a fast calculation based on the user-input difficulty level and computes the average result
 * of several arithmetic operations.
 *
 * @return The average value of the arithmetic operations computed for the given difficulty level.
 */
    public static int calcoloVeloce(){
        Scanner in = new Scanner(System.in);
        int lv, numCifMax=0, numCifMin=0, mediaP=0;
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
        mediaP += somma(numCifMin,numCifMax); // Calls the method for somma
        mediaP += sottrazione(numCifMin,numCifMax); // Calls the method for sottrazione
        mediaP += moltiplicazioni(numCifMin, numCifMax); // Calls the method for moltiplicazioni
        mediaP += divisioni(numCifMin, numCifMax); // Calls the method for divisioni
        return mediaP /= 4;
    }
/**
 * Performs various operations related to fractions based on the user's chosen difficulty level, including determining
 * the nature of a fraction, reducing fractions to their lowest terms, multiplying fractions, and adding fractions.
 *
 * @return The result of the chosen fraction operation based on the user's selected difficulty level.
 */
    public static int frazioni(){
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
                    regoleF1(); // Displays rules for Level 1
                    return frazioniLv1(); // Starts exercises for Level 1
                    
                case 2:
                    regoleF2();  // Displays rules for Level 2
                    return frazioniLv2(); // Starts exercises for Level 2
                    
                case 3:
                    regoleF3(); // Displays rules for Level 3
                    return frazioniLv3(); // Starts exercises for Level 3
                    
                case 4:
                    regoleF4(); // Displays rules for Level 4
                    return frazioniLv4(); // Starts exercises for Level 4
                    
                default:
                    System.out.println("opzione non valida");
                    return 0;
            }
        }while(true);
    }
/**
 * Performs various operations related to conversions between different number systems based on the user's chosen difficulty level.
 *
 * @return The result of the conversion based on the user's selected difficulty level.
 */
    public static int equivalenze() {
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
                    regoleEq1(); // Displays rules for Level 1
                    return equivalenzeLv1(); // Starts exercises for Level 1
                case 2:
                    regoleEq2(); // Displays rules for Level 2
                    return equivalenzeLv2(); // Starts exercises for Level 2
                case 3:
                    regoleEq3(); // Displays rules for Level 3
                    return equivalenzeLv3(); // Starts exercises for Level 3
                case 4:
                    regoleEq4(); // Displays rules for Level 4
                    return equivalenzeLv4(); // Starts exercises for Level 4
                default:
                    System.out.println("opzione non valida");
                    return 0;
            }
        }while(true);
    }
/**
 * Performs various geometric calculations based on the user's chosen difficulty level, including computing the area and perimeter of a square,
 * determining the surface area of different geometric shapes, and comparing volumes of different shapes.
 *
 * @return The result of the geometric calculation based on the user's selected difficulty level.
 */
    public static int geometria(){
        Scanner in = new Scanner(System.in);
        int inputU = 0;
        do{
            System.out.println("Benvenuto in geometria, prima delle regole scegli un livello:\r\n" + 
                "1. calcolare area e perimetro di un quadrato dato il lato\r\n" + 
                "2. dato il lato di un triangolo isoscele e il lato di un quadrato identificare chi occupa la superficie maggiore\r\n" + 
                "3. dato il lato trovare il volume di un cubo\r\n" + 
                "4. dato il lato di un cubo e base altezza e profondità di un parallelepipedo dire chi occupa maggior volume");
            inputU = in.nextInt();
            switch (inputU) {
                case 1:
                    regoleG1(); // Displays rules for Level 1
                    return geometria1(); // Starts exercises for Level 1
                case 2:
                    regoleG2(); // Displays rules for Level 2
                    return geometria2(); // Starts exercises for Level 2 
                case 3:
                    regoleG3(); // Displays rules for Level 3
                    return geometria3(); // Starts exercises for Level 3 
                case 4:
                    regoleG4(); // Displays rules for Level 4
                    return geometria4(); // Starts exercises for Level 4
                default:
                    System.out.println("opzione non valida");
                    return 0;
            }
        }while(true);
    }

/**
 * Generates random addition exercises within a specified range and evaluates the user's input.
 *
 * @param c Lower bound of the range for random number generation.
 * @param d Upper bound of the range for random number generation.
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int somma(int c, int d){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2, tentativi=0, corrette=0;
        do {
            num1 = rd.nextInt(d-c+1)+c;
            num2 = rd.nextInt(d-c+1)+c;
            result = num1+num2;
            System.out.println(num1 + " + " + num2 + " = ? ");
            inputU = in.nextInt();
            if (inputU == result){
                conseq ++;
                corrette++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
            tentativi++;
        } while (conseq <= 5);
        return corrette/100*tentativi;
    }
/**
 * Generates random subtraction exercises within a specified range and evaluates the user's input.
 *
 * @param b Lower bound of the range for random number generation.
 * @param a Upper bound of the range for random number generation.
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int sottrazione(int b, int a){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2, corrette=0, tentativi=0;
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
                corrette++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
            tentativi++;
        } while (conseq <= 5);
        return corrette/100*tentativi;
    }
/**
 * Generates random multiplication exercises within a specified range and evaluates the user's input.
 *
 * @param a Lower bound of the range for random number generation.
 * @param b Upper bound of the range for random number generation.
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int moltiplicazioni(int a, int b){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2, corrette=0, tentativi=0;
        do {
            num1 = rd.nextInt(b-a+1)+a;
            num2 = rd.nextInt(b-a+1)+a;
            result = num1*num2;
            System.out.println(num1 + " * " + num2 + " = ? ");
            inputU = in.nextInt();
            if (inputU == result){
                conseq ++;
                corrette++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
            tentativi++;
        } while (conseq <= 5);
        return corrette/100*tentativi;
    }
/**
 * Generates random division exercises within a specified range and evaluates the user's input.
 *
 * @param a Lower bound of the range for random number generation.
 * @param b Upper bound of the range for random number generation.
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int divisioni(int a, int b){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int result, inputU, conseq=0, num1, num2, corrette=0, tentativi=0;
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
                corrette++;
                System.out.println("corretto");
            }
            else
                System.out.println("errato, la risposta corretta è: " + result);
            tentativi++;
        } while (conseq <= 5);
        return corrette/100*tentativi;
    }
/**
 * Generates random fractions and tests the user's ability to determine the nature of the fraction.
 * The method assesses whether the fraction is proper, improper, or equivalent, and evaluates the user's input accordingly.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int frazioniLv1(){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int inputU, conseq=0, numeratore, denominatore, corrette=0, tentativi=0;
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
            if (inputU == tipoFrazione){
                conseq++;
                corrette++;
            }
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random fractions and tests the user's ability to reduce the fractions to their lowest terms.
 * The method evaluates the user's input and provides feedback based on the reduced form of the fractions.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int frazioniLv2(){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int inputUN, inputUD, conseq=0, numeratoreNMCD, denominatoreNMCD, numeratoreSMCD, denominatoreSMCD, tentativi=0, corrette=0;
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
                corrette++;
            }
            else
                System.out.println("errato, la frazione ridotta ai minimi termini è: " + numeratoreSMCD + "/" + denominatoreSMCD);
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random fractions and tests the user's ability to multiply and reduce the resulting fractions to their lowest terms.
 * The method evaluates the user's input and provides feedback based on the multiplication and reduced form of the fractions.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int frazioniLv3(){
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int numeratore1, numeratore2, denominatore1, denominatore2, numeratoreRis, denominatoreRis, numeratoreRisMCD, denominatoreRisMCD, inputUD, inputUN, conseq=0, corrette=0, tentativi=0;
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
                corrette++;
            }
            else
                System.out.println("errato, la frazione ridotta ai minimi termini è: " + numeratoreRisMCD + "/" + denominatoreRisMCD);
            tentativi++;
            } while (conseq <= 5);
        return corrette/100*tentativi;
    }
/**
 * Generates random fractions and tests the user's ability to add the fractions and reduce the resulting fraction to its lowest terms.
 * The method evaluates the user's input and provides feedback based on the sum and reduced form of the fractions.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int frazioniLv4(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int numeratore1, numeratore2, denominatore1, denominatore2, numeratoreRis, denominatoreRis, MCDDenominatori, inputUD, inputUN, conseq=0,corrette=0, tentativi=0;
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
                corrette++;
            }
            else
                System.out.println("errato, la frazione ridotta ai minimi termini è: " + numeratoreRis + "/" + denominatoreRis);
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * This method calculates the greatest common divisor (GCD) of two integers, 'a' and 'b', using the Euclidean algorithm.
 * The method is implemented as a recursive function that repeatedly applies the formula 'MCD(b, a % b)' until the remainder is zero.
 * When the remainder becomes zero, the method returns the value of 'a', which represents the GCD.
 *
 * @param a the first integer
 * @param b the second integer
 * @return the greatest common divisor (GCD) of the two input integers, 'a' and 'b'
 */
    public static int MCD (int a, int b){
        if (b == 0)
            return a;
        else
            return MCD(b, a%b);
    }

/**
 * Generates random decimal numbers and tests the user's ability to convert them to binary.
 * The method evaluates the user's input and provides feedback based on the converted binary representation of the decimal numbers.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int equivalenzeLv1(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0, corrette=0, tentativi=0;
        String bin, inputU;
        do {
            num=rd.nextInt(1023);
            bin = decToBin(num);
            System.out.println("Trasforma in binario il seguente numero decimale: " + num);
            inputU = in.nextLine();
            if (inputU == bin){
                corrette++;
                conseq++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + bin);
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random binary numbers and tests the user's ability to convert them to decimal.
 * The method evaluates the user's input and provides feedback based on the converted decimal representation of the binary numbers.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int equivalenzeLv2(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0, inputU, corrette=0, tentativi=0;
        String bin;
        do {
            num=rd.nextInt(1023);
            bin = decToBin(num);
            System.out.println("Trasforma in decimale il seguente numero binario: " + num);
            inputU = in.nextInt();
            if (inputU == num){
                conseq++;
                corrette++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + bin);
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random hexadecimal numbers and tests the user's ability to convert them to binary.
 * The method evaluates the user's input and provides feedback based on the converted binary representation of the hexadecimal numbers.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int equivalenzeLv3(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0, corrette=0, tentativi=0;
        String hex, bin, inputU;
        do {
            num=rd.nextInt(1023);
            bin  = decToBin(num);
            hex = decToHex(num);
            System.out.println("Trasforma in binario il seguente numero esadecimale: " + bin);
            inputU = in.nextLine();
            if (inputU == hex){
                conseq++;
                corrette++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + hex);
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random binary numbers and tests the user's ability to convert them to hexadecimal.
 * The method evaluates the user's input and provides feedback based on the converted hexadecimal representation of the binary numbers.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int equivalenzeLv4(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0, corrette=0, tentativi=0;
        String hex, bin, inputU;
        do {
            num=rd.nextInt(1023);
            bin  = decToBin(num);
            hex = decToHex(num);
            System.out.println("Trasforma in esadecimale il seguente numero binario: " + hex);
            inputU = in.nextLine();
            if (inputU == bin){
                conseq++;
                corrette++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + bin);
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * This method converts a decimal number to its binary representation.
 *
 * @param num The decimal number to be converted.
 * @return The binary representation of the input decimal number.
 */
    public static String decToBin(int num) {
        return Integer.toBinaryString(num);
    }
/**
 * This method converts a decimal number to its hexadecimal representation.
 *
 * @param num The decimal number to be converted.
 * @return The hexadecimal representation of the input decimal number.
 */
    public static String decToHex(int num){
        return Integer.toHexString(num);
    }

/**
 * Generates random squares and tests the user's ability to calculate the area and perimeter of the square.
 * The method evaluates the user's input and provides feedback based on the calculated area and perimeter of the square.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int geometria1(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int lato,area,perimetro,inputU,conseq=0, corrette=0, tentativi=0;
        do {
            lato = rd.nextInt(10000);
            area = lato * lato;
            perimetro = lato * 2;
            System.out.println("Quale è il perimetro del quadrato di lato " + lato);
            inputU = in.nextInt();
            if (inputU == perimetro){
                System.out.println("Quale è l'area del quadrato di lato " + lato);
                inputU = in.nextInt();
                if (inputU == area)
                    conseq++;
                    corrette++;
            }
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random isosceles triangles and squares, and tests the user's ability to identify which occupies a larger surface area.
 * The method evaluates the user's input and provides feedback based on the comparison between the areas of the generated shapes.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int geometria2(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int latoTI, areaTI, altezzaTI, latoQ, areaQ, conseq=0, tentativi=0, corrette=0;
        String inputU;
        do {
            latoTI = rd.nextInt(10000);
            latoQ = rd.nextInt(10000);
            altezzaTI = (int) (Math.sqrt((latoTI * latoTI) - ((latoTI / 2) * (latoTI / 2))));
            areaTI = (latoTI * altezzaTI) / 2;
            areaQ = latoQ * latoQ;
            System.out.println("Occupa la superficie maggiore un triangolo isoscele[TI] di lato " + latoTI + " o un quadrato di lato[Q] " + latoQ);
            System.out.println("Rispondi con Q per il quadrato e TI per il triangolo isosciele");
            inputU=in.nextLine();
            if (areaQ < areaTI)
                if (inputU == "TI"){
                    conseq++;
                    corrette++;
                }
            else
                if (inputU == "Q"){
                    conseq++;
                    corrette++;
                }
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random cubes and tests the user's ability to calculate the volume of the cube.
 * The method evaluates the user's input and provides feedback based on the calculated volume of the cube.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int geometria3(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int lato,volume,inputU,conseq=0,corrette=0,tentativi=0;
        do {
            lato = rd.nextInt(10000);
            volume = lato * lato * lato;
            System.out.println("Quale è il Volume del quadrato di lato " + lato);
            inputU = in.nextInt();
            if (inputU == volume){
                    conseq++;
                    corrette++;
            }
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
/**
 * Generates random parallelepipeds and squares and tests the user's ability to identify which occupies a larger volume.
 * The method evaluates the user's input and provides feedback based on the comparison between the volumes of the generated shapes.
 *
 * @return The ratio of correct answers to the total number of attempts made by the user.
 */
    public static int geometria4(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int latoP, altezzaP, profonditaP, volumeP, latoQ, volumeQ, conseq=0,corrette=0,tentativi=0;
        String inputU;
        do {
            latoP = rd.nextInt(10000);
            profonditaP = rd.nextInt(10000);
            altezzaP = rd.nextInt(10000);
            latoQ = rd.nextInt(10000);
            volumeP = latoP*altezzaP*profonditaP;
            volumeQ = latoQ * latoQ * latoQ;
            System.out.println("Occupa un area maggiore un parallelepipeto[P] di lato " + latoP + " o un quadrato di lato[Q] " + latoQ);
            System.out.println("Rispondi con Q per il quadrato e P per il parallelepipeto");
            inputU=in.nextLine();
            if (volumeP < volumeQ)
                if (inputU == "Q"){
                    conseq++;
                    corrette++;
                }
            else if ((volumeP > volumeQ))
                if (inputU == "P"){
                    conseq++;
                    corrette++;
                }
            else if ((volumeP == volumeQ))
                if (inputU == "P" || inputU == "Q"){
                    conseq++;
                    corrette++;
                }
            tentativi++;
        } while (conseq<=5);
        return corrette/100*tentativi;
    }
}
