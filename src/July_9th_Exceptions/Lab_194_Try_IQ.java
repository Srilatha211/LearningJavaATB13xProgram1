package July_9th_Exceptions;

public class Lab_194_Try_IQ {
    public static void main(String[] args) {
        int a=0;// this is not vunnerable no need to add in try block
        int b=0;// this is not vunnerable no need to add in try block
        try {
            b= 10/a; //vunnerable code should always be in try
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }

