package es.uah.matcomp.mp.e1.ejerciciosclases;

// Clase que representa una pelota con posición, tamaño y velocidad
public class Ball {
    private float x;       // Coordenada x de la pelota
    private float y;       // Coordenada y de la pelota
    private int radius;    // Radio de la pelota
    private float xDelta;  // Velocidad en el eje x
    private float yDelta;  // Velocidad en el eje y

    // Constructor que inicializa todos los atributos
    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }

    // Devuelve la posición en x
    public float getX() {
        return x;
    }

    // Modifica la posición en x
    public void setX(float x) {
        this.x = x;
    }

    // Devuelve la posición en y
    public float getY() {
        return y;
    }

    // Modifica la posición en y
    public void setY(float y) {
        this.y = y;
    }

    // Devuelve el radio
    public int getRadius() {
        return radius;
    }

    // Modifica el radio
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Devuelve la velocidad en x
    public float getxDelta() {
        return xDelta;
    }

    // Modifica la velocidad en x
    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    // Devuelve la velocidad en y
    public float getyDelta() {
        return yDelta;
    }

    // Modifica la velocidad en y
    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Mueve la pelota sumando la velocidad a la posición
    public void move(){
        x += xDelta;
        y += yDelta;
    }

    // Cambia el sentido horizontal (rebote en eje vertical)
    public void reflectHorizontal(){
        xDelta= -xDelta;
    }

    // Cambia el sentido vertical (rebote en eje horizontal)
    public void reflectVertical(){
        yDelta= -yDelta;
    }

    // Devuelve la información de la pelota en formato texto
    public String toString(){
        return "Ball[("+ x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
