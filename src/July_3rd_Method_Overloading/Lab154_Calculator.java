package July_3rd_Method_Overloading;

public class MethodOverloading_Calculator {
    public static void main(String[] args) {
        Calculator cal= new Calculator();
        int result = cal.add(10,20);
        System.out.println(result);

        double result1=Calculator.add(13.6,45.9);
        System.out.println(result1);

    }
}
class Calculator{

    static int add(int a,int b) {
        return a + b;
    }
        static double add(double a, double b){
            return a+b;
        }
    }
