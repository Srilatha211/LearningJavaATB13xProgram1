package July_9th_Exceptions;

/*✅ Task 9: Try Block Without Exception

📘 Description:
Write a try block that does not throw any exception.
Verify that the catch block is skipped and finally still runs.*/
public class Task_9 {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int a = 10;
            int b = 5;
            int result = a + b;  // No exception is thrown here
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: " + e.getMessage());
            //this will not print bcz thier no exception try execute normally and skips catch

        } finally {
            System.out.println("Inside finally block (always runs)");
        }

        System.out.println("Program continues after try-catch-finally.");
    }

}
