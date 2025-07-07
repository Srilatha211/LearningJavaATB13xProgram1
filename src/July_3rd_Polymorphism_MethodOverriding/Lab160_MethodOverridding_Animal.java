package July_3rd_Polymorphism_MethodOverriding;

public class Lab160_MethodOverridding_Animal {
    public static void main(String[] args) {
        Dog D1= new Dog();
        D1.sound();// it will fetch the Dog class bcz which object is created that will be called
        //Suppose if sound() is not present in Dog class then it will call Animal - Default sound


    }

}

class Animal{

    void sound(){
        System.out.println("Default Sound");

    }
}

class Dog extends Animal{
@Override
    void sound(){
        System.out.println("Default Sound");

    }
}