package July_3th_Method_Overriding;

public class Method_Overridding_Vehicle {
    public static void main(String[] args)
    {
        Vehicle bike = new Bike();
        System.out.println(bike.start());

        Vehicle car = new car();
        System.out.println(car.start());
    }
}
class Vehicle{

    String start()
    {
    return "This is a common Vehicle";
    }
}
class Bike extends Vehicle{

    String start()
    {
        return "Kick start the bike";
    }
}
class car extends Vehicle{

    String start()
    {
        return "Turn the key to start the car";
    }
}