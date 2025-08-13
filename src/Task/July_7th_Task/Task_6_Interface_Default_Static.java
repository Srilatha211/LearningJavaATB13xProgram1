package Task.July_7th_Task;

public class Task_6_Interface_Default_Static {

    public static void main(String[] args) {
        Car C1= new Car();
        C1.start();           // calls default method from interface
        Vehicle.fuelType();   // calls static method from interface
    }
    }



interface Vehicle{
    default void start(){
        System.out.println("Vehicle started");

    }

    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle {


    }
