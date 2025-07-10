package Task.July_9th_Exceptions_Task;


/*Task 1: Basic Try-Catch with ArithmeticException

📘 Description:
Divide a number by zero and handle the exception.*/
public class Task_1 {
    public static void main(String[] args) {
        int a = 10;

        try {
            a = 10 / 0;//java.lang.ArithmeticException
        } catch (Exception e) {
            System.out.println("Divide by Zero not allowed");;
        }
        System.out.println(a);
    }}