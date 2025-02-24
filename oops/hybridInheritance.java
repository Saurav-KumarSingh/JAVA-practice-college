package oops;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Intermediate class defining a breathe() method
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing.");
    }
}

// First derived class from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Second derived class from Mammal
class Cat extends Mammal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

// Main class
public class hybridInheritance {
    public static void main(String[] args) {
        // Dog object
        Dog myDog = new Dog();
        myDog.eat();      // Inherited from Animal
        myDog.breathe();  // Inherited from Mammal
        myDog.bark();     // Specific to Dog

        System.out.println();

        // Cat object
        Cat myCat = new Cat();
        myCat.eat();      // Inherited from Animal
        myCat.breathe();  // Inherited from Mammal
        myCat.meow();     // Specific to Cat
    }
}
