package es.uah.matcomp.mp.e3.ejerciciosclase;
public class Cat extends Mammal{ // la clase Cat hereda a mammal

    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString() { //Sobreescribimos el método toString
        return "Cat["+ super.toString() + "]";
    }
}
