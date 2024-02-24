package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class Circle5 extends Shape {
    private double radius;
    public Circle5(){
        radius = 1.0d;
    }

    public Circle5(double radius){
        this.radius = radius;
    }

    public Circle5(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI*radius*radius);
    }

    public double getPerimeter(){
        return (2*Math.PI*radius);
    }

    @Override
    public String toString() {
        return "Circle5[" + super.toString() + "radius=" + radius + ']';
    }
}
