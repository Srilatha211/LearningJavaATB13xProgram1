package July_1st_Constructor;

public class Lab146_Constructor_Creator {
    public static void main(String[] args) {
        Student st= new Student();// Constructor object creation and calling
        // e.gwhen we are born certificate is generated

        new Student();// this is also a object creation without name
        // herer the object is created 2 times,so o/p is 2 times
        Student st1;// this is the object refernce not the object call
        // method calling
        st.name="Srilatha";
        System.out.println(st.name);
        st.Id=12345;
        System.out.println(st.Id);

        st.Learn();
        st.Playing();


    }
}

class Student{

    String name;
    int Id;
//Default constructor will call automatically after the object creation,
// their is no need to call by using object reference as like in methods
   Student() {

       System.out.println("Default constructor");
   }
    void Learn(){
        System.out.println("Learing");

    }
    void Playing(){
        System.out.println("Playing");

    }

}