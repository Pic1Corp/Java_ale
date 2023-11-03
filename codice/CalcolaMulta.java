import java.util.Scanner;

public class CalcolaMulta {
    public static void main(String[] args) {
        // Definisci il limite di velocità e l'importo della multa per ogni intervallo di superamento
        final int limiteVelocita = 70;
        final int[] limitiSuperamento = {10, 20, 30, 40};
        final int[] importiMulta = {100, 150, 250, 300};
        final int importoMultaMassimo = 400;

        // Crea un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente la velocità a cui andava il veicolo
        System.out.print("Inserisci la velocità a cui andava il veicolo (in km/h): ");
        int velocitaVeicolo = scanner.nextInt();

        // Calcola il superamento del limite di velocità
        int superamentoLimite = velocitaVeicolo - limiteVelocita;

        // Calcola l'importo della multa in base all'entità del superamento
        int importoMulta = 0;
        if (superamentoLimite > 0) {
            for (int i = 0; i < limitiSuperamento.length; i++) {
                if (superamentoLimite <= limitiSuperamento[i]) {
                    importoMulta = importiMulta[i];
                    break;
                }
            }
            if (superamentoLimite > limitiSuperamento[limitiSuperamento.length - 1]) {
                importoMulta = importoMultaMassimo;
            }
        }

        // Stampare l'importo della multa
        if (importoMulta > 0) {
            System.out.println("L'importo della multa è di " + importoMulta + " euro.");
        } else {
            System.out.println("Non ci sono multe da pagare.");
        }

        // Chiudi lo scanner
        scanner.close();
    }
}
