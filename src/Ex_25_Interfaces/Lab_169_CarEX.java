package Ex_25_Interfaces;

public class Lab_169_CarEX {

    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drive();
    }

    }




    class Car1 implements Engine1,Brakes{

        void drive(){
            startEngine();
            applyBreak();
            stopEngine();
        }




        @Override
        public void applyBreak() {
            System.out.println("Apply Break");
        }

        @Override
        public void startEngine() {
            System.out.println("Start Engine");

        }

        @Override
        public void stopEngine() {
            System.out.println("Stop Engine");
        }

        @Override
        public void money() {
            System.out.println("Son has o earn by itSelf!");
        }
    }















    interface Brakes {
        void applyBreak();
        void money();
    }

    interface Engine1 {
        void startEngine();
        void money();
        void stopEngine();

        default void completeF1() {
            System.out.println("Default complete function!");
        }

    }
