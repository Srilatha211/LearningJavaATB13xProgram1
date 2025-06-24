package June_24th_String_builder_Buffer;

public class Lab120_StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        String s1="Srilatha";
        String s2= "Srilatha";
        StringBuffer stringBuffer= new StringBuffer("Srilatha");
        StringBuilder stringBuilder= new StringBuilder("Srilatha");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);



    }
}
