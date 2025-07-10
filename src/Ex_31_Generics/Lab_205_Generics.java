package Ex_31_Generics;

public class Lab_205_Generics {
    public static void main(String[] args) {
      int res1=  temp_sum(10, 20);
        System.out.println(res1);
        temp_sum(23.5, 56.9);
        temp_sum("sri", "Latha");

    }

//here if we want to do sum for different datatypes we use difeerent functions
    // so, for this to make as single function we use Gernerics
    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}