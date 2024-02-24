package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square d = new Square(4.3d);
        assertEquals(4.3,d.getSide(),"Los side no son iguales");
    }

    @Test
    void setSide() {
        double newSide = 3.4d;
        Square f = new Square();
        assertDoesNotThrow(()->f.setSide(newSide));
        assertEquals(newSide,f.getSide(),"Los side no son iguales");
    }

    @Test
    void setLength() {
        double newLength = 9.8d;
        Square f = new Square(4.3,3.4,6.7);
        assertDoesNotThrow(()->f.setLength(newLength));
    }

    @Test
    void setWidth() {
        double newWidth = 2.8d;
        Square f = new Square(4.3,3.4,6.7);
        assertDoesNotThrow(()->f.setWidth(newWidth));
    }

    @Test
    void testToString() {
        String newColor = "black";
        Square f = new Square("red",true,8.9);
        assertDoesNotThrow(()->f.setColor(newColor));
        Square d = new Square("red",true,6.7,8.9,2.3);
        String salidaEsperada = "Square[es.uah.matcomp.mp.e1.ejerciciosclase.Rectangle[Shape[color='red, filled=true]length=6.7 width=8.9]]";
        assertEquals(salidaEsperada,d.toString(),"los textos no son iguales");
    }
}