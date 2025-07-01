package June_25th_Arrays;

public class Lab134_second_largest_number {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
// teaget element- 34 and index is - 3
        int target=34;
        for (int i = 0; i < numbers.length ; i++) {
            if (target == numbers[i])
            {
                System.out.println("Index is :" + i);
                System.out.println("Index value is :" + numbers[i]);
            }

        }
    }
}
