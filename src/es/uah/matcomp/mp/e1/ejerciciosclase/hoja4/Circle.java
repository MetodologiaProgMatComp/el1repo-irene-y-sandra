package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class Circle extends Shape{
    protected double radius; // Double es un float

    public Circle(){
        radius = 1.0;


    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {//Devuelve el radio(Getter)
        return radius;
    }
    public void setRadius(double newRadius) {//Devuelve el valor del radio (getter)
        radius = newRadius;
    }
    public double getArea(){//Devuelve el area (getter)
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return (2*Math.PI*radius);
    }
    @Override
    public String toString (){
        return "es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
