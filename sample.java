// Base class (Parent)
class Animal {
    private String name; // Encapsulation

    public Animal(String name) {
        this.name = name;
    }

    public void speak() { // Method for Polymorphism
        System.out.println(name + " makes a sound.");
    }

    public String getName() {
        return name;
    }
}

// Derived class (Child) - Inheritance
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override // Polymorphism - method overriding
    public void speak() {
        System.out.println(getName() + " barks.");
    }
}

// Another derived class
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " meows.");
    }
}

// Abstraction - Using abstract class
abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    public void move() {
        System.out.println("Car is moving on the road.");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        // Using encapsulation and polymorphism
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.speak();  // Output: Buddy barks.
        myCat.speak();  // Output: Whiskers meows.

        // Abstraction in action
        Vehicle myCar = new Car();
        myCar.move();   // Output: Car is moving on the road.
    }
}
