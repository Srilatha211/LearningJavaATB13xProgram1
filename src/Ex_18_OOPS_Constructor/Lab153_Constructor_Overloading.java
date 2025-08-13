package Ex_18_OOPS_Constructor;

public class Lab153_Constructor_Overloading {
    public static void main(String[] args) {
        Person1 P= new Person1();
        P.name = "DC";
        System.out.println(P.name);


        Person1 A= new Person1("Sri", 123445,"drtrf","Hyd","Tel");
        Person1 B= new Person1("latha", 123445,"drtrf","Hyd");
        Person1 C= new Person1("kore", 123445,"drtrf");

        System.out.println(A.name);
        System.out.println(B.Address);
        System.out.println(C.Phone);
    }
    }

class Person1 {

    String name;
    long Phone;
    String Address;
    String city;
    String State;


    Person1() {

    }

    Person1(String User_name, long User_Phone, String User_Address, String User_city, String User_State) {
        this.name = User_name;
        this.Phone = User_Phone;
        this.Address = User_Address;
        this.city = User_city;
        this.State = User_State;
    }

    Person1(String User_name, long User_Phone, String User_Address, String User_city) {
        this.name = User_name;
        this.Phone = User_Phone;
        this.Address = User_Address;
        this.city = User_city;
    }

    Person1(String User_name, long User_Phone, String User_Address) {
        this.name = User_name;
        this.Phone = User_Phone;
        this.Address = User_Address;

    }

    Person1(String User_name, long User_Phone) {
        this.name = User_name;
        this.Phone = User_Phone;

    }
    Person1(String User_name) {
        this.name = User_name;

    }
}