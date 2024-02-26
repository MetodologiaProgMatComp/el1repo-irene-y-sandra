package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woof");
    }
    @Override
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooof");
    }
}
