package Task.July_7th_Task;

public class Task_4_AbstractVSConcrete {
    public static void main(String[] args) {
        child c1= new child();
        c1.show();
        c1.display();
    }
}


abstract class Parent{
//this is an abstract method
    abstract void show();

    // this is an concrete method means complete
    void display(){
        System.out.println("Concrete method in abstract class");
    }

}

class child extends Parent{
    @Override
    void show(){
        System.out.println("this is the abstract method");

    }
}