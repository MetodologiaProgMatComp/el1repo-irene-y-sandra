package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class Circle5 implements GeometricObject5 {
    protected double radius;

    public Circle5(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle5[" + "radius=" + radius + ']';
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
