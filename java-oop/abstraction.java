/*
Abstraction is a key concept in Object-Oriented Programming (OOP) that helps manage complexity by hiding
the implementation details and exposing only the
 essential features of an object. In Java, abstraction can be achieved using abstract classes and interfaces.
 */
//abstraction
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
