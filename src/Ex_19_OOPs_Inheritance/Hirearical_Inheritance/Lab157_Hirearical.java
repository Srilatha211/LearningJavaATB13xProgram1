package Ex_19_OOPs_Inheritance.Hirearical_Inheritance;

public class Lab157_Hirearical {
    public static void main(String[] args) {
        Father f1= new Father();
        f1.home();

        Father f2= new child1();// Dynamic displatch
        f2.home();
        // f2.bike();
        // this is not allowed because child canrt access another child

        child2 c2=  new child2();
        c2.home();

        child3 c3= new child3();
        c3.home();
        c3.bike();
    }
}

class Father{
    void home(){
        System.out.println("3 Bhk");
    }
}
class child1 extends Father{

    void ch1() {
        System.out.println("3 Bhk");
    }
    }
class child2 extends Father{

    void ch2() {
        System.out.println("3 Bhk");
    }
}
class child3 extends Father{

    void ch3() {
        System.out.println("3 Bhk");
    }
    void bike(){
        System.out.println("bike");
    }
}