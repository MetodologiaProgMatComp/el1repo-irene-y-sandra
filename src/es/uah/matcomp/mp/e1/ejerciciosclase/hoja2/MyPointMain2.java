package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import java.lang.reflect.Array;

public class MyPointMain2 {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyPoint p3 = new MyPoint(3, 3);
        MyPoint p4 = new MyPoint(4, 4);
        MyPoint p5 = new MyPoint(5, 5);
        MyPoint p6 = new MyPoint(6, 6);
        MyPoint p7 = new MyPoint(7, 7);
        MyPoint p8 = new MyPoint(8, 8);
        MyPoint p9 = new MyPoint(9, 9);
        MyPoint p10 = new MyPoint(10, 10);
        System.out.println(p1.distance(p2));
        System.out.println(p3.distance(p4));
        System.out.println(p5.distance(p6));
        System.out.println(p7.distance(p8));
        System.out.println(p9.distance(p10));
        System.out.println(p1.distance(p10));
    }







}
