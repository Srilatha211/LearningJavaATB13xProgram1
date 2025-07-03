package July_3th_Method_Overriding;

public class Method_Overridding_Animal {
    public static void main(String[] args) {
Dog dog=new Dog();
cat cat= new cat();
cow cow= new cow();
dog.sound();
cat.sound();
cow.sound();

    }
}
class Animal{

    void sound(){
        System.out.println("This is the default sound");
    }
}

class Dog extends Animal {
@Override
    void sound(){
        System.out.println("The Dog - Barks!");
    }
}
class cat extends Animal{
    @Override

    void sound(){
        System.out.println("The Cat- says Meow");
    }
}
class cow extends Animal{
    @Override

    void sound(){
        System.out.println("The Cow- says Moo");
    }
}