package es.uah.matcomp.mp.e3.ejerciciosclase;

public class Dog extends Mammal {
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){ //sobrecargamos el método greets
        System.out.println("Woooof");
    }
    @Override // sobreescribimos el metodo de la superclase mammal
    public String toString(){
        return "Dog["+ super.toString() + "]";
    }


}
