package oops;

// Base class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Intermediate class extending Animal
class Mammal extends Animal {
    void breathe() {
        System.out.println(name + " is breathing.");
    }
}

// Derived class extending Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        
        // Calling methods from all levels
        myDog.eat();     // Inherited from Animal
        myDog.breathe(); // Inherited from Mammal
        myDog.bark();    // Defined in Dog
    }
}
