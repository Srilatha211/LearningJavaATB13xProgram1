package Ex_17_OOPS;

public class Lab143_Class_creation {
    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;


    // These are called as Behaviours, Member Functions, Functions, Methods.
    void walk(){
        System.out.println("Walking");
    }

    void eat(String food){
        System.out.println("Walking");
    }
// we can also create "String class which has return types
    //this is without argument with return type -- type 2
    String sleep(){
        System.out.println("Walking");
        return null;
    }
}
