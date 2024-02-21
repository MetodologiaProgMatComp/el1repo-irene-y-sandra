package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public MyPoint(){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int numeros[] = {getX(),getY()};
        return numeros;
    }
    public void setXY(int x,int y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "MyPoint[" + "x=" + x + ", y=" + y + ']';
    }
    public double distance(int xi,int yi){
        int distX= xi- x;
        int distY= yi - y;
        return Math.sqrt((distX^2)+(distY^2));
    }
    public double distance(MyPoint another) {
        int xi = another.getX();
        int yi = another.getY();
        int distX = xi - x;
        int distY = yi - y;
        return Math.sqrt((distX ^ 2) + (distY ^ 2));
    }
    public double distance(){
        return Math.sqrt((x^2)+(y^2));
    }
}
