import java.util.Scanner;

public class Répartitionsalle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("entrer le nombre d etudiant :");
        int n=scan.nextInt();
        System.out.print("entrer le nombre de bancs :");
        int m=scan.nextInt();
        int capatotale=m*2;
        // System.out.print(capatotale);
        if(n>capatotale){
            System.out.printf("il ya %d etudiant,mais seulement %d  places qui sont dispo\n ",n,capatotale);
        }
        int etudiantactuel=1;
        for(int i=1;i<=m;i++){
            System.out.printf("banc %d :",i);
            int nbredetudiantsurbanc=0;
            while(nbredetudiantsurbanc<2  && etudiantactuel<=n){
                System.out.printf("Etudiant %d ",etudiantactuel);
                nbredetudiantsurbanc++;
                etudiantactuel++;
                if (nbredetudiantsurbanc < 2 && etudiantactuel <= n) {
                    System.out.print(", ");
                }
            }
            System.out.println();


        }
        if(etudiantactuel<=n){
            for(int i=etudiantactuel;i<=n;i++){
                System.out.printf("l etudiant %d ne trouve pas de place\n ",i);
            }
            System.out.println();
        }

    }
}





