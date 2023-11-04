
package inf3312.concepts;

public class TestPoint{

    public static void main(String[] args){

        Point[] points = new Point[4];
        byte b = 2;
        
        points[0] = new Point();
        System.out.println("Point 1  : \n");
        points[0].afficher();
        points[0].deplacer(1,1);
        points[0].afficher();
        points[0].identifie();
        System.out.println("\n");
        System.out.println("Point 2  : \n");
        points[1] = new Point(2,2);
        points[1].afficher();
        points[1].deplacer(1,1.5);
        points[1].afficher();
        points[1].identifie();
        System.out.println("\n");
        System.out.println("Point 3  : \n");
        points[2] = new Point(points[1]);
        points[2].afficher();
        points[2].deplacer(4,2.5);
        points[2].afficher();
        points[2].identifie();
        points[3] = new Pointcol(1,3,b);
        System.out.println("\n Point 4  : \n");
        points[3].afficher();
        points[3].identifie();


    }
}