package Ex_30_Exceptions;

public class Lab_195_Try_Catch_finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            b = a / 0;//throws an arthimetic exception
        } catch (ArithmeticException e) {
            System.out.println("Arthimetic Exception is caught");
        } finally {
            System.out.println("Will executes always");

        }
    }
}
