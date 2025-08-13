package Ex_30_Exceptions;

public class Lab_187_String_NullPointer {
    public static void main(String[] args) {
        String name= null;
        name.trim();
        // here we cant trim the null
        //and this throws an error during runtime
        //Its is unchecked exception
    }
}
