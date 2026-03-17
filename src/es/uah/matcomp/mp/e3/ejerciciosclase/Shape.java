package es.uah.matcomp.mp.e3.ejerciciosclase;

// Clase base que representa una figura con color y si está rellena o no
public class Shape {
    private String color;   // Color de la figura
    private boolean filled; // Indica si está rellena

    // Constructor por defecto (rojo y relleno)
    public Shape(){
        color="red";
        filled = true;
    }

    // Constructor que permite inicializar ambos atributos
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    // Devuelve el color
    public String getColor() {
        return color;
    }

    // Modifica el color
    public void setColor(String color) {
        this.color = color;
    }

    // Devuelve si está rellena o no
    public boolean isFilled(){
        return filled;
    }

    // Modifica si está rellena o no
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Devuelve la información en formato texto
    public String toString(){
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
