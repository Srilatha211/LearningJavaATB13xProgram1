package Ex_13_Functions;

public class Lab00107_sumofNumbers {
    public static void main(String[] args) {

        int result= sum(10,20);
        System.out.println(result);
        sum_of(1,2);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static void sum_of(int a,int b){

        System.out.println(a+b);
    }

}
