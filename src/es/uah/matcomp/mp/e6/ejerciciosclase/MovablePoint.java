package es.uah.matcomp.mp.e6.ejerciciosclase;

// Implementa interfaz Movable
public class MovablePoint  implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;


    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    // toString
    public String toString(){
        return "("+x+","+y+") speed=("+xSpeed+","+ySpeed+")";
    }
    @Override
    // Mueve hacia arriba
    public void moveUp(){
        y+=ySpeed;
    }

    // Mueve hacia abajo
    @Override
    public void moveDown(){
        y-=ySpeed;
    }

    // Mueve a la derecha
    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    // Mueve a la derecha
    @Override
    public void moveLeft() {
        x-=xSpeed;
    }
}
