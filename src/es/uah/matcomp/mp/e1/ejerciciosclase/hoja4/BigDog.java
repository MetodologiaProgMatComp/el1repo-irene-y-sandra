package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public String greets() {
        return "Woof";
    }

    @Override
    public String greets(Dog another) {
        return  "Woooof";
    }

    public String greets(BigDog another) {
        return "Woooooooof";
    }
}
