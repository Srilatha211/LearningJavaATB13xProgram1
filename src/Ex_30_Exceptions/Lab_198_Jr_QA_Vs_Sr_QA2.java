package Ex_30_Exceptions;

public class Lab_198_Jr_QA_Vs_Sr_QA2 {public static void main(String[] args) {
    // QA
    try {
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException
        int b = 100 / a; // ArithmeticException
        System.out.println(b);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
}
