import java.util.Random;
import java.util.Scanner;

public class GiocoMorra {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    int vittorieUser = 0, vittoriePC = 0, partiteDaGiocare = 0;
    char scelataGiocatore = 'S';

    System.out.println("Quante partite vuoi giocare?");
    partiteDaGiocare = input.nextInt();
    input.nextLine();
    for (int i = 0; i < partiteDaGiocare; i++){
        System.out.println("Cosa giochi? [S/C/F]");
        scelataGiocatore = input.nextLine().charAt(0);
        if (scelataGiocatore == 'S' && LettCas(2) == 'F')
            vittorieUser++;
        else if (scelataGiocatore == 'S' && LettCas(2) == 'C')
            vittoriePC++;
        else if (scelataGiocatore == 'C' && LettCas(2) == 'F')
            vittoriePC++;
        else if (scelataGiocatore == 'C' && LettCas(2) == 'S')
            vittorieUser++;
        else if (scelataGiocatore == 'F' && LettCas(2) == 'S')
            vittoriePC++;
        else if (scelataGiocatore == 'F' && LettCas(2) == 'C')
            vittorieUser++;
    }
    System.out.println("La partita si è conclusa con " + vittorieUser + " vittorie dell'utente, " + vittoriePC + " vittorie dal pc");
    if (vittoriePC > vittorieUser)
        System.out.println("Il vinvitore è il computer");
    else
        System.out.println("il vincitore è l'user");
    input.close();
    }

    public static char LettCas(int a){
    Random random = new Random();
    int valoreNum;
    char valoreChar = 'S';
    valoreNum = random.nextInt(a);
    if (valoreNum == 0)
        valoreChar = 'S';
    else if(valoreNum == 1)
        valoreChar = 'C';
    else if (valoreNum == 2)
        valoreChar = 'F';
    return valoreChar;
    }
}
