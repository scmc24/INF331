
package inf3312.concepts;

public class Flottant extends Affichable{
    
      private double f;

    public Flottant(double f) {
     this.f = f;
    }

   
    public void affiche(){
        System.out.println("Je suis un flottant de valeur "+f);
        
    }
}