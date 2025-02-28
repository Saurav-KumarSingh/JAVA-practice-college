// Defining an interface
interface Animal {
    // Abstract method (no implementation)
    void makeSound();

    // Default method (provides a default implementation)
    default void eat() {
        System.out.println("This animal is eating.");
    }
}

// Implementing the interface in a class
class Dog implements Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Another class implementing the same interface
class Cat implements Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class interfaces {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Calls Dog's implementation
        myDog.eat();       // Calls default method from Animal

        System.out.println();

        Animal myCat = new Cat();
        myCat.makeSound(); // Calls Cat's implementation
        myCat.eat();       // Calls default method from Animal
    }
}
