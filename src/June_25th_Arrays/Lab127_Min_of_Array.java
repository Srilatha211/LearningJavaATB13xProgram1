package June_25th_Arrays;

public class Lab127_Min_of_Array {
    public static void main(String[] args) {
        int[] marks={1,56,9,90,30,56,78};
        int min = marks[0];

        for (int i = 0; i >marks.length ; i++) {
            if(marks[i]<min)
            {
               min = marks[i];
            }

        }
        System.out.println("Maximum number in the array is: " + min);

    }
}

