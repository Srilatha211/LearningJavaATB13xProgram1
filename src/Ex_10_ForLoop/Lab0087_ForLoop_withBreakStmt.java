package Ex_10_ForLoop;

public class Lab0087_ForLoop_withBreakStmt {
    public static void main(String[] args) {
        for(int i=0; i<10 ; i++)
        {
            if(i==5)
            {
                break;
            }System.out.println(i);
            //here it prints from 0 to 4 and runs 5 times
        }
    }
}
