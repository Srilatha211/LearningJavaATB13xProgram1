package Task.July_7th_Task;

public class Task_7_Interfaces_Constants {
    public static void main(String[] args) {
        Bike B1= new Bike();
        B1.display();
    }
}

interface Constant{
    int MAX_SPEED = 120;
}

class Bike implements Constant{
    void display(){
        System.out.println("This is the MAX_SPEED : " + MAX_SPEED  + " km/h");
    }
}