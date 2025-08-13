package Ex_8_Increment_Decrement;

public class Task_Increment_Decrement {
    public static void main(String[] args)

    {
    //Program 1:

    int a = 5;

    int b = a++; // 5

        System.out.println("a: "+a +", b: "+b);

    //Output: a=6 ,b=5


    //Program 2:
    int i = 1;

    i =i+++ ++i;// 1+3=4

        System.out.println(i); // i=4


//Program 3:

    int x = 5;

        System.out.println(x+++ ++x); // 5+7=12


    //Program 4:

    int y = 5;

        System.out.println(++y); // Output: 6

        System.out.println(y++); // Output: 6

        System.out.println(y);   // Output: 7

//Program 5:  Interview Question

    int c = 5;

    int d = c++ + ++c;//5+7=12

        System.out.println("c: "+c); // Output: =7

        System.out.println("d: "+d); // Output: =12


//Program 6:  Interview Question

    int m = 5;

    int n = m++ + ++m + m++ + ++m;//5+7+7+9=28

        System.out.println("m = "+m +", n = "+n);//m=9,n=28
}
}
