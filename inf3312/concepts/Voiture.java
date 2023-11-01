
package inf3312.concepts;

public class Voiture{

    // attributs
    private String nom;
    private int puissance;
    private boolean estDemarre;
    private double vitesse;


    public Voiture(String nom, int puissance,
     boolean estDemarre, double vitesse){

        this.nom = nom;
        this.puissance = puissance;
        this.estDemarre = estDemarre;
        this.vitesse = vitesse;
     }

     public void demarre(){
      estDemarre = true;
     }

     public void accelere(double v){
      if(estDemarre){
         vitesse+=v;
      }
     }

     public void afficher(){
      System.out.println("Voiture : "+
      this.toString());
      System.out.println("Nom :"+ nom);
      System.out.println("Puissance :"+puissance);
      System.out.println("estDemarree ? :"+estDemarre);
      System.out.println("vitesse :"+vitesse);
     }



     
}