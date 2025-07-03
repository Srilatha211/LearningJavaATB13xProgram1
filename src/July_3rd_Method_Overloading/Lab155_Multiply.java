package July_3rd_Method_Overloading;

public class MethodOverloading_Multiply {
    public static void main(String[] args) {

        MathOperator mo= new MathOperator();
        int two = mo.two_multiply(5, 5);
        int three = mo.three_multiply(2,5,9);
        System.out.println(two);
        System.out.println(three);


    }
}
class MathOperator{

    static int two_multiply(int a, int b){
return a*b;
    }

    static int three_multiply(int a, int b, int c)
    {
        return a*b*c;
    }
}