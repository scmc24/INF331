
package inf3312.concepts;

public class TestAffichable{

    public static void main(String[] args){

        Object[] objets = new Object[2];

        objets[0] = new Entier(25);
        objets[1] = new Flottant(1.25);

        for(objet : objets){
            objet.affiche();
        }
    }
}