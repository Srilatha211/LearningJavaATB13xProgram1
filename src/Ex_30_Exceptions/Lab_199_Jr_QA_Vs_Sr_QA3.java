package Ex_30_Exceptions;

public class Lab_199_Jr_QA_Vs_Sr_QA3 {
    public static void main(String[] args) {

    // Sr. QA
    try {
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException
        int b = 100 / a; // ArithmeticException
        System.out.println(b);
    } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }
}
}