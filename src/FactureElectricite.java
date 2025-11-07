//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class FactureElectricite {
    public static void main(String[] args) {

        double montant=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" le nombre d’unités consommées : ");
        double consommation = scanner.nextInt();

        if(consommation<=100){
            montant=consommation*0.8;
            System.out.println("Facture avant taxe : "+montant+"Dhs");
            System.out.println("Taxe (10%) :"+montant/10);
            montant += montant/10;
            System.out.println("le prix à payer (taxes inclus) "+montant+"Dhs");

        } else if (consommation<=300) {
            montant = 100 * 0.8 + (consommation - 100) * 1.2;
            System.out.println("Facture avant taxe : "+montant+"Dhs");
            System.out.println("Taxe (10%) :"+montant/10);
            montant += montant/10;
            System.out.println("le prix à payer (taxes inclus) "+montant+"Dhs");

        }else {
            montant = 100 * 0.8 + 200 * 1.2 + (consommation - 300) * 1.5;
            System.out.println("Facture avant taxe : "+montant+"Dhs");
            System.out.println("Taxe (10%) :"+montant/10);
            montant += montant/10;
            System.out.println("le prix à payer (taxes inclus) "+montant+"Dhs");
        }


    }
}