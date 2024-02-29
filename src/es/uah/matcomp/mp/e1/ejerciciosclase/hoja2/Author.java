package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class Author {
    private String name;
    private String email;


    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author[" + "name=" + name + ", email=" + email + ']';
    }

}
