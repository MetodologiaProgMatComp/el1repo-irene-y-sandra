import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem d = new InvoiceItem("A11", "pen red", 333, 7.8);
        assertEquals("A11", d.getId(), "Los id no coinciden");

    }

    @Test
    void getDesc() {
        InvoiceItem d = new InvoiceItem("A11", "pen black", 333, 7.8);
        assertEquals("pen black", d.getDesc(), "Los id no coinciden");
    }

    @Test
    void getQty() {
    }

    @Test
    void setQty() {
        int newQty = 890;
        InvoiceItem d = new InvoiceItem();

        assertDoesNotThrow(() -> d.setQty(newQty));

        assertEquals(newQty,d.getQty(), "Los qty no son iguales");
    }

    @Test
    void getUnitPrice() {
    }

    @Test
    void setUnitPrice() {
        double newUnitPrice = 12.5;
        InvoiceItem d = new InvoiceItem();

        assertDoesNotThrow(() -> d.setUnitPrice(newUnitPrice));

        assertEquals(newUnitPrice,d.getUnitPrice(), "Los UnitPrice no son iguales");
    }

    @Test
    void getTotal() {
        int newQty = 888;
        double newUnitPrice = 12.5;
        InvoiceItem d = new InvoiceItem();
        assertDoesNotThrow(() -> d.setQty(newQty));
        assertDoesNotThrow(() -> d.setUnitPrice(newUnitPrice));
        assertEquals(12.5*888,d.getTotal(), "El total no es igual");
    }

    @Test
    void testToString() {
        String id = "A101";
        String desc = "Pen red";
        int qty = 99;
        double unitPrice = 4.3d;
        InvoiceItem f = new InvoiceItem();

        f.setQty(qty);
        f.setUnitPrice(unitPrice);

        String salidaEsperada = "es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.InvoiceItem[id=A101 desc=Pen red qty=99 unitPrice=4.3]";
        assertEquals(salidaEsperada,f.toString(),"No sale el mismo texto en toString()");
    }
}