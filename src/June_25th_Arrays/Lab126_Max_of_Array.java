package June_25th_Arrays;

public class Lab126_Max_of_Array {
    public static void main(String[] args) {
        int[] marks={1,56,9,90,30,56,78};
        int max = marks[0];

        for (int i = 0; i <marks.length ; i++) {
            if(marks[i]>max)
            {
                max = marks[i];
            }

        }
        System.out.println("Maximum number in the array is: " + max);

    }
}
