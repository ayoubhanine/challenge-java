import java.util.Scanner;

public class Robonavig {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.print(" donner la commande : UP,DOWN,LEFT,RIGHT :");
        String commandes = s.nextLine();
        String[] listecommandes = commandes.split(",");
        for (String commande : listecommandes) {
            switch (commande) {
                case "UP":
                    y += 1;
                    break;
                case "DOWN":y-=1;break;
                case "LEFT":x-=1;break;
                case "RIGHT":x+=1;break;
                default:System.out.println("commande invalide");
            }
        }
        System.out.println("position finale :(" + x+ "," + y+ ")");
        if(x==0&&y==0){
            System.out.println("Le robot est revenu au point de départ ");
        }
        else{
            System.out.println("Le robot n est pas revenu au point de départ ");
        }

    }
}

