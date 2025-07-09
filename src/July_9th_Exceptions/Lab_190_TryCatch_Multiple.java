package July_9th_Exceptions;

public class Lab_190_TryCatch_Multiple {
    public static void main(String[] args) {
        System.out.println("This is multiple try catch");
        try {
            int a=10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Handle expection with smaller one first- Arthimetic Exception");
        }catch (Exception e) {
            System.out.println("then use lager one:  Exception ");
        }
        System.out.println("It will Print Arthimetic bcz exception is handled with smaller one");
    }
}
