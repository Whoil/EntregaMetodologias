package es.uah.matcomp.mp.e3.ejerciciosclase;
// Clase que hereda de Point
public class MovablePoint extends Point {
    // Velocidad en eje X e Y
    private float xSpeed = 0.0f;
    private float ySpeed=0.0f;

    // Constructor con posición y velocidad
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){

        // Usa métodos de la superclase para asignar posición
        super.setX(x);
        super.setY(y);

        // Inicializa velocidad
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    // Constructor solo con velocidad (posición no definida aquí)
    public MovablePoint(float xSpeed, float ySpeed){
        // Usa métodos de la superclase para asignar posición

        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    // Constructor por defecto (todo a 0)
    public MovablePoint(){

        super.setX(0.0f);
        super.setY(0.0f);
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    // Getter de velocidad en Y
    public float getxSpeed(){
        return xSpeed;
    }

    // Setter de velocidad en X
    public void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }

    // Getter de velocidad en Y

    public float getySpeed(){
        return ySpeed;
    }

    // Setter de velocidad en Y
    public void setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }

    // Devuelve ambas velocidades en un array
    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }

    // Permite cambiar ambas velocidades a la vez

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }


    // Sobrescribe toString() de la superclase
    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+"), speed=("+getxSpeed()+","+getySpeed()+")";
    }


    // Sobrescribe toString() de la superclase
    public MovablePoint move(){
        // Nueva posición = posición actual + velocidad
        setX(getX()+xSpeed);

        setY(getY()+ySpeed);

        // Devuelve el propio objeto
        return this;
    }

}
