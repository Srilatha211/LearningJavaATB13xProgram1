package Ex_20_Polymorphism.MethodOverloading;

public class Lab159_Calculator {
    public static void main(String[] args) {
        Calculator c1= new Calculator();
        c1.add(5, 9);
        c1.add(23,45);

    }
}

class Calculator{

    int add(int a, int b){
        return a+b;
    }

    float add(float a, float b){
        return a+b;
    }
}