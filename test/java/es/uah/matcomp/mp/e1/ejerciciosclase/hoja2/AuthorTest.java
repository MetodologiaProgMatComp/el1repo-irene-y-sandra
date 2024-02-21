package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {


        @Test
        void getEmail () {
            Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            System.out.println("email is:" + a1.getEmail());
        }

        @Test
        void setEmail () {
            Author a2 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            a2.setEmail("ahteck@somewhere.com");
        }

        @Test
        void getName () {
            Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            System.out.println("name is:" + a1.getName());
        }

        @Test
        void testToString () {
            Author a2 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
            a2.setEmail("ahteck@somewhere.com");
        }

}