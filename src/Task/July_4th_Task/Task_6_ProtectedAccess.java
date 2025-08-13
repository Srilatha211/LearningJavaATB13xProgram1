package Task.July_4th_Task;

public class Task_6_ProtectedAccess {
    public static void main(String[] args) {
    Dog d1 = new Dog();  // Create Dog object
    d1.doEat();          // Call method that uses inherited protected method
}
}


// Parent class
class Animal1 {
    protected void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal1 {
    void doEat() {
        eat();         // Inherited protected method
        // super.eat(); // Optional: explicitly call parent version
    }
}