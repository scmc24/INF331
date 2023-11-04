
package inf3312.concepts;

public class Flottant implements Affichable{
    
      private double f;

    public Flottant(double f) {
     this.f = f;
    }

   @Override
    public void affiche(){
        System.out.println("Je suis un flottant de valeur "+f);
    }
    
}