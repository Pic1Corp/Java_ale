import java.util.Scanner;

public class MediaTerneDiNumeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumTerne, Num = 0, Obbiettivo, Media = 0, DiffMO;

        System.out.println("Quale è l'obbiettivo?");
        Obbiettivo = input.nextInt();
        System.out.println("Quale è il numero di terne?");
        NumTerne = input.nextInt();
        NumTerne *= 3;

        for(int i = 0; i != NumTerne; i++){
            System.out.println("Quali sono i numeri: ");
            Num = input.nextInt();
            Media+=Num;
        }

        Media=(Media/(NumTerne));

        if(Media<Obbiettivo){
            DiffMO = Obbiettivo-Media;
            System.out.println("ti si avvicinato al tuo obbiettivo di " + DiffMO);
        }
        else if(Media == Num){
            System.out.println("Hai raggiunto il tuo obbiettivo");
        }
        else if(Media>Obbiettivo){
            DiffMO = Media-Obbiettivo;
            System.out.println("ti si avvicinato al tuo obbiettivo di " + DiffMO);
        }

        input.close();

    }
}

