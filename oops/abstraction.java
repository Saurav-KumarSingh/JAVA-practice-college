package oops;

// Abstract class
abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    abstract void makeSound();
    
    // Concrete method (can be used as is)
    void eat() {
        System.out.println("This animal is eating.");
    }
}


class Dog extends Animal {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    // Providing implementation for abstract method 
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class abstraction {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal(); // Not allowed (Cannot instantiate an abstract class)
        
        Animal myDog = new Dog();
        myDog.makeSound(); 
        myDog.eat();      

        System.out.println();

        Animal myCat = new Cat();
        myCat.makeSound(); 
        myCat.eat();       
    }
}
