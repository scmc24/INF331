
package inf3312.concepts;

public class TestVoiture{

    public static void main(String[] args){

        // une premiere voiture
        Voiture maVoiture;

        maVoiture = new Voiture("Clio",10,false,0);

        maVoiture.demarre();
        maVoiture.accelere(120);

        // creation de la 2e
        Voiture maVoitureCopie;

        maVoitureCopie = new Voiture("Mercedez",5,false,1);
        maVoiture.afficher();
        System.out.println("\n");
        maVoitureCopie.afficher();
        System.out.println("\n");
        
        // affectation

        maVoiture = maVoitureCopie;
        maVoitureCopie.accelere(3);

        System.out.println("\n");
        maVoitureCopie.afficher();
    }
}