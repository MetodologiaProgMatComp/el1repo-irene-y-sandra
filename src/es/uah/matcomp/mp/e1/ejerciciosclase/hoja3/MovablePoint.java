package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = getX();
        result[1] = getY();
        return result;
    }
    @Override
    public String toString(){
        return super.toString()+ "speed=(" + xSpeed + "," + ySpeed + ")";
    }
    public MovablePoint move(){
        float x = super.getX();
        float y = super.getY();
        x += xSpeed;
        y += ySpeed;
        return this;
    }

}
