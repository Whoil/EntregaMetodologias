package es.uah.matcomp.mp.e3.ejerciciosclase;

public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    public Point3D(){
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z=z;
    }

    public float[] getXYZ(){
        return new float[] {super.getX(), super.getY(),z};
    }

    public void setXYZ(float x, float y, float z){
            setX(x);
            setY(y);
            this.z = z;
    }
    @Override
    public String toString(){
        float[] point3D= getXYZ();
        return "("+point3D[0]+","+point3D[1]+","+point3D[2]+")";
    }

}
