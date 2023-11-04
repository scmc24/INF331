
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

    public void afficheCol(){
        super.afficherPoint();
        System.out.println("couleur : ",couleur);
    }
}