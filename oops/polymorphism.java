package oops;

// Class demonstrating both types of polymorphism
class PolymorphismMethod {

    // 1. Compile-Time Polymorphism
    // Function overloading: Same method name, different parameter lists
    void sum(int m, int n) {
        System.out.println("Sum of int m and int n = " + (m + n));
    }
    
    void sum(int m, float n) {
        System.out.println("Sum of int m and float n = " + (m + n));
    }
    
    // 2. Run-Time Polymorphism
    // We'll demonstrate this with method overriding.
    // Define a method that is overridden in the subclass.
    
    void display() {
        System.out.println("Display method in PolymorphismMethod (Parent)");
    }
}

class DerivedPolymorphismMethod extends PolymorphismMethod {
    @Override
    void display() {
        System.out.println("Display method in DerivedPolymorphismMethod (Child)");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        PolymorphismMethod ob = new PolymorphismMethod();
        ob.sum(10, 20);       
        ob.sum(15, (float) 15.5);

        System.out.println();

        // Create a base class reference pointing to a child class object
        PolymorphismMethod polyRef = new DerivedPolymorphismMethod();
        polyRef.display(); // calls DerivedPolymorphismMethod's display() due to overriding
    }
}
