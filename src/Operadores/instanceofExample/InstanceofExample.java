package Operadores.instanceofExample;

public class InstanceofExample {
    public static void main(String[] args) {
        Animal myDog = new Animal.Dog();
        Animal myCat = new Animal.Cat();

        if (myDog instanceof Animal.Dog) {
            System.out.println("myDog es una instancia de Dog");
        }

        if (myCat instanceof Animal.Cat) {
            System.out.println("myCat es una instancia de Cat");
        }

        if (myDog instanceof Animal) {
            System.out.println("myDog es una instancia de Animal");
        }

        if (myCat instanceof Animal) {
            System.out.println("myCat es una instancia de Animal");
        }

        if (!(myDog instanceof Animal.Cat)) {
            System.out.println("myDog no es una instancia de Cat");
        }
    }
}
