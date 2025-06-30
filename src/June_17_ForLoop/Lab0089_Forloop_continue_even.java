package June_17_ForLoop;

public class Lab0089_Forloop_continue_even {
    public static void main(String[] args) {
        for(int i=0; i<10; i++)// Runs 10 times, 0-9
        {
            if(i==0)
            {
                continue;
            }
            System.out.println("odd number" + i);
        }
    }
}
