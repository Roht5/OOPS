// Parent class: Vehicle
class Vehicle {
    // Common behavio
    int a;

    final public void move() {
        System.out.println("Vehicle moves");
    }
}

// Child class: Car
class Car extends Vehicle {
    // Specialized behavior for Car
    public void honk() {
        int c = a;
        System.out.println("Car honks");
    }

}

// Another child class: Bicycle
class Bicycle extends Vehicle {
    // Specialized behavior for Bicycle
    public void ringBell() {
        System.out.println("Bicycle rings bell");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Create objects of Car and Bicycle
        Car myCar = new Car();
        Bicycle myBicycle = new Bicycle();

        // Use behaviors of Car and Bicycle
        myCar.move(); // Vehicle moves
        myCar.honk(); // Car honks

        myBicycle.move(); // Vehicle moves
        myBicycle.ringBell(); // Bicycle rings bell
    }

}
