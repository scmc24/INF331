
package inf3312.concepts;

public class TestCompte{

    public static void main(String[] args){

        Compte[] comptes = new Compte[3];

        comptes[0] = new Compte("A1234","Sokoudjou",10000);
        comptes[1] = new CompteEpargne("A1235","Scm24",15000);
        comptes[2] = new CompteSecurise("A1236","John",18000);

        for(Compte compte : comptes){
            compte.Retirer(11000);
        }
    }
}