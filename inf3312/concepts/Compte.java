
package inf3312.concepts;

public class Compte{

    private String Numero;
    private String Proprietaire;
    private int Solde;

    public Compte(String Numero, String Proprietaire, int montant){

     this.Numero = Numero;
     this.Proprietaire = Proprietaire;
     this.Solde = montant;
    }
    
    public int getSolde(){
      return Solde;
    }
    public void setSolde(int solde){
      this.Solde = solde;
    }
    public void Deposer(int montant){

        if(montant>0){
            Solde+=montant;
        }
    }

    public void Retirer(int montant){

       
            Solde-=montant;
        
    }
}