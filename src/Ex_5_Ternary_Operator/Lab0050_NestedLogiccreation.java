package Ex_5_Ternary_Operator;

public class Lab0050_NestedLogiccreation {
    public static void main(String[] args) {
        int n1=3;
        int n2=5;
                int n3=-1;
               // Step 1== Find the Input & Output
        //I/O-- n1,n2,n3--> int
        //O/P-- String --> max numbers

        //Step 2-- Rough Logic-->Think about
        // n1>n2 , n1>3--> n1
        //n2>n3 , n2>n1 -- >n2
        //n3

        //Step 3
        //int max = n1>n2 ? A:B
        //A--> n1>n3 ? n1:n3
        //B--> n2>n3 ? n2:n3
        int max = (n1>n2)? (n1>n3)? n1 :n3 :(n2>n3)? n2: n3;
        System.out.println(max);

        // find the maximum between three numbers
        //


    }
}
