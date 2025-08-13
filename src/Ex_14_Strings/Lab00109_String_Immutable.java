package Ex_14_Strings;

public class Lab00109_String_Immutable {
    public static void main(String[] args) {
        String name= "srilatha";
       name.toUpperCase();
        System.out.println(name);

        // the o/p will be "srilatha" bcz we are not assigning any value to the String
        // best example of immutable bcz they cannot be changed
    }
}
