package June_23_Strings;

public class Lab113_string_Immutable_Interview {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2="Hello";
        String s3= "Hello";

         /*these are string constant pool -- 1 - String
         here we have only overall 1 string, bcz "Hello" is already present once it cannot be changed
        this is how the memory management and is immutable*/
//String s4= new String("Hello");

        String s5= new String("Hello");// 1st String  // This is Object Area creation
        String s6= new String("Hello");// 2nd String
        String s7= new String("hello");// 3rd String// Total - 3 String are present


       // total String Present in
        // SCP | OB |Total
        // 1 | 3 | 4

        //comparision of String-- Checks the reference of Location they are created and  present
        System.out.println(s1==s3);// These are in SCP -- True
        System.out.println(s1==s6);// s1 in  SCP & s6 is in OA -- Not true- False
        System.out.println(s5==s7);// These are in OA but differently created -- False

        // equals -- check for the content value e.g:Hello

        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s6));
        System.out.println(s5.equals(s6));
        System.out.println(s1.equalsIgnoreCase(s7));// s7 content is in Lower case so, for casesentive we use ignorecase


        //equalsIgnoreCase -- Hello,heloo;HeLoo,heloO
        //== -- check for the referenc
        // = assignment  the value
    }

}
