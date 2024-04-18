import es.uah.matcomp.mp.e1.ejerciciosclase.Gson1;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Account;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Ball;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja2.Author;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja2.Book;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.MovablePoint;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Point;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle5;
import es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.ResizableCircle;

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

        //Point
        Point point1 = new Point(23,67);
        String rutaPoint = "point.json";
        Point.guardarObjetoEnArchivo(rutaPoint,point1);
        Point pointCargado = Gson1.cargarObjetoDesdeArchivo(rutaPoint, Point.class);
        if(pointCargado!=null){
            System.out.println("point cargado: " + pointCargado);
        }
        Point pointNuevo = Gson1.cargarObjetoDesdeArchivo(rutaPoint, Point.class);
        pointNuevo.setX(34);
        pointNuevo.guardarObjetoEnArchivo("point2.json", pointNuevo);

        //MovablePoint
        MovablePoint movablePoint = new MovablePoint(98,43,45,32);
        String rutaMovablePoint = "movablePoint.json";
        MovablePoint.guardarObjetoEnArchivo(rutaMovablePoint,movablePoint);
        MovablePoint movablePointCargado = Gson1.cargarObjetoDesdeArchivo(rutaMovablePoint, MovablePoint.class);
        if (movablePointCargado!=null){
            System.out.println("movablePoint" + movablePointCargado);
        }
        MovablePoint movablePointNuevo = Gson1.cargarObjetoDesdeArchivo(rutaMovablePoint, MovablePoint.class);
        movablePointNuevo.setSpeed(789,345);
        movablePointNuevo.guardarObjetoEnArchivo("movablePoint2.json", movablePointNuevo);

        //Cicle5
        Circle5 cicle5 = new Circle5(34);
        String rutaCicle5 = "cicle5.json";
        Circle5.guardarObjetoEnArchivo(rutaCicle5,cicle5);
        Circle5 cicle5Cargado = Gson1.cargarObjetoDesdeArchivo(rutaCicle5, Circle5.class);
        if(cicle5Cargado!=null){
            System.out.println("cicle5" + cicle5Cargado);
        }
        Circle5 cicle5Nuevo = Gson1.cargarObjetoDesdeArchivo(rutaCicle5, Circle5.class);
        cicle5Nuevo.setRadius(789);
        cicle5Nuevo.guardarObjetoEnArchivo("cicle5nuevo.json", cicle5Nuevo);

        //ResizableCircle
        ResizableCircle resizableCircle = new ResizableCircle(45);
        String rutaResizableCicle = "resizableCicle.json";
        ResizableCircle.guardarObjetoEnArchivo(rutaResizableCicle,resizableCircle);
        ResizableCircle resizableCircleCargado = Gson1.cargarObjetoDesdeArchivo(rutaResizableCicle, ResizableCircle.class);
        if(resizableCircleCargado!=null){
            System.out.println("resizableCircleCargado" + resizableCircleCargado);
        }
        ResizableCircle resizableCircleNuevo = Gson1.cargarObjetoDesdeArchivo(rutaResizableCicle, ResizableCircle.class);
        resizableCircleNuevo.setRadius(6788);
        resizableCircleNuevo.guardarObjetoEnArchivo("resizableCircle2.json", resizableCircleNuevo);
    }



}