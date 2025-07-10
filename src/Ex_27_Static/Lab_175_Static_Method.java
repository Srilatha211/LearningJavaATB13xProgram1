package Ex_27_Static;

public class Lab_175_Static_Method {
    public static void main(String[] args) {

        A ref1 = new A(10);
        A ref2 = new A(11);
        System.out.println(ref1.a);
        System.out.println(A.b);//This is static variable
        System.out.println(ref2.a);

        System.out.println(ref1.b);
        System.out.println(ref2.b);

        ref1.displayValue();
        ref2.displayValue();

        A.staticMethod();//static method can be accesed by class name


    }

}

class A{
    int a; //  non static - instance variable
    static int b = 20; // static this is shared between - objects

    A(int a){
        this.a = a;
    }

    void displayValue(){
        System.out.println(this.a);
        System.out.println(b); // static variable in instance method allowed
    }

    static void staticMethod(){
        System.out.println("I will be called when class is loaded");
//        System.out.println(this.a); // Methods cannot access non-static variables in a static function.
    }

}
