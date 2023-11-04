
package inf3312.concepts;

public class CompteSecurise extends Compte{

    
    public CompteSecurise(String Numero, String Proprietaire, int montant){
        super(Numero,Proprietaire,montant);
    }

    @Override 
    public void Retirer(int montant){

        if(getSolde()>=montant) super.Retirer(montant);
    }
}