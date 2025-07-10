package Ex_29_Wrapper_Class;

public class Lab_184_Wrapper_Converstion_1 {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // This Boxing -> automatically JVM will store the value
        // Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue()); // Behav
        System.out.println(Integer.MIN_VALUE); // Behav

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);
    }
}
