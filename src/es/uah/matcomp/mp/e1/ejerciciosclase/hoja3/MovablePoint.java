package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import es.uah.matcomp.mp.e1.ejerciciosclase.Gson1;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = getXSpeed();
        result[1] = getYSpeed();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "speed=(" + xSpeed + "," + ySpeed + ")";
    }

    public MovablePoint move() {
        float x = super.getX();
        float y = super.getY();
        setX(x += xSpeed);
        setY(y += ySpeed);
        return this;
    }

    public static void guardarObjetoEnArchivo(String rutaArchivo, MovablePoint movablePoint) {
        Gson1.guardarObjetoEnArchivo(rutaArchivo,movablePoint);
    }

}
