package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0d;
        width = 1.0d;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public String toString() {
        return "es.uah.matcomp.mp.e1.ejerciciosclase.Rectangle[" + super.toString() + "length=" + length + " width=" + width + "]";
    }
}
