import java.util.Random;
import java.util.Scanner;

public class TestMatematicaEs {
    public static void main(String[] args) {
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
                regoleCV();
                calcoloVeloce();
                break;
            case 2:
                frazioni();
                break;
            case 3:
                equivalenze();
                break;
            case 4:
                geometria();
                break;
            default:
                System.out.println("opzione non valida");
                break;
        }
        in.close();
    }
/**
 * Prints the rules for the "Fast Calculation" game on the console.
 * The rules include instructions to solve addition, subtraction, division, and multiplication operations.
 * After successfully solving 5 consecutive operations, the player will move to the next set of operations.
 * The number of digits is determined by the user-selected level.
 * The division operation rounds to obtain the result as an integer.
 *
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
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
 * @return void
 */
    public static void regoleG4(){
        System.out.println("Ti verrà fornita la lunghezza del lato di un cubo e le misure di base, altezza e profondità di un parallelepipedo.\r\n" + 
            "Devi identificare quale figura geometrica occupa il maggior volume tra il cubo e il parallelepipedo.\r\n" + 
            "Scrivi quale figura geometrica occupa il maggiore volume.\r\n" + 
            "Dopo aver completato correttamente 5 esercizi consecutivi avrai finito il livello 4.\r\n" + 
            "Buona fortuna!");
    }

/**
 * This method facilitates the Fast Calculation game by setting the difficulty level and performing various arithmetic operations.
 * The method prompts the user to input the difficulty level and calculates the maximum and minimum numbers based on the level.
 * It then proceeds to perform addition, subtraction, multiplication, and division operations within the given range of numbers.
 * 
 * @return void
 */
    public static void calcoloVeloce(){
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
        somma(numCifMin,numCifMax); // Calls the method for somma
        sottrazione(numCifMin,numCifMax); // Calls the method for sottrazione
        moltiplicazioni(numCifMin, numCifMax); // Calls the method for moltiplicazioni
        divisioni(numCifMin, numCifMax); // Calls the method for divisioni
    }
/**
 * This method allows the user to choose a level for the Fractions game and provides options for different fraction exercises.
 * The method displays a menu of options, allowing the user to select various operations related to fractions based on the chosen level.
 * After selecting the desired level, the corresponding fraction exercise is performed, following the predefined rules for each level.
 * The method uses a do-while loop to continuously prompt the user for their choice until a valid option is selected.
 * 
 * @return void
 */
    public static void frazioni(){
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
                    frazioniLv1(); // Starts exercises for Level 1
                    break;
                case 2:
                    regoleF2();  // Displays rules for Level 2
                    frazioniLv2(); // Starts exercises for Level 2
                    break;
                case 3:
                    regoleF3(); // Displays rules for Level 3
                    frazioniLv3(); // Starts exercises for Level 3
                    break;
                case 4:
                    regoleF4(); // Displays rules for Level 4
                    frazioniLv4(); // Starts exercises for Level 4
                    break;
                default:
                    System.out.println("opzione non valida");
                    break;
            }
        }while(true);
    }
/**
 * This method allows the user to choose a level for the Equivalences game and provides options for different conversion operations.
 * The method displays a menu of options, allowing the user to select various conversion operations based on the chosen level.
 * After selecting the desired level, the corresponding conversion exercise is performed, following the predefined rules for each level.
 * The method uses a do-while loop to continuously prompt the user for their choice until a valid option is selected.
 * 
 * @return void
 */
    public static void equivalenze() {
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
                    equivalenzeLv1(); // Starts exercises for Level 1
                    break;
                case 2:
                    regoleEq2(); // Displays rules for Level 2
                    equivalenzeLv2(); // Starts exercises for Level 2
                    break;
                case 3:
                    regoleEq3(); // Displays rules for Level 3
                    equivalenzeLv3(); // Starts exercises for Level 3
                    break;
                case 4:
                    regoleEq4(); // Displays rules for Level 4
                    equivalenzeLv4(); // Starts exercises for Level 4
                    break;
                default:
                    System.out.println("opzione non valida");
                    break;
            }
        }while(true);
    }
/**
 * This method allows the user to choose a level for the Geometry game and provides options for different geometry-related exercises.
 * The method displays a menu of options, allowing the user to select various geometry exercises based on the chosen level.
 * After selecting the desired level, the corresponding geometry exercise is performed, following the predefined rules for each level.
 * The method uses a do-while loop to continuously prompt the user for their choice until a valid option is selected.
 * 
 * @return void
 */
    public static void geometria(){
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
                    geometria1(); // Starts exercises for Level 1
                    break;
                case 2:
                    regoleG2(); // Displays rules for Level 2
                    geometria2(); // Starts exercises for Level 2 
                    break;
                case 3:
                    regoleG3(); // Displays rules for Level 3
                    geometria3(); // Starts exercises for Level 3 
                    break;
                case 4:
                    regoleG4(); // Displays rules for Level 4
                    geometria4(); // Starts exercises for Level 4
                    break;
                default:
                    System.out.println("opzione non valida");
                    break;
            }
        }while(true);
    }

/**
 * This method generates random addition exercises within a given range and prompts the user to solve them.
 * The method takes two parameters, 'c' for the minimum number and 'd' for the maximum number in the range.
 * It utilizes the Random class to generate random numbers within the specified range for the addition operation.
 * The user is prompted to provide the sum of two randomly generated numbers.
 * If the user's input matches the correct result, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @param c The minimum number in the range for generating random numbers.
 * @param d The maximum number in the range for generating random numbers.
 * @return void
 */
    public static void somma(int c, int d){
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
/**
 * This method generates random subtraction exercises within a given range and prompts the user to solve them.
 * The method takes two parameters, 'b' for the minimum number and 'a' for the maximum number in the range.
 * It utilizes the Random class to generate random numbers within the specified range for the subtraction operation.
 * The method ensures that the first randomly generated number is greater than or equal to the second one to avoid negative results.
 * The user is prompted to provide the difference between the two randomly generated numbers.
 * If the user's input matches the correct result, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @param b The minimum number in the range for generating random numbers.
 * @param a The maximum number in the range for generating random numbers.
 * @return void
 */
    public static void sottrazione(int b, int a){
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
/**
 * This method generates random multiplication exercises within a given range and prompts the user to solve them.
 * The method takes two parameters, 'a' for the minimum number and 'b' for the maximum number in the range.
 * It utilizes the Random class to generate random numbers within the specified range for the multiplication operation.
 * The user is prompted to provide the product of two randomly generated numbers.
 * If the user's input matches the correct result, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @param a The minimum number in the range for generating random numbers.
 * @param b The maximum number in the range for generating random numbers.
 * @return void
 */
    public static void moltiplicazioni(int a, int b){
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
/**
 * This method generates random division exercises within a given range and prompts the user to solve them.
 * The method takes two parameters, 'a' for the minimum number and 'b' for the maximum number in the range.
 * It utilizes the Random class to generate random numbers within the specified range for the division operation.
 * The method ensures that the divisor (num2) is not equal to zero to avoid division by zero errors.
 * The user is prompted to provide the result of dividing the first randomly generated number by the second one.
 * The division result is rounded up to the nearest integer using the Math.ceil method to match the rounding behavior specified in the method.
 * If the user's input matches the correct result, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @param a The minimum number in the range for generating random numbers.
 * @param b The maximum number in the range for generating random numbers.
 * @return void
 */
    public static void divisioni(int a, int b){
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

/**
 * This method generates random fractions and prompts the user to identify their nature (apparent[a], proper[p], or improper[i]).
 * The method utilizes the Random class to generate random numerators and denominators for the fractions.
 * The user is prompted to provide the nature of the fraction in the form of a character input.
 * 'a' represents an apparent fraction, 'p' represents a proper fraction, and 'i' represents an improper fraction.
 * If the user's input matches the correct nature of the fraction, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @return void
 */
    public static void frazioniLv1(){
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
/**
 * This method generates random fractions and prompts the user to reduce them to their lowest terms.
 * The method utilizes the Random class to generate random numerators and denominators for the fractions within the range of 0 to 100.
 * It ensures that the denominator is always positive to avoid negative fractions.
 * The method then calculates the simplified fraction by dividing both the numerator and the denominator by their greatest common divisor (GCD).
 * The user is prompted to provide the reduced form of the fraction by entering the numerator and the denominator separately.
 * If the user's input matches the simplified form of the fraction, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @return void
 */
    public static void frazioniLv2(){
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
/**
 * This method generates two random fractions and prompts the user to multiply them and reduce the result to its lowest terms.
 * The method utilizes the Random class to generate random numerators and denominators for both fractions within the range of 0 to 100.
 * It calculates the product of the two fractions and then simplifies the resulting fraction by dividing both the numerator and the denominator by their greatest common divisor (GCD).
 * The user is prompted to provide the reduced form of the resulting fraction by entering the numerator and the denominator separately.
 * If the user's input matches the simplified form of the fraction, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @return void
 */
    public static void frazioniLv3(){
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
/**
 * This method generates two random fractions and prompts the user to add them and reduce the result to its lowest terms.
 * The method utilizes the Random class to generate random numerators and denominators for both fractions within the range of 0 to 100.
 * It finds the greatest common divisor (GCD) of the denominators of both fractions and then calculates the sum of the two fractions with a common denominator.
 * The user is prompted to provide the sum in its reduced form by entering the numerator and the denominator separately.
 * If the user's input matches either the sum or the reduced form of the sum, the method increments the consecutive correct answers counter.
 * The method continues generating exercises until the user provides 5 consecutive correct answers.
 * 
 * @return void
 */
    public static void frazioniLv4(){
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
 * This method generates random decimal numbers and asks the user to convert them to binary. It checks the user's input against the correct binary conversion.
 * If the user's input matches the binary conversion, it increments the consecutive count. Otherwise, it informs the user of the correct answer.
 * The method continues this process until the consecutive count reaches 5.
 * 
 * @return void
 */
    public static void equivalenzeLv1(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0;
        String bin, inputU;
        do {
            num=rd.nextInt(1023);
            bin = decToBin(num);
            System.out.println("Trasforma in binario il seguente numero decimale: " + num);
            inputU = in.nextLine();
            if (inputU == bin){
                conseq++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + bin);
        } while (conseq<=5);
        
    }
/**
 * This method generates random binary numbers and asks the user to convert them to decimal. It checks the user's input against the correct decimal conversion.
 * If the user's input matches the decimal conversion, it increments the consecutive count. Otherwise, it informs the user of the correct answer.
 * The method continues this process until the consecutive count reaches 5.
 *
 * @return void
 */
    public static void equivalenzeLv2(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0, inputU;
        String bin;
        do {
            num=rd.nextInt(1023);
            bin = decToBin(num);
            System.out.println("Trasforma in decimale il seguente numero binario: " + num);
            inputU = in.nextInt();
            if (inputU == num){
                conseq++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + bin);
        } while (conseq<=5);
    }
/**
 * This method generates a random decimal number and its corresponding binary and hexadecimal representations. 
 * It asks the user to convert the decimal number to binary and checks the user's input against the correct binary conversion. 
 * If the user's input matches the binary conversion, it increments the consecutive count. Otherwise, it informs the user of the correct answer. 
 * The method continues this process until the consecutive count reaches 5.
 *
 * @return void
 */
    public static void equivalenzeLv3(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0;
        String hex, bin, inputU;
        do {
            num=rd.nextInt(1023);
            bin  = decToBin(num);
            hex = decToHex(num);
            System.out.println("Trasforma in binario il seguente numero esadecimale: " + bin);
            inputU = in.nextLine();
            if (inputU == hex){
                conseq++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + hex);
        } while (conseq<=5);
    }
/**
 * This method generates a random decimal number and its corresponding binary and hexadecimal representations. 
 * It asks the user to convert the binary number to hexadecimal and checks the user's input against the correct hexadecimal conversion. 
 * If the user's input matches the hexadecimal conversion, it increments the consecutive count. Otherwise, it informs the user of the correct answer. 
 * The method continues this process until the consecutive count reaches 5.
 *
 * @return void
 */
    public static void equivalenzeLv4(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int num, conseq=0;
        String hex, bin, inputU;
        do {
            num=rd.nextInt(1023);
            bin  = decToBin(num);
            hex = decToHex(num);
            System.out.println("Trasforma in esadecimale il seguente numero binario: " + hex);
            inputU = in.nextLine();
            if (inputU == bin){
                conseq++;
                System.out.println("Corretto");
            }
            else
                System.out.println("Errato! La risposta corretta è " + bin);
        } while (conseq<=5);
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
 * This method quizzes the user on the properties of a square.
 * It generates a random side length for a square and asks the user to provide the perimeter and area of the square.
 * 
 * @return void.
 */
    public static void geometria1(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int lato,area,perimetro,inputU,conseq=0;
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
            }
        } while (conseq<=5);
    }
/**
 * This method quizzes the user on which geometric figure occupies the larger area, a given isosceles triangle or a square.
 * It generates random side lengths for the triangle and the square, calculates their respective areas, and asks the user to identify which figure occupies the larger surface area.
 * 
 * @return void.
 */
    public static void geometria2(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int latoTI, areaTI, altezzaTI, latoQ, areaQ, conseq=0;
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
                if (inputU == "TI")
                    conseq++;
            else
                if (inputU == "Q")
                    conseq++;
        } while (conseq<=5);
    }
/**
 * This method quizzes the user on the volume of a cube with a given side length. It generates a random side length, calculates the cube's volume, and asks the user to provide the volume.
 * 
 * @return void.
 */
    public static void geometria3(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int lato,volume,inputU,conseq=0;
        do {
            lato = rd.nextInt(10000);
            volume = lato * lato * lato;
            System.out.println("Quale è il Volume del quadrato di lato " + lato);
            inputU = in.nextInt();
            if (inputU == volume){
                    conseq++;
            }
        } while (conseq<=5);
    }
/**
 * This method compares the volumes of a parallelepiped and a square. It generates random dimensions for the parallelepiped and the square, calculates their volumes, and asks the user to identify which figure occupies the greater volume.
 * 
 * @return void.
 */
    public static void geometria4(){
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        int latoP, altezzaP, profonditaP, volumeP, latoQ, volumeQ, conseq=0;
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
                if (inputU == "Q")
                    conseq++;
            else if ((volumeP > volumeQ))
                if (inputU == "P")
                    conseq++;
            else if ((volumeP == volumeQ))
                if (inputU == "P" || inputU == "Q")
                    conseq++;
        } while (conseq<=5);
    }
}