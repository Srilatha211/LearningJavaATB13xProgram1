package July_3rd_Method_Overloading;

public class Method_Overloading_Find_Maximum {
    public static void main(String[] args) {
        Utility ut= new Utility();
        int Two_Ints= ut.max(10,30);
        System.out.println("Two max Ints : " + Two_Ints);
        int Three_Ints= ut.max(10,30,40);
        System.out.println("Three max Ints : " + Three_Ints);
        double two_Double=ut.max(34.6,56.9);
        System.out.println("Three max Double : " +two_Double);




    }
}
class Utility{

    static int max(int a, int b){
        return a > b ? a:b;


    }
    static int max(int a, int b, int c){
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    static  double max(double a, double b){
        return a > b ? a:b;
    }
}