package Ex_15_String_builder_Buffer;

public class Lab121_StringBuilder {
    public static void main(String[] args) {
        StringBuilder SB= new StringBuilder("Java");
        SB.append("Programming");
        System.out.println(SB);
        SB.length();
        System.out.println(SB);
        SB.delete(0,4);
        System.out.println(SB);

        SB.replace(0,3,"c++");
        System.out.println(SB);
        SB.reverse();
        System.out.println(SB);
    }
}
