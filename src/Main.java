import es.uah.matcomp.mp.e1.ejerciciosclase.Gson1;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Account;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Ball;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja2.Author;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja2.Book;

public class Main {
    public static void main(String[] args) {
        //Account
        Account cuenta = new Account("1234", "Jorge", 100);
        String rutaAccount = "account.json";
        Account.guardarObjetoEnArchivo(rutaAccount, cuenta);
        Account cuentaCargada = Gson1.cargarObjetoDesdeArchivo(rutaAccount, Account.class);
        if (cuentaCargada != null) {
            System.out.println("cuenta cargada: " + cuentaCargada);
        }
        Account cuentaNueva = Gson1.cargarObjetoDesdeArchivo("account2.json", Account.class);
        cuentaNueva.setBalance(5000);
        cuentaNueva.guardarObjetoEnArchivo("account2.json", cuentaNueva);


        //Bola
        Ball bola = new Ball();
        String rutaBall = "ball.json";
        Ball.guardarObjetoEnArchivo(rutaBall, bola);
        Ball bolaCargada = Gson1.cargarObjetoDesdeArchivo(rutaBall, Ball.class);
        if (bolaCargada != null) {
            System.out.println("bola cargada: "+ bolaCargada);
        }
        Ball bolaNueva = Gson1.cargarObjetoDesdeArchivo(rutaBall, Ball.class);
        bolaNueva.setRadius(100);
        bolaNueva.setX(14.56F);
        bolaNueva.setY(23.89F);
        bolaNueva.guardarObjetoEnArchivo("bola2.json", bolaNueva);

        //Author
        Author autor = new Author("Carlos","carlos@mail.com");
        String rutaAuthor = "author.json";
        Author.guardarObjetoEnArchivo(rutaAuthor, autor);
        Author autorCargado = Gson1.cargarObjetoDesdeArchivo(rutaAuthor, Author.class);
        if (autorCargado != null) {
            System.out.println("autor cargada: "+ autorCargado);
        }
        Author autorNuevo = Gson1.cargarObjetoDesdeArchivo(rutaAuthor, Author.class);
        autorNuevo.setEmail("carlos.escritor@mail.com");
        autorNuevo.guardarObjetoEnArchivo("Author2.json", autorNuevo);

        //Book
        Author antonio = new Author("Antonio","antonio@mail.com");
        Book libro = new Book("1234","Por qué Java es mejor que Python",antonio,15.5);
        String rutaLibro = "libro.json";
        Book.guardarObjetoEnArchivo(rutaLibro, libro);
        Book libroCargado = Gson1.cargarObjetoDesdeArchivo(rutaLibro, Book.class);
        if(libroCargado!=null){
            System.out.println("libro cargado: "+ libroCargado);
        }
        Book libroNuevo = Gson1.cargarObjetoDesdeArchivo(rutaLibro, Book.class);
        libroNuevo.setPrice(20.4);
        libroNuevo.setQty(4);
        libroNuevo.guardarObjetoEnArchivo("libro2.json",libroNuevo);
    }


}