package Ex_30_Exceptions;

public class Lab_188_Handle_Exceptions {
    public static void main(String[] args) {
        int a=0;

        try {
            a = 10/0;//java.lang.ArithmeticException
            //Here we need to handle using try cath
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            //even we can have custom message
            System.out.println("Divide by Zero is not allowed");
        }

        System.out.println(a);
    }
}

//If their is no issue with the code a=10/2
//then catch will not execute
