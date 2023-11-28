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
                visualizzaPeriodoConTemperaturaCostantePiuLungo(temperatureSettembre);
                break;
            case 7:
                giorniTrascorsiDaRigidaAMite(temperatureSettembre);
                break;
            default:
                break;
        }
    }

    /**
     * Genera e assegna temperature casuali a ciascun elemento dell'array specificato.
     * Le temperature generate sono comprese tra 15 e 27 gradi Celsius.
     *
     * @param array l'array in cui memorizzare le temperature generate.
     */
    public static void generaTemperature(int[] array) {
        Random rd = new Random();
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                // Genera una temperatura casuale compresa tra 15 e 27 gradi Celsius.
                array[i] = rd.nextInt(13) + 15;
            }
        }
    }

    /**
     * Consente all'utente di generare e controllare le temperature in un array.
     *
     * @param array l'array in cui memorizzare e controllare le temperature generate.
     *              Deve essere già inizializzato e della lunghezza desiderata.
     */
    public static void controlloTemperatureUtente(int[] array) {
        Scanner in = new Scanner(System.in);
        char input = 'n';
        if (array == null || array.length == 0) {
            // Nota: Senza la dichiarazione "throws" nel Javadoc, l'eccezione potrebbe
            // comunque essere gestita internamente nel metodo senza notificare l'utente.
            System.err.println("Errore: L'array non può essere nullo o vuoto.");
            return;
        }
        do {
            // Genera le temperature nell'array.
            generaTemperature(array);
            // Richiede all'utente di confermare o modificare le temperature generate.
            System.out.println("Vanno bene queste temperature? [y/n]");
            System.out.println(Arrays.toString(array));
            input = in.nextLine().charAt(0);
        } while (input == 'n');
    }

    /**
     * Trova e stampa la temperatura minima nell'array e i giorni in cui si verifica.
     *
     * @param array l'array contenente le temperature da analizzare.
     */
    public static void temperaturaMinore(int[] array) {
        int temperaturaMinore = array[trovaMinore(array)];
        int[] posizioneGiorni = giorniConXTemperatura(array, temperaturaMinore);
        System.out.println("La temperatura minima è " + temperaturaMinore);
        for (int i = 0; i < posizioneGiorni.length; i++) {
            if (posizioneGiorni[i] != 0) {
                System.out.println("La temperatura minima si verifica il giorno: " + posizioneGiorni[i]);
            }
        }
    }

    /**
     * Trova e restituisce l'indice del valore minimo nell'array.
     *
     * @param array l'array in cui cercare il valore minimo.
     * @return l'indice del valore minimo nell'array.
     */
    public static int trovaMinore(int[] array) {
        int posmin = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                posmin = i;
                min = array[i];
            }
        }
        return posmin;
    }

    /**
     * Trova e stampa la temperatura massima nell'array e i giorni in cui si verifica.
     *
     * @param array l'array contenente le temperature da analizzare.
     */
    public static void temperaturaMaggiore(int[] array) {
        int temperaturaMaggiore = array[trovaMaggiore(array)];
        int[] posizioneGiorni = giorniConXTemperatura(array, temperaturaMaggiore);
        System.out.println("La temperatura massima è " + temperaturaMaggiore);
        for (int i = 0; i < posizioneGiorni.length; i++) {
            if (posizioneGiorni[i] != 0) {
                System.out.println("La temperatura massima si verifica il giorno: " + posizioneGiorni[i]);
            }
        }
    }

    /**
     * Trova e restituisce l'indice del valore massimo nell'array.
     *
     * @param array l'array in cui cercare il valore massimo.
     * @return l'indice del valore massimo nell'array.
     */
    public static int trovaMaggiore(int[] array) {
        int posmax = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                posmax = i;
                max = array[i];
            }
        }
        return posmax;
    }

    /**
     * Trova e restituisce un array contenente gli indici dei giorni in cui la temperatura
     * è uguale a quella specificata.
     *
     * @param array l'array contenente le temperature da analizzare.
     * @param temperaturaMinima la temperatura di riferimento da cercare nei giorni.
     * @return un array contenente gli indici dei giorni in cui la temperatura è uguale a quella specificata.
     */
    public static int[] giorniConXTemperatura(int[] array, int temperaturaMinima) {
        int[] giorni = new int[array.length];
        int posizioneGiorni = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == temperaturaMinima) {
                giorni[posizioneGiorni] = i + 1;
                posizioneGiorni++;
            }
        }
        return giorni;
    }

    /**
     * Stampa il numero di giorni sopra e sotto la media delle temperature dell'array.
     *
     * @param array l'array contenente le temperature da analizzare.
     */
    public static void giorniSopraESottoLaMedia(int[] array) {
        int media = calcolaMedia(array);
        System.out.println("La media è " + media);
        System.out.println("Ci sono " + giorniConTemperatureSopraMedia(array, media) + " giorni sopra la media");
        System.out.println("Ci sono " + giorniConTemperatureSottoMedia(array, media) + " giorni sotto la media");
    }

    /**
     * Conta e restituisce il numero di giorni con temperature sopra la media specificata.
     *
     * @param array l'array contenente le temperature da analizzare.
     * @param media la media di riferimento per confrontare le temperature.
     * @return il numero di giorni con temperature sopra la media.
     */
    public static int giorniConTemperatureSopraMedia(int[] array, int media) {
        int giorni = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                giorni++;
            }
        }
        return giorni;
    }

    /**
     * Conta e restituisce il numero di giorni con temperature sotto la media specificata.
     *
     * @param array l'array contenente le temperature da analizzare.
     * @param media la media di riferimento per confrontare le temperature.
     * @return il numero di giorni con temperature sotto la media.
     */
    public static int giorniConTemperatureSottoMedia(int[] array, int media) {
        int giorni = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < media) {
                giorni++;
            }
        }
        return giorni;
    }

    /**
     * Calcola e restituisce la media delle temperature nell'array.
     *
     * @param array l'array contenente le temperature da analizzare.
     * @return la media delle temperature nell'array.
     */
    public static int calcolaMedia(int[] array) {
        int somma = 0;
        for (int i = 0; i < array.length; i++) {
            somma = somma + array[i];
        }
        int media = somma / array.length;
        return media;
    }

    /**
     * Cerca e stampa i giorni in cui la temperatura corrisponde a quella specificata.
     *
     * @param array l'array contenente le temperature da analizzare.
     */
    public static void cercareTemperatura(int[] array) {
        Scanner in = new Scanner(System.in);
        int[] arrayGiorni = new int[array.length];
        System.out.println("Inserisci la temperatura da cercare");
        int temperatura = in.nextInt();
        arrayGiorni = trovaTemperatura(array, temperatura);
        for (int i = 0; i < array.length; i++) {
            if (arrayGiorni[i] != 0) {
                System.out.println("La temperatura " + temperatura + " la troviamo il giorno: " + arrayGiorni[i]);
            }
        }
    }

    /**
     * Trova e restituisce un array contenente gli indici dei giorni in cui la temperatura
     * corrisponde a quella specificata.
     *
     * @param array l'array contenente le temperature da analizzare.
     * @param temperatura la temperatura di riferimento da cercare nei giorni.
     * @return un array contenente gli indici dei giorni in cui la temperatura corrisponde a quella specificata.
     */
    public static int[] trovaTemperatura(int[] array, int temperatura) {
        int[] arrayReturn = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == temperatura) {
                arrayReturn[i] = i + 1;
            }
        }
        return arrayReturn;
    }

    /**
     * Visualizza una tabella con i dati dei giorni, temperature e percentuali.
     *
     * @param array l'array contenente le temperature da analizzare.
     */
    public static void visualizzaTabella(int[] array) {
        int[] arrayPercentuali = new int[array.length];
        arrayPercentuali = calcoloPercentuali(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Giorno: " + (i + 1) + " Temperatura: " + array[i] + "° Percentuale: " + arrayPercentuali[i] + "%");
        }
    }

    /**
     * Calcola e restituisce un array contenente le percentuali delle temperature rispetto alla media.
     *
     * @param array l'array contenente le temperature da analizzare.
     * @return un array contenente le percentuali delle temperature rispetto alla media.
     */
    public static int[] calcoloPercentuali(int[] array) {
        int[] arrayPercentuali = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayPercentuali[i] = trovaTemperaturaCalcoloMedia(array, array[i]);
        }
        return arrayPercentuali;
    }

    /**
     * Trova e restituisce la percentuale di occorrenze di una temperatura rispetto al totale degli elementi.
     *
     * @param array l'array contenente le temperature da analizzare.
     * @param temperatura la temperatura di riferimento da contare.
     * @return la percentuale di occorrenze della temperatura rispetto al totale degli elementi.
     */
    public static int trovaTemperaturaCalcoloMedia(int[] array, int temperatura) {
        int count = 0;
        for (int temp : array) {
            if (temp == temperatura) {
                count++;
            }
        }
        return (count * 100) / array.length;
    }


    /**
     * Visualizza il periodo più lungo con temperatura costante nell'array.
     *
     * @param array l'array contenente le temperature da analizzare.
     */
    public static void visualizzaPeriodoConTemperaturaCostantePiuLungo(int[] array) {
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
                            " con temperatura " + array[inizioPeriodoMassimo] + "°."
            );
        } else {
            System.out.println("Non ci sono periodi con temperatura costante.");
        }
    }

    /**
     * Calcola e stampa il numero di giorni trascorsi da temperatura più rigida a più mite.
     *
     * @param array l'array contenente le temperature da analizzare.
     */
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
