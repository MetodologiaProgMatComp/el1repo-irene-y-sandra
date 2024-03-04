package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class Dog extends Mammal {


    public Dog(String name) {
        super(name);
    }

    public String greets() {
        return "Woof";
    }

    public String greets(Dog another) {
        return "Woooof";
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
