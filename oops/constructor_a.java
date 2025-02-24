package oops;

class Car {
    String brand;
    String model;

    // Parameterized constructor
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Copy constructor
    Car(Car original) {
        this.brand = original.brand;
        this.model = original.model;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }
}

public class constructor_a {
    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Car originalCar = new Car("Honda", "Civic");
        System.out.println("Original Car:");
        originalCar.displayInfo();

        // Create a new object using the copy constructor
        Car copiedCar = new Car(originalCar);
        System.out.println("\nCopied Car:");
        copiedCar.displayInfo();
    }
}
