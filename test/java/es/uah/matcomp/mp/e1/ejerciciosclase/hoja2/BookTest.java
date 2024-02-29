package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
    Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
    @Test
    void getIsbn() {
        assertEquals("12345",b1.getIsbn());
    }

    @Test
    void getName() {
        assertEquals("Java for dummies",b1.getName());
    }

    @Test
    void getAuthor() {
        Author a = new Author("Kika Superbruja","kika@nowhere.com");
        Book b = new Book("123","Carlos",a,8.9);

        assertDoesNotThrow(()->b.getAuthor());
    }

    @Test
    void getPrice() {
        assertEquals(8.8,b1.getPrice());
    }

    @Test
    void setPrice() {
        b1.setPrice(9.9);
        assertEquals(9.9,b1.getPrice());
    }

    @Test
    void getQty() {
       assertEquals(88,b1.getQty());
    }

    @Test
    void setQty() {
        b1.setQty(99);
        assertEquals(99,b1.getQty());
    }

    @Test
    void getAuthorName() {
        assertEquals("Tan Ah Teck",b1.getAuthorName());
    }

    @Test
    void testToString() {
        Author a = new Author("Kika Superbruja","kika@nowhere.com");
        Book b = new Book("123","Carlos",a,8.9);
        String salidaEsperada = "Book[isbn='123, name='Carlos, author=Author[name=Kika Superbruja, email=kika@nowhere.com], price=8.9, qty=0]";
        assertEquals(salidaEsperada,b.toString());
    }
}