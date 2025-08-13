package Ex_30_Exceptions;

public class Lab_191_Trycatch_IQ {
    public static void main(String[] args) {
        String name= null;
        try {
            name.trim();// here we get Null pointer exception


            } catch (NullPointerException e) {
                System.out.println("Null pointer Exception Handled");;
            }

            //Need to handled both we use 2 multiple trycath
            try {
                int a=10/0 ;// here we get Arthimetic Exception
                // Need to handle this Exception too
            } catch (ArithmeticException e) {
                System.out.println("Arthimetic Exception Handled");
            }
            System.out.println(name);

       // but writting these many catch blockes is not a good practide for that
            // we need to add them in one try block in nxt program

    }
}
