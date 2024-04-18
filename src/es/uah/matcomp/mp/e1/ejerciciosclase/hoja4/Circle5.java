package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import es.uah.matcomp.mp.e1.ejerciciosclase.Gson1;

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

    public static void guardarObjetoEnArchivo(String rutaArchivo, Circle5 cicle5) {
        Gson1.guardarObjetoEnArchivo(rutaArchivo, cicle5);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
