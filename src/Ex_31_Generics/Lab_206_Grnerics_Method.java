package Ex_31_Generics;

public class Lab_206_Grnerics_Method {
    public static void main(String[] args) {
        display(10,40);
       // display("sri","latha");
        //display(40.9,70.0);

        //Generic
        display(10,40);
        display("sri","latha");
        display(40.9,70.0);

    }
    //Here this a normal function where we can only display the integer varaiable
    //not others like string,boolean,double etc,, for that we Generics
static void display(int a, int b){
    System.out.println(a);
    System.out.println(b);
}
//This is the Generics which it supports the all datatypes with one fuction

    static <T> void display(T a, T b){//now this allows us to add any data type
        System.out.println(a);
        System.out.println(b);
    }

}