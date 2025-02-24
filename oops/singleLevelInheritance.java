package oops;

// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class
public class singleLevelInheritance {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();
        
        // Setting properties of the inherited class
        myDog.name = "Buddy";

        // Calling inherited and own methods
        myDog.eat();  
        myDog.bark();
    }
}
