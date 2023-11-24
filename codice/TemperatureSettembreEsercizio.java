import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TemperatureSettembreEsercizio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] temperatureSettembre = new int[30];
        int input;
        controlloTemperatureUtente(temperatureSettembre);
        System.out.println("Cosa vuoi fare?\n1.Trova la temperatura minima\n2.Trova la temperatura massima\n3.I giorni in cui la temperatura è sopra la media\n4.cercare una temperatura\n5.Visualizza tabella dell temeperature\n6.Visualizza periodo con temperatura cosante più lungo\n7.Quanti giorni si è passati da una temperatura più rigida ad una più mite");
        input = in.nextInt();
        switch (input) {
            case 1:
                temperaturaMinore(temperatureSettembre);
                break;
            case 2:
                temperaturaMaggiore(temperatureSettembre);
                break;
            case 3:
                giorniSopraESottoLaMedia(temperatureSettembre);
                break;
            case 4:
                cercareTemperatura(temperatureSettembre);
                break;
            case 5:
                visualizzaTabella(temperatureSettembre);
                break;
            case 6:
                visualizzaPeriodoConTemperaturaCosantePiuLungo(temperatureSettembre);
                break;
            case 7:
                giorniTrascorsiDaRigidaAMite(temperatureSettembre);
                break;
            default:
                break;
        }
    }

        public static void generaTemperature(int[] array){
        Random rd = new Random();
        for(int i=0; i<array.length; i++)
            array[i] = rd.nextInt(28-15)+15;
    }

    public static void controlloTemperatureUtente(int[] array){
        Scanner in = new Scanner(System.in);
        char input='n';
        do {
            generaTemperature(array);
            System.out.println("Vanno bene queste temperature? [y/n]");
            System.out.println(Arrays.toString(array));
            input = in.nextLine().charAt(0);
        } while (input == 'n');
    }

    public static void temperaturaMinore(int[] array) {
        int temperaturaMinore = array[trovaMinore(array)];
        int[] posizioneGiorni = new int[array.length];
        posizioneGiorni = giorniConXTemperatura(array, temperaturaMinore);
        System.out.println("La temperatura minima è " + temperaturaMinore);
        for (int i = 0; i < posizioneGiorni.length; i++) {
            if (posizioneGiorni[i] != 0)
                System.out.println("La temeperatura minima la troviamo il giorno: " + posizioneGiorni[i]);
        }
    }


    public static int trovaMinore(int[] array){
        int posmin=0, min=array[0];
        for (int i=1; i<array.length; i++){
            if(array[i] < min) {
                posmin = i;
                min=array[i];
            }
        }
        return posmin;
    }

    public static void temperaturaMaggiore(int[] array) {
        int temperaturaMaggiore = array[trovaMaggiore(array)];
        int[] posizioneGiorni = new int[array.length];
        posizioneGiorni = giorniConXTemperatura(array, temperaturaMaggiore);
        System.out.println("La temperatura minima è " + temperaturaMaggiore);
        for (int i = 0; i < posizioneGiorni.length; i++) {
            if (posizioneGiorni[i] != 0)
                System.out.println("La temeperatura massima la troviamo il giorno: " + posizioneGiorni[i]);
        }
    }

    public static int trovaMaggiore(int[] array){
        int posmax=0, max=array[0];
        for (int i=1; i<array.length; i++){
            if(array[i] > max) {
                posmax = i;
                max = array[i];
            }
        }
        return posmax;
    }

    public static int[] giorniConXTemperatura(int[] array, int temperaturaMinima){
        int[] giorni = new int[array.length];
        int posizioneGiorni=0;
        for (int i=0; i<array.length; i++){
            if (array[i] == temperaturaMinima){
                giorni[posizioneGiorni] = i+1;
                posizioneGiorni++;
            }
        }
        return giorni;
    }

    public static void giorniSopraESottoLaMedia(int[] array){
        int media = calcolaMedia(array);
        System.out.println("La media è " + media);
        System.out.println("ci sono " + giorniConTemperatureSopraMedia(array, media) + " giorni sopra la media");
        System.out.println("ci sono " + giorniConTemperatureSottoMedia(array, media) + " giorni sotto la media");
    }

    public static int giorniConTemperatureSopraMedia(int[] array, int media){
        int giorni=0;
        for (int i=0; i<array.length; i++){
            if (array[i] > media)
                giorni++;
        }
        return giorni;
    }

    public static int giorniConTemperatureSottoMedia(int[] array, int media){
        int giorni=0;
        for (int i=0; i<array.length; i++){
            if (array[i] < media)
                giorni++;
        }
        return giorni;
    }

    public static int calcolaMedia(int[] array){
        int media=0;
        for (int i=0; i<array.length; i++){
            media = media + array[i];
        }
        media = media / array.length;
        return media;
    }

    public static void cercareTemperatura(int[] array){
        Scanner in = new Scanner(System.in);
        int[] arrayGiorni = new int[array.length];
        System.out.println("Inserisci la temperatura da cercare");
        int temperatura = in.nextInt();
        arrayGiorni = trovaTemperatura(array, temperatura);
        for (int i=0; i<array.length; i++){
            if (arrayGiorni[i] != 0)
                System.out.println("La temperatura " + temperatura + " la troviamo il giorno: " + arrayGiorni[i]);
        }
    }

    public static int[] trovaTemperatura(int[] array, int temperatura){
        int[] arrayReturn = new int[array.length];
        for (int i=0; i<array.length; i++){
            if (array[i] == temperatura)
                arrayReturn[i] = i+1;
        }
        return arrayReturn;
    }

    public static void visualizzaTabella(int[] array){
        int[] arrayPercentuali = new int[array.length];
        arrayPercentuali = calcoloPercentuali(array);
        for(int i=0; i<array.length; i++){
            System.out.println("Giorno: " + (i+1) + " Temperatura: " + array[i] + "° percentuale:" + arrayPercentuali[i] + "%");;
        }
    }

    public static int[] calcoloPercentuali(int[] array){
        int[] arrayPercentuali = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrayPercentuali[i] = trovaTemperaturaCalcoloMedia(array ,array[i]);
        }
        return arrayPercentuali;
    }

    public static int trovaTemperaturaCalcoloMedia(int[] array, int temperatura){
        int count = 0;
        for (int temp : array) {
            if (temp == temperatura) {
                count++;
            }
        }
        return (count * 100) / array.length;
    }

    public static void visualizzaPeriodoConTemperaturaCosantePiuLungo(int[] array) {
        int lunghezzaCorrente = 1;
        int inizioPeriodoCorrente = 0;
        int lunghezzaMassima = 1;
        int inizioPeriodoMassimo = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                lunghezzaCorrente++;
            } else {
                // Se la lunghezza del periodo corrente è maggiore di quella massima,
                // aggiorna la lunghezza massima e l'inizio del periodo massimo
                if (lunghezzaCorrente > lunghezzaMassima) {
                    lunghezzaMassima = lunghezzaCorrente;
                    inizioPeriodoMassimo = inizioPeriodoCorrente;
                }
                // Resetta i valori per il nuovo periodo corrente
                lunghezzaCorrente = 1;
                inizioPeriodoCorrente = i;
            }
        }
        // Se la lunghezza del periodo corrente è maggiore di quella massima,
        if (lunghezzaCorrente > lunghezzaMassima) {
            lunghezzaMassima = lunghezzaCorrente;
            inizioPeriodoMassimo = inizioPeriodoCorrente;
        }
        // Visualizza il periodo massimo
        if (lunghezzaMassima > 1) {
            System.out.println(
                    "Il periodo più lungo con temperatura costante è dal giorno " + (inizioPeriodoMassimo + 1) +
                            " al giorno " + (inizioPeriodoMassimo + lunghezzaMassima) +
                            " con temperatura " + array[inizioPeriodoMassimo] + "°.");
        } else {
            System.out.println("Non ci sono periodi con temperatura costante.");
        }
    }


    public static void giorniTrascorsiDaRigidaAMite(int[] array) {
            int giorniTrascorsi = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    // La temperatura è diventata più mite
                    giorniTrascorsi++;
                }
            }
            System.out.println("Giorni trascorsi da temperatura più rigida a più mite: " + giorniTrascorsi);
        }
}
