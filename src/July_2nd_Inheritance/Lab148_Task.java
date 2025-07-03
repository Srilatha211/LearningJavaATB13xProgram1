package July_2nd_Inheritance;

public class Lab148_Task {

    public static void main(String[] args) {


        cat c= new cat();


        c.makeSound();
        c.meow();
    }
}

class Animal{

    void makeSound(){
        System.out.println("Parent class - Animal");
    }
}

class cat extends Animal{

    void meow()
    {
        System.out.println("child class - Cat: Makes meow sound");

    }
}

