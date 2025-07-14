package List;

import java.util.ArrayList;

public class Lab_210_ArrayList {
    public static void main(String[] args) {
     //   List l = new ArrayList(); // Dynamic dispatch
     //   List <Integer> l = new ArrayList(); // if we use this only integers are accepted bcz its hardcoded
        ArrayList l = new ArrayList();// Dynamic dispatch
        l.add(23);  //intgers
        l.add("sri");  //Strings
        l.add("true"); //Boolean
        l.add(20.9); // Double

        //here why we use List as class name
        // because List is class of Arraylist

        //Array list accepts any type of data types

    }
}
