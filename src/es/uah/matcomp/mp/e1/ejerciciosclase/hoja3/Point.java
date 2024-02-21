package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class Point {
    private float x=0.0f;
    private float y=0.0f;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] result = new float[2];
        result[0] = getX();
        result[1] = getY();
        return result;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }

}
