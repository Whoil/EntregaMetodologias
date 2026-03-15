package es.uah.matcomp.mp.e3.ejerciciosclase;
public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super.setX(x);
        super.setY(y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(){
        super.setX(0.0f);
        super.setY(0.0f);
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public float getxSpeed(){
        return xSpeed;
    }


    public void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }


    public float getySpeed(){
        return ySpeed;
    }


    public void setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+"), speed=("+getxSpeed()+","+getySpeed()+")";
    }
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }

}
