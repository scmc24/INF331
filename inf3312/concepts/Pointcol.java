
package inf3312.concepts;

public class Pointcol extends Point{

    private byte couleur;

    public Pointcol(double x, double y, byte couleur) {
     super(x, y);
     this.couleur = couleur;
    }

    public void colorer(byte couleur){
     this.couleur = couleur;
    }
    
    @Override
    public void afficher(){

        super.afficher();
        System.out.print("couleur : "+couleur);
    }

    @Override
    public void identifie(){
        System.out.println("je suis un point colorer");
    }
}