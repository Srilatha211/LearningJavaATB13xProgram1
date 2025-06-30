package June_17_ForLoop;

public class Lab00_77_Nocondition_InfiniteLoop
{

    public static void main(String[] args) {
        for(int i=0;; i++)
        {
            System.out.println(i);

        }//Here we will have an infinite loop as we dont have the condition
        // exit code 130 --  which is stopped by ourslef by clicking on red button
        // exit code 0- code run successfull

    }
}
