package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") Speed=(" + xSpeed + "," + ySpeed + ')';
    }
    public void moveUp(){
        this.y = y-=ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = x-=xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = x+=xSpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }
}
