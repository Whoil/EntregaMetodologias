package es.uah.matcomp.mp.e3.ejerciciosclase;

public class Point3D extends Point2D {

    // HEREDA de Point2D y añade coordenada Z
    private float z=0.0f;

    // Constructor con valores
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    // Constructor vacío
    public Point3D(){
    }

    // Getter de Z
    public float getZ(){
        return z;
    }

    // Setter de Z
    public void setZ(float z){
        this.z=z;
    }

    // Devuelve coordenadas 3D

    public float[] getXYZ(){
        return new float[] {super.getX(), super.getY(),z};
    }


    // Devuelve coordenadas 3D
    public void setXYZ(float x, float y, float z){
            setX(x);
            setY(y);
            this.z = z;
    }
    @Override

    // Sobrescribe toString
    public String toString(){
        float[] point3D= getXYZ();
        return "("+point3D[0]+","+point3D[1]+","+point3D[2]+")";
    }

}
