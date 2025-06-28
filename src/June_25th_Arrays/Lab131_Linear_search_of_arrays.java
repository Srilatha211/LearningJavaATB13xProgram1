package June_25th_Arrays;

public class Lab131_Linear_search_of_arrays {

    public static void main(String[] args) {
        int [] marks= {10,20,50,80,90};

        // teaget element- 50 and index is - 3
                int target=50;
        for (int i = 0; i < marks.length ; i++) {
            if (target == marks[i])
            {
                System.out.println("Index is :" + i);
                System.out.println("Index value is :" + marks[i]);
            }

        }
    }
}
