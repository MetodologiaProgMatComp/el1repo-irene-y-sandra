package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableCircle(int radius, MovablePoint center) {//
        this.radius = radius;
        this.center = center;
    }


    @Override
    public void moveUp() {
        int y = center.getY();
        int ySpeed = center.getySpeed();
        center.setY(y - ySpeed);
    }

    @Override
    public void moveDown() {
        int y = (int) center.getY();
        int ySpeed = (int) center.getySpeed();
        center.setY(y + ySpeed);
    }

    @Override
    public void moveLeft() {
        int x = (int) center.getX();
        int xSpeed = (int) center.getxSpeed();
        center.setX(x - xSpeed);
    }

    @Override
    public void moveRight() {
        int x = (int) center.getX();
        int xSpeed = (int) center.getxSpeed();
        center.setX(x + xSpeed);
    }

    @Override
    public String toString() {
        return "(" + center.getX() + "," + center.getY() + ") Speed=(" + center.getxSpeed() + "," + center.getySpeed() + ") radius= " + radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }
}
