package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public Ball(){
        x = 9.4f;
        y = 8.6f;
        radius = 8;
        xDelta = 4.5f;
        yDelta = 2.8f;

    }
    public Ball(float x1, float y1, int r, float xd, float xy){
        x = x1;
        y = y1;
        radius = r;
        xDelta = xd;
        yDelta = xy;
    }
    public float getX(){
        return x;
    }
    public void setX (float newX){
        x = newX;
    }
    public float getY(){
        return y;
    }
    public void setY (float newY){
        y = newY;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius (int newRaduis){
        radius = newRaduis;
    }

    public float getXDelta (){
        return xDelta;
    }
    public void setXDelta (float newXDelta){
        xDelta = newXDelta;
    }
    public float getYDelta(){
        return yDelta;
    }
    public void setYDelta (float newYDelta){
        yDelta = newYDelta;
    }
    public void move(){
        x+= xDelta;
        y+= yDelta;
    }
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public void reflectVertical(){
        yDelta = -yDelta;
    }
    public String toString(){
        return "es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Ball[(" + x +","+ y +"),speed("+ xDelta +","+ yDelta +")]";
    }

}
