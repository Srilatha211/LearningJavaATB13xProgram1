package July_9th_Exceptions;

/*
✅ Task 8: Throw Exception and Catch It

📘 Description:
Manually throw an exception using throw new ArithmeticException() and catch it.
*/

public class Task_8 {
    public static void main(String[] args) {
            try {
                B(16);  // Will throw exception
            } catch (Exception e) {
                System.out.println("Exception caught : " + e.getMessage());
            }
        }

        static void B(int age) throws ArithmeticException {
            if (age < 18) {
                // Explicitly throwing an exception
                throw new ArithmeticException("Not eligible to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        }
    }
