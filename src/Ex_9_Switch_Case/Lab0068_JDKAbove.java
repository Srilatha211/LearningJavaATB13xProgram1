package Ex_9_Switch_Case;

public class Lab0068_JDKAbove {
    public static void main(String[] args) {
        //Here we don't require the "break "  keyword
        // can go with one line using "->"

        int a=2;
        switch (a){
            case 1->System.out.println("This is the ASCII charecter");
            default -> System.out.println("This is the Default case");


        }
    }
}
