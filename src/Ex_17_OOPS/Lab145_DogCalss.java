package Ex_17_OOPS;

public class Lab145_DogCalss {
    public static void main(String[] args) {
Dog dog= new Dog();
dog.walk();
dog.bark();
    }
}
class Dog{
    String name;
    String breed;
    String color_eyes;


    void walk() {
        System.out.println("Walk");
    }

    void bark() {
        System.out.println("Bark");

    }

}

