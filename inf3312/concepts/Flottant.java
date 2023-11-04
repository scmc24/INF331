
package inf3312.concepts;

public class Flottant extends Affichable{
    
      private float f;

    public Flottant(float f) {
     this.f = f;
    }

    @Override
    public void affiche(){
        System.out.println("Je suis un flottant de valeur "+f);
        
    }
}