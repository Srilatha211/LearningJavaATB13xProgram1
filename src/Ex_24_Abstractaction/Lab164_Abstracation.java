package Ex_24_Abstractaction;

public class Lab164_Abstracation {
    public static void main(String[] args) {
        child c1= new child();
        c1.loan30K();
        Father f1= new child();
        f1.loan50k();
    }
}

abstract class Father{

    //This is a abstract method
    abstract void loan30K();
    //concrete loan
    void loan50k()
    {
        System.out.println("This is parent loan 50k");
    }
}
class child extends Father{
    void loan30K(){

        System.out.println("child gives loan of 30k of parent");
    }
}