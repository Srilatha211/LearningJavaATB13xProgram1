package Ex_2_Java_Basics;

public class Lab0022_Relational_Operator {
    public static void main(String[] args) {
        // > --> Greater than
        // >= --> Greater than or equal
        // < --> Less than
        // <= --> Less than or equal
        // == --> Equal too
        // !== --> not Equal too
        int a = 15;
        int b = 6;
        float c = 20.5f;
        boolean b1 = b > a;
        boolean b2 = a==c;
        boolean b3 = c < a;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        int percenatge_p1= 75;
        int percenatge_p2= 60;
        boolean res= percenatge_p2<=percenatge_p1;
        boolean res1= percenatge_p2>=percenatge_p1;
        System.out.println(res);
        System.out.println(res1);




    }
}
