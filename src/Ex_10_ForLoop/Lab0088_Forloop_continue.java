package Ex_10_ForLoop;

public class Lab0088_Forloop_continue {
    public static void main(String[] args) {
        for( int i=0; i<10; i++)// will run 10 times, 0-9
        {
            if(i%2==0){
                continue;
                //will skip and move forward and will print
            }System.out.println("odd number--" + i);
            // 0/p - 5 will skip and rests will print from 0 -9
        }


    }
}
