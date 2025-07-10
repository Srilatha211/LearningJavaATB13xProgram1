package Task.July_7th_Task;

public class Task_1_Animal_Sound_Abstract_Method_Implementation {
    public static void main(String[] args) {
        Cat c1= new Cat();
        c1.makeSound();
        Dog D1= new Dog();
        D1.makeSound();
    }
}
abstract class Animal{
    abstract  void makeSound();
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog Barks!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat Meow!");
    }

    void display(){
        makeSound();
    }
}