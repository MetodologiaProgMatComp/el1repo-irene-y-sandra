package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);

    }

    @Test
    void getName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println("name is:" + b1.getName());
    }

    @Test
    void getAuthor() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println("Author is:" + b1.getAuthor());
    }

    @Test
    void getPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println("price is:" + b1.getPrice());
    }

    @Test
    void setPrice() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        b1.setPrice(9.9);
    }

    @Test
    void getQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println("qty is:" + b1.getQty());
    }

    @Test
    void setQty() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        b1.setQty(99);
    }

    @Test
    void getAuthorName() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println("Author's name is:" + b1.getAuthorName());
    }

    @Test
    void testToString() {
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);

    }
}