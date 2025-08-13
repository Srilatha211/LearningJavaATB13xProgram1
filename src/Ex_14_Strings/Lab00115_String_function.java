package Ex_14_Strings;

public class Lab00115_String_function {
    public static void main(String[] args) {
        String s1= "Hello"; // created in SCP
        String s2="Hello";
        String s3 = new String("Hello");// Created in OA
        String s4= new String("hello");
        System.out.println(s1==s2);// True bcz theyare creates in SCP
        System.out.println(s1==s3);// False bcz s1 - SCP , s3-OA
        System.out.println(s1.equals(s3));// True even they are created in different areas checks only the "content value"
        System.out.println(s1.equals(s4));// False bcz lowercase and even they are created in different areas
    }
}
