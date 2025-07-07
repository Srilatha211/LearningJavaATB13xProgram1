package July_4th_Task;

public class Method_Using_super {
    public static void main(String[] args) {
        dog D = new dog();    // Creating an object of the child class
        D.Bark();             // Calling the Bark method
    }
}

class Animal {
    void walk() {
        System.out.println("He can walk!");
    }
}

class dog extends Animal {
    void Bark() {
        System.out.println("Can Bark!");
        super.walk();  // Accessing the parent class method using super
    }
}