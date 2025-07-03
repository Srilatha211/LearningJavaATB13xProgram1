package July_3rd_Method_Overloading;

public class method_Ovelaoding_GreetUser {
    public static void main(String[] args) {
Greeter G= new Greeter();
        G.greet();
G.greet("Hello, Java!");
    }
}
class Greeter{

    static void greet() {

        System.out.println("Hello!");
    }

    static String greet(String name){
        System.out.println("Hello, Java!");
        return name ;
    }



}
