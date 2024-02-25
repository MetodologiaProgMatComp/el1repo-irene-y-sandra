package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {


        @Test
        void getEmail () {
            Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            assertEquals("ahteck@nowhere.com",a1.getEmail());
        }

        @Test
        void setEmail () {
            Author a2 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            a2.setEmail("ahteck@somewhere.com");
            assertEquals("ahteck@somewhere.com",a2.getEmail());
        }

        @Test
        void getName () {
            Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            assertEquals("Tan Ah Teck",a1.getName());
        }

        @Test
        void testToString () {
            Author a2 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            assertEquals("Author[name='Tan Ah Teck, email='ahteck@nowhere.com]", a2.toString());
        }

}