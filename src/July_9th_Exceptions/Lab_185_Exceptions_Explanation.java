package July_9th_Exceptions;

public class Lab_185_Exceptions_Explanation {

    public static void main(String[] args) {
        System.out.println("Stating the Program");
        String User_Input = args[0];// java.lang.ArrayIndexOutOfBoundsException
       int  a= Integer.parseInt(User_Input);// java.lang.NumberFormatException
       int output = 100/a; // java.lang.ArithmeticException
        System.out.println(output);
        System.out.println("End of Program");

        // No issue with -ve values

        //Here this program contains error
        //Means if we dont pass the arguments it throws

        // java.lang.ArrayIndexOutOfBoundsException

        // If we enter the String in arguments it throws
        // java.lang.NumberFormatException


        // If we pass 0 in the in arguments it throws
        //java.lang.ArithmeticException


        // To handle this we need  Exceptions handling
        //
    }
}
