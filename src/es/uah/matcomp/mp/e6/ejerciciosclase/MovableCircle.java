package es.uah.matcomp.mp.e6.ejerciciosclase;
// Círculo que se mueve (usa composición)
public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center; // centro del círculo



    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
    // Constructor
    public String toString(){
        return center.toString()+", radius="+radius;
    }


    // Todos los movimientos delegan en el centro
    @Override
    public void moveUp(){
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }
}
