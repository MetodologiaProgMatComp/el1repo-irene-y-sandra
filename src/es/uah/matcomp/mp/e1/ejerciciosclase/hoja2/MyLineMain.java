package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class MyLineMain {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 3);
        MyPoint p2 = new MyPoint(8, 9);
        MyLine l1 = new MyLine(p1, p2);
        System.out.println(l1);
        l1.setBeginX(3);
        System.out.println(l1);
        l1.setBeginY(4);
        l1.setEndX(6);
        l1.setEndY(8);
        System.out.println(l1);
        l1.setBeginXY(10, 11);
        l1.setEndXY(19, 20);
        System.out.println(l1);
        System.out.println("begin X is: " + l1.getBeginX());
        System.out.println("begin Y is: " + l1.getBeginY());
        System.out.println("end X is: " + l1.getEndX());
        System.out.println("end Y is: " + l1.getEndY());
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());
        System.out.println("Length is: " + l1.getLength());
        System.out.println("Grandient: " + l1.getGradient());


    }
}
