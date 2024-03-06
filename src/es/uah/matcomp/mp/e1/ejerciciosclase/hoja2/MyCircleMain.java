package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class MyCircleMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(8, 9);
        MyCircle c1 = new MyCircle(p1, 4);
        System.out.println(c1);
        c1.setRadius(7);
        System.out.println(c1);
        MyPoint p2 = new MyPoint(6, 7);
        c1.setCenter(p2);
        System.out.println(c1);
        c1.setCenterX(4);
        c1.setCenterY(12);
        System.out.println(c1);
        c1.setCenterXY(21, 34);
        System.out.println(c1);
        System.out.println("el radio es: " + c1.getRadius());
        System.out.println("la coordenada X es: " + c1.getCenterX());
        System.out.println("la coordenada Y es: " + c1.getCenterY());
        System.out.println("el centro es: " + c1.getCenter());
        System.out.println("el area es: " + c1.getArea());
        System.out.println("la circunferencia es: " + c1.getCircumference());
        System.out.println("la distacia es: " + c1.distance(p1));
    }//
}
