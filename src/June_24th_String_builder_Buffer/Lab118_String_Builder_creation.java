package June_24th_String_builder_Buffer;

public class Lab118_String_Builder_creation {
    public static void main(String[] args) {
        StringBuilder SB= new StringBuilder("Srilatha");
        SB.append(100.0);
        // here in string builder it wiill replace the new value
        // By removing the previous one bcz it is mutabble
        System.out.println(SB);
        SB.reverse();
         System.out.println(SB);

    }
}
