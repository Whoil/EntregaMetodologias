package es.uah.matcomp.mp.e4.ejerciciosclase;
// Class that represents a point in 2D space
public class Point {
    // Coordinates
    private int x=0;
    private int y=0;

    // Default constructor
    public Point(){
    }
    // Constructor with coordinates
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    // Getter for x
    public int getX(){
        return x;
    }
    // Setter for x
    public void setX(int x){
        this.x=x;
    }

    // Getter for Y
    public int getY(){
        return y;
    }

    // Setter for Y
    public void setY(int y){
        this.y=y;
    }

    // Returns both coordinates as an array
    public int[] getXY(){
        return new int[] {x,y};
    }

    // Sets both coordinates
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    // String representation of the point
    public String toString(){
        int[] point= getXY();
        return "("+point[0]+","+point[1]+")";
    }

    // Distance from this point to another (given x, y)
    public double distance(int x, int y){
        int dx= getX()-x;
        int dy=getY()-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    // Distance from this point to another Point object
    public double distance(Point another){
        int dx= getX()-another.getX();
        int dy=getY()-another.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }


    // Distance from this point to the origin (0,0)
    public double distance(){
        return Math.sqrt(getX()*getX()+getY()*getY());
    }
}
