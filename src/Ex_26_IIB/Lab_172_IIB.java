package Ex_26_IIB;

public class Lab_172_IIB {
    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```
    public static void main(String[] args) {
        A a1 = new A();//Here static will be executed first bcz class will be loaded first
        // and class will be loaded only one time
        A a2 = new A();
//How many times u create the object that many times IIB will be called
    }

}

class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        //We can have mulitple IIB's
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }
    static {
        System.out.println("Static");
    }
}
