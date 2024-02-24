package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle5Test {

    @Test
    void getRadius() {
    }

    @Test
    void setRadius() {
        double newRadius = 2.0;
        Circle5 d = new Circle5();
        assertDoesNotThrow(()->d.setRadius(newRadius));
        assertEquals(newRadius,d.getRadius(),"Los radius no son iguales");

    }

    @Test
    void getArea() {
        double newRadius = 2.0;
        Circle5 d = new Circle5();
        assertDoesNotThrow(()->d.setRadius(newRadius));
        assertEquals(Math.PI*4.0,d.getArea(),"las areas no son iguales");
    }

    @Test
    void getPerimeter() {
        Circle5 f = new Circle5(3.0);
        assertEquals(2*Math.PI*3.0,f.getPerimeter(),"Los perimetros no son iguales");
    }

    @Test
    void testToString() {
        Circle5 h = new Circle5("red",true,5.0);
        String salidaEsperada = "Circle5[Shape[color='red, filled=true]radius=5.0]";
        assertEquals(salidaEsperada,h.toString(),"Los textos no son iguales");
    }
}