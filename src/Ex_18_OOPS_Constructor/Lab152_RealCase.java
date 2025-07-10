package Ex_18_OOPS_Constructor;

public class Lab152_RealCase {

    public static void main(String[] args) {
        Person P1= new Person("Sri","asvc",23567);
       System.out.println(P1.name);
       //In Parameterized Constructor data is created when object is created
        //what if we use Default constructor
        //In DC we set the value after the object is created
        //So, people dont use DC much
        Person P2= new Person();
        P2.name= "Hars";//here we set the value after the object is created
        System.out.println(P2.name);
    }
}

class Person{
    String name;
    String address;
    int phoneno;
    //PC
    Person(String User_name,String User_address, int User_phoneno){
        this.name= User_name;
        this.address= User_address;
        this.phoneno= User_phoneno;
    }
    //DC
    Person(){


    }

}