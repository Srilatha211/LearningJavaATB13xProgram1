package June_16_Switch_Case;

public class Lab0069_JDKAbove_Multiplematches {
    public static void main(String[] args) {

        int a = 3;
        switch (a) {
            case 1, 8, 9:
                System.out.println("This is case 1");
                break;
            case 6, 2, 7:
                System.out.println("This is case 2");
                break;

            default:
                System.out.println("This is the Default case");
        }
    }
}