package Set;

import java.util.*;


public class Lab_225_SET_P1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts  = new TreeSet();

//Here duplicate are not allowed in SET's
        //But what is the diiference btwn three hashsets
        hs.add("srilatha");
        hs.add("srilatha");
        hs.add("kore");
        hs.add("kore");
        lhs.add("Kore LHS");
        System.out.println(hs);






    }
}

