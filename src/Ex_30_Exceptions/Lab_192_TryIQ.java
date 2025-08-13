package Ex_30_Exceptions;

public class Lab_192_TryIQ {
    public static void main(String[] args) {
        System.out.println("Starting the Program");
        String name = null;
        try {
            name.trim();//java.lang.NullPointerException
            int a =10/0;//java.lang.ArithmeticException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null Exception & Arthimetic Exception");
        } catch (Exception e) {
            System.out.println(" Exception");
        }

        System.out.println("Ending the program");

    }
}
