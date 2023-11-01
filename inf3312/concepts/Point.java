
package inf3312.concepts;

public class Point{

    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public void deplacer(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
    }

    public void afficherPoint(){
        System.out.println("Coordonnee Point : "+ "("+x+","+y+")");
    }

}