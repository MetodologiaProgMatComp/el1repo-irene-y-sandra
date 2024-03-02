package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

public class Dog extends Mammal {


    public Dog(String name) {
        super(name);
    }

    //public void greets() {
      //  System.out.println("Woof");
    //}///Como esta funcion no la puedo testear, voy a hacer otra semejante
    public String greets(){
        return ("Woof");
    }

    //public void greets(Dog another) {
     //   System.out.println("Woooof");
   // }//Como esta funcion no la puedo testear, voy a hacer otra semejante

    public String greets(Dog another){
        return ("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
