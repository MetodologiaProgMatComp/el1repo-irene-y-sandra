package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class Rectangle2 implements GeometricObject{
    private double width;
    private double length;

    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle2[width=" + width + ", length=" + length + ']';
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (2*width)+(2*length);
    }
}
