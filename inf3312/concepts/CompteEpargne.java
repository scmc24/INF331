
package inf3312.concepts;

public class CompteEpargne extends Compte{

    
  private double taux;

  public CompteEpargne(String Numero, String Proprietaire, int montant){
    super(Numero,Proprietaire,montant);
    int solde = getSolde();
    solde += (taux*solde)/100;
    setSolde(solde);
  }
}