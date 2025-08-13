package Ex_30_Exceptions;

public class Lab_189_TryCatch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a=10/0;
        } catch (ArithmeticException e) {
            System.out.println("Are you Fool");
        }
        System.out.println(2);
        // 0/p is this will print all 1,Are you Fool,2 bcz we have handled the exception
      //  System.out.println(a);
        //this throws an compile time error bcz a is intailised witjin
        // try block cant access ouside the block
        //If we want to access need to intalise outside the block

    }

}
