package es.uah.matcomp.mp.e3.ejerciciosclase;

public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public float getX(){
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float getY(){
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x,y};
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        float[] point2D = getXY();
        return "("+point2D[0]+","+point2D[1]+")";
    }
}
