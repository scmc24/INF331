
package inf3312.concepts;

public class TestPoint{

    public static void main(String[] args){

        Point[] points = new Point[3];
        PointCol pointC = new PointCol(1,3,2);
        points[0] = new Point();
        System.out.println("Point 1  : \n");
        points[0].afficherPoint();
        points[0].deplacer(1,1);
        points[0].afficherPoint();
        System.out.println("\n");
        System.out.println("Point 2  : \n");
        points[1] = new Point(2,2);
        points[1].afficherPoint();
        points[1].deplacer(1,1.5);
        points[1].afficherPoint();
        System.out.println("\n");
        System.out.println("Point 3  : \n");
        points[2] = new Point(points[1]);
        points[2].afficherPoint();
        points[2].deplacer(4,2.5);
        points[2].afficherPoint();
        pointC.afficheCol();


    }
}