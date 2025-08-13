package Task.July_9th_Exceptions_Task;

/*✅ Task 5: Catch Using Exception (Generic Catch)

📘 Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.*/



public class Task_5 {
    public static void main(String[] args) {
        int a=0;

        try {
            a = 10/0;//java.lang.ArithmeticException

        } catch (Exception e) {

            System.out.println("Divide by Zero is not allowed");
        }

        System.out.println(a);
    }
}

