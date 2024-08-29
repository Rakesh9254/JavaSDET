package Inheritance; // Changed package name to follow Java conventions

class Animal2 {
    public void makeSound() {
        System.out.println("Animal");
    }
}

class Dog1 extends Animal2 { // Fixed class name to match the superclass
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog1 dog = new Dog1(); // Changed variable name to reflect the object's type
        dog.makeSound(); // Invoking makeSound() method on the Dog object
    }
}
