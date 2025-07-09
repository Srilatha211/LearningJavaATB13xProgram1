package July_8th_Task_Wrapper_Class;

public class TasK1_Interger_Wrapper {

    public static void main(String[] args) {
        int A=50;
        System.out.println("This is primitive Integer:" +A);
        Integer B=50;//autoboxing - Primitive to Wrapper
        System.out.println("This is the Boxing, Wrapper : " + B);

        Integer C=50;
        int D= 50;//Unboxing- Wrapper to Primitive
        System.out.println("This is the UnBoxing, Wrapper : " + D);    }
}
