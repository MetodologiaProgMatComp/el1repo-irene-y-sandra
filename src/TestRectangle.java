import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1.toString()); // toString()

        Rectangle r2 = new Rectangle(1.0f,1.0f);
        System.out.println(r2.toString());

        Rectangle r3 = new Rectangle(5.6f,7.8f);
        System.out.println(r3.toString());

        // Test setters and getters
        r3.setLength(5.6f);
        r3.setWidth(7.8f);
        System.out.println("length is: " + r3.getLength());
        System.out.println("width is: " + r3.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r3.getArea());
        System.out.printf("perimeter is: %.2f%n", r3.getPerimeter());

    }
}


