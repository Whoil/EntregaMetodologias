package es.uah.matcomp.mp.e3.ejerciciosclase;
// Punto en 2 dimensiones
public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    // Constructor con valores
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    // Constructor vacío
    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }

    // Getter y setter de X
    public float getX(){
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter y setter de Y
    public float getY(){
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Devuelve coordenadas
    public float[] getXY(){
        return new float[] {x,y};
    }

     // Cambia coordenadas
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    // toString
    public String toString(){
        float[] point2D = getXY();
        return "("+point2D[0]+","+point2D[1]+")";
    }
}
