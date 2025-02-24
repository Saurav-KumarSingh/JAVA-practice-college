package oops;
class Car {
    // Attributes (data members)
    String brand;
    String model;

    // Method to display car details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }
}


public class first {
    public static void main(String[] args) {
       
        Car myCar = new Car();
        myCar.brand = "G-Wagon";
        myCar.model = "360";
        myCar.displayInfo();
    }
}
