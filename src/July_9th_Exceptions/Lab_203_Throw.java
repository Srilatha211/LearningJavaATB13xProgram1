package July_9th_Exceptions;



public class Lab_203_Throw {
    public static void main(String[] args) {
//If we want to through the exception explicitly
    }
    static void divideByZero(int a ){
        if(a ==0){
            throw new ArithmeticException("Error a == 0");
        }
    }
}