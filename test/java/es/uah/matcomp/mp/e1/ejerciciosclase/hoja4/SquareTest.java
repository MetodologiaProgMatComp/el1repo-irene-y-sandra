package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square(4.3d);
        assertEquals(4.3,d.getSide(),"Los side no son iguales");
    }

    @Test
    void setSide() {
        double newSide = 3.4d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square();
        assertDoesNotThrow(()->f.setSide(newSide));
        assertEquals(newSide,f.getSide(),"Los side no son iguales");
    }

    @Test
    void setLength() {
        double newLength = 9.8d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square(4.3,3.4,6.7);
        assertDoesNotThrow(()->f.setLength(newLength));
    }

    @Test
    void setWidth() {
        double newWidth = 2.8d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square(4.3,3.4,6.7);
        assertDoesNotThrow(()->f.setWidth(newWidth));
    }

    @Test
    void testToString() {
        String newColor = "black";
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square("red",true,8.9);
        assertDoesNotThrow(()->f.setColor(newColor));
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Square("red",true,6.7,8.9,2.3);
        String salidaEsperada = "Square[es.uah.matcomp.mp.e1.ejerciciosclase.Rectangle[Shape[color='red, filled=true]length=6.7 width=8.9]]";
        assertEquals(salidaEsperada,d.toString(),"los textos no son iguales");
    }
}