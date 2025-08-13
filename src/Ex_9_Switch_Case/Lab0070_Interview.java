package Ex_9_Switch_Case;

public class Lab0070_Interview
{
    public static void main(String[] args) {
        //Here  this is to confuse bcz a is intialised but not used anywhere
        // else the o/p is "System.out.println("print case -1");"
        // bcz it matches with "case -1"
        int a=10;
        switch(-1){
            case -1:
                System.out.println("print case -1");
                break;
            case 2:
                System.out.println("print case 2 ");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
