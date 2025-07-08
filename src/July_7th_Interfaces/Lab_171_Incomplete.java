package July_7th_Interfaces;

public class Lab_171_Incomplete {
}


    abstract class Incomplete_abstract{
        int a= 10;

        Incomplete_abstract(){

        }


        abstract void display1();
        void display2(){
            a= 25;
            System.out.println("print");
        }
    }

    interface Incomplete_Interface {
//    July_7th_Interfaces.Incomplete_Interface(){
//        Interface never have a concept.
//    }

        int a = 10; // final

        void display();

        default void display2() {
            //a = 12;
            System.out.println("Default is allowed!");
        }

        static void display3() {
            System.out.println("Default is allowed!");
        }
    }
