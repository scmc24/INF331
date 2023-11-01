
package inf3312.concepts;

import java.util.Scanner;

public class TestDivision{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Entrer 2 nombre pour diviser : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        
        Division div = new Division();
        System.out.println("Division par methode de la classe : \n");
        System.out.println(x+"/"+y+" = "+ div.diviser(x,y) );
        System.out.println("\n\n");
        System.out.println("Division par methode de classe : \n");
        System.out.println(x+"/"+y+" = "+ Division.diviserS(x,y) );
    }
}