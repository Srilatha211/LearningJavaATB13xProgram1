package June_24th_String_builder_Buffer;

public class Lab117_StingBuffer_Creation {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Srilatha");
        sb.append("kore");
        // here in string buffer it wiill replace the new value
        // By removing the previous one bcz it is mutabble
        System.out.println(sb);
    }
}
