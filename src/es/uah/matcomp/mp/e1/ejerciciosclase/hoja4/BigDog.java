package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public String greets() {
        return ("Wooow");
    }

    @Override
    public String greets(Dog another) {
        return ("Woooooow");
    }

    public String greets(BigDog another) {
        return ("Wooooooooow");
    }
}
