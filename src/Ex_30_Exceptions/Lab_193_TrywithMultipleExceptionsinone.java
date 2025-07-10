package Ex_30_Exceptions;

public class Lab_193_TrywithMultipleExceptionsinone {
    public static void main(String[] args) {
        System.out.println("Stating the Program");
        try {
            String User_Input = args[0];// java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(User_Input);// java.lang.NumberFormatException
            int output = 100 / a;// java.lang.ArithmeticException
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("All the three Exceptions are handled");
        } catch (Exception e) {
            System.out.println("If all the above 3 are not handles this will handle and execute");
        }

        System.out.println("End of Program");
    }
}
