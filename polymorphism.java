//Method Overloading
class MathOperation {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}


// Method OverRRiding
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // Polymorphism in action
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calls the overridden method
        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}
