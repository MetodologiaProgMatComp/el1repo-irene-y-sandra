import es.uah.matcomp.mp.e1.ejerciciosclase.Circle;

public class TestCircle {
    public static void main(String[] args) {
        //declara una instancia de la clase es.uah.matcomp.mp.e1.ejerciciosclase.Circle llamada c1
        Circle c1 = new Circle();
        System.out.println("El circulo tiene un radio de " + c1.getRadius() + " y un area de " + c1.getArea());
        //el circulo tiene un radio de 1.0 y un area de 3.14

        //declaro otra instancia llamada c2
        Circle c2 = new Circle(2.0);
        System.out.println("El circulo tiene un radio de " + c2.getRadius() + " y un area de " + c2.getArea());
        //el circulo tiene un radio de 2.0 y un area de 12.566

        Circle c3 = new Circle();
        System.out.println("El circulo es de color: " + c3.getColor());
        //El circulo es de color: red

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("El radio nuevo es: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("El color nuevo es: " + c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());//Llamada de forma explícita

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());//Llanada de forma explicita
        System.out.println(c6);//Imprime la llamada de forma implicita
        System.out.println("Operator '+' invokes toString() too: " +c6);//


        };



    }

