package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class Circle2 implements GeometricObject {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle2[" + "radius=" + radius + ']';
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
