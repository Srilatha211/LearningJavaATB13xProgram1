package Ex_4_TypeCasting;

public class Lab0039_Narrowing_Explicit {
    public static void main(String[] args) {
        double d= 400.5;
        int i = (int)d;
        System.out.println(i);

        int a= 300;
        byte b= (byte) a;
        System.out.println(b);

        //byte b=(byte)d;
       //System.out.println(b);

    }
}
