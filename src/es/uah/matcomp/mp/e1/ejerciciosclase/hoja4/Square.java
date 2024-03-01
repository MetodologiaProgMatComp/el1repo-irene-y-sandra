package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class Square extends Rectangle {
    private double side;

    public Square() {
        side = 1.0d;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square(double length, double width, double side) {
        super(length, width);
        this.side = side;
    }

    public Square(String color, boolean filled, double length, double width, double side) {
        super(color, filled, length, width);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double newLength) {
        super.setLength(newLength);
    }

    @Override
    public void setWidth(double newWidth) {
        super.setWidth(newWidth);
    }

    @Override
    public String toString() {
        return ("Square[" + super.toString() + "]");
    }
}
