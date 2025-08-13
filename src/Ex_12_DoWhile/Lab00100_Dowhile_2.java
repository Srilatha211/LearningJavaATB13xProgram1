package Ex_12_DoWhile;

public class Lab00100_Dowhile_2 {
    public static void main(String[] args) {


        int a=0;

       /* while(a<0){
            System.out.println(a);
            a++;
        }*/

        do {
            System.out.println(a);
            System.out.println("this will execute once before conditon checks");
            a++;
        }
        while(a<0);    }
}
