package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class GeometricObject5Main {
    public static void main(String[] args) {
        //class circle5
        Circle5 d = new Circle5(7.0);
        System.out.println(d);
        double newPerimeter = d.getPerimeter();
        System.out.println(newPerimeter);
        double newArea = d.getArea();
        System.out.println(newArea);

        //class ResizableCircle
        ResizableCircle f = new ResizableCircle(6.0);
        System.out.println(f);

    }
}
