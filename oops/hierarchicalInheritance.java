package oops;

// Base class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// First child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Second child class inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing.");
    }
}

// Main class
public class hierarchicalInheritance {
    public static void main(String[] args) {
        // Creating an object of Dog
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();   // Inherited from Animal
        myDog.bark();  // Specific to Dog

        // Creating an object of Cat
        Cat myCat = new Cat();
        myCat.name = "Whiskers";
        myCat.eat();   // Inherited from Animal
        myCat.meow();  // Specific to Cat
    }
}

