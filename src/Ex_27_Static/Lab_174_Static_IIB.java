package Ex_27_Static;

public class Lab_174_Static_IIB {

    public static void main(String[] args) {
        P P1= new P();
        System.out.println(P.a);//Here static will be called with class name
        //If we change the value of a
        P1.a=20;
        System.out.println(P.a);
        //here static means shared to all and common

        //here we cant acces using class name
        //System.out.println(P.b);
        System.out.println(P1.b);//we call using object reference

    }
}

class P{
    static int a=10;//static variable
    //here static means shared to all and common

    //if we dont have static
    int b=30;
    static {
        // This is static block.
        // This is called whenever a class a loaded.
        System.out.println("Hi, this is called, becoz, class is laoded");
        //This will be executed first bcz class will be loaded first
        // and class will be loaded only one time


        // The usage of static block is
        // if you want to call some of the methods,
        // like calling a database connection, calling an Excel collection


    }
}

