package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import java.awt.*;

public class Circle {
    private double radius; // Double es un float
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";

    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {//Devuelve el radio(Getter)
        return radius;
    }

    public double getArea() {//Devuelve el area (getter)
        return radius * radius * Math.PI;
    }

    public String getColor() {//Devuelve el color (getter)
        return color;
    }

    public void setRadius(double newRadius) {//Devuelve el valor del radio (getter)
        radius = newRadius;
    }

    public void setColor(String newColor) {//Devuelve el valor del radio (getter)
        color = newColor;
    }

    public String toString() {
        return "es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Circle[radius=" + radius + " color=" + color + "]";
    }

}



