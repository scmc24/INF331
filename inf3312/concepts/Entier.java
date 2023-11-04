
package inf3312.concepts;

public class Entier extends Affichable{

    private int i;

    public Entier(int i) {
     this.i = i;
    }

    @Override
    public void affiche(){
        System.out.println("Je suis un entier de valeur "+i);
    }
}