package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class MyPointMain {
    public static void main(String[] args) {
        //Example distance(x,y)
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));
        //Example distance(another)
        MyPoint p3 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(5, 6);
        System.out.println(p3.distance(p2));
        //Example distance()
        MyPoint p4 = new MyPoint(3, 4);
        System.out.println(p4.distance());
        // Test program to test all constructors and public methods
        MyPoint p5 = new MyPoint(); // Test constructor
        System.out.println(p5); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p5.getX()); // Test getters
        System.out.println("y is: " + p5.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p5.getXY()[0]); // Test getXY()
        System.out.println(p5.getXY()[1]);
        System.out.println(p5);
        MyPoint p6 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p6);
        // Testing the overloaded methods distance()
        System.out.println(p5.distance(p6)); // which version?
        System.out.println(p6.distance(p5)); // which version?
        System.out.println(p5.distance(5, 6)); // which version?
        System.out.println(p5.distance()); // which version?
    }

}
