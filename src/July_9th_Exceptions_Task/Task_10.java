package July_9th_Exceptions_Task;

/*Task 10: Try With Multiple Statements
📘 Description:
Write multiple statements in a try block.
        Ensure if the first fails, the rest are not executed, and control goes to catch.*//**/

public class Task_10 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1: Before exception");

            int result = 10 / 0; // This throws ArithmeticException
//so, the nxt stmt will not execute it will skip
            System.out.println("Statement 2: This won't execute");
            String str = null;
            System.out.println("Length: " + str.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block: Always runs");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}

