package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D(float z) {
        super();
        this.z = z;
    }

    public Point3D(){
        super();
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        super.setX(x);
        super.setY(y);
        this.z =z;
    }
    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = getZ();
        return result;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
