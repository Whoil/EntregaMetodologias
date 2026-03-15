package es.uah.matcomp.mp.e6.ejerciciosclase;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();


        //Estas tres primeras salidas corresponden al uso de los objetos Cat, Dog y Bigdog.
        //En este caso se ejecuta el método greeting redefinido en cada clase

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        //En este bloque de polimorfismo, aunque las referencias sean de tipo Animal, se ejecutan los métodos específicos de cada objeto.
        //Por lo que las salidas son "Meow!", "Woof!" y "Woow!"



        // Animal animal4 = new Animal();

        // ERROR de compilación:
        // Shape es abstract, no se puede instanciar

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);

        //En ese útimo bloque la conversión Cat cat2 = (Cat)animal2; produce un error de ejecución debido a que animal2
        //apunta a un objeto Dog.
        //Si eliminamos esta conversión incorrecta,las llamadas a greeting(Dog another) muestran polimorfismo:
        // cuando el objeto receptor es Dog, se imprime "Woooooooooof!", y cuando el objeto receptor es BigDog, se imprime "Woooooowwwww!".
    }
}