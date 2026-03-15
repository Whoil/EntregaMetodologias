package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint(){
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
        return new int[] {x,y};
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        int[] point= getXY();
        return "("+point[0]+","+point[1]+")";
    }
    public double distance(int x, int y){
        int dx= getX()-x;
        int dy=getY()-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public double distance(MyPoint another){
        int dx= getX()-another.getX();
        int dy=getY()-another.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    public double distance(){
        return Math.sqrt(getX()*getX()+getY()*getY());
    }

}
