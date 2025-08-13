package Ex_24_Abstractaction;

public class Lab165_AB_Cars {
    public static void main(String[] args) {
        Swift S1= new Swift();
       // S1.stopEngine();
       // S1.stratEngine();
       // S1.checkEngine();
        // we can call them simply by having other function
        S1.display();
    }

}

abstract class Engine{
    abstract void stratEngine();
    abstract void stopEngine();
    void checkEngine(){
        System.out.println("Checking Engine");
    }
}

class Swift extends Engine{

    @Override
    void stratEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stoping Engine");

    }

    void display(){
        stratEngine();
        stopEngine();
        checkEngine();
    }
}
