package June_25th_Arrays;

public class Lab130_Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] marks ={10,20,30};

        int sum=0;
        for (int i = 0; i < marks.length ; i++) {
            sum= sum+marks[i];
        }
        System.out.println(sum);

        }
    }

