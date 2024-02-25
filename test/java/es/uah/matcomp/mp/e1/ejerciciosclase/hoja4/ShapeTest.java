package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
    }

    @Test
    void setColor() {
        String newColor = "blue";
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertDoesNotThrow(()->d.setColor(newColor));
        assertEquals(newColor,d.getColor(),"Los colores no son iguales");
    }

    @Test
    void isFilled() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertTrue(f.isFilled());
    }

    @Test
    void setFilled() {
        boolean newFilled = false;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape("black", true) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        assertDoesNotThrow(()->f.setFilled(newFilled));
    }

    @Test
    void getArea() {
    }

    @Test
    void getPerimeter() {
    }

    @Test
    void testToString() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Shape("black", true) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        String salidaEsperada = "Shape[color='black, filled=true]";
        assertEquals(salidaEsperada,f.toString(),"Los textos no son iguales");
    }
}