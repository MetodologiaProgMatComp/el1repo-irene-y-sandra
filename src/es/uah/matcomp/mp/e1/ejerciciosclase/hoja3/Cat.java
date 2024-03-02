package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

   // public void greets() {
     //   System.out.println("Meow");
   // }//Como un System.out.println no lo puedo testear voy a crear otra funcion que me permita tertarlo
    public String greets(){
        return ("Meow");
    }
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
