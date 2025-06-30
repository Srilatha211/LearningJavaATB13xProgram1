package June_24th_String_builder_Buffer;

public class Lab119_StringBuilder {
    public static void main(String[] args) {
        StringBuilder SB= new StringBuilder("Hello");
        SB.append("World");
        SB.reverse();
        System.out.println(SB);
    }
}
