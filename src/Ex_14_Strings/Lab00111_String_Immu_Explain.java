package Ex_14_Strings;

public class Lab00111_String_Immu_Explain {

    public static void main(String[] args) {
        String s1= "hi";
        s1= s1.concat("How are you");// here concat--it will merge the value at the end
        System.out.println(s1);
    }
    // here if we dont reassign the value it just print "hi"
    //so, we have reaasigned the value and concatinated
}
