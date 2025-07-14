package List;

import java.util.ArrayList;
import java.util.List;

public class Lab_211_ArrayList {
    public static void main(String[] args) {
       ArrayList arrayList= new ArrayList();
       arrayList.add("sri");
       arrayList.add("latha");
       arrayList.add("Kore");
       arrayList.add(null);// null is accepted
       arrayList.add("kore");// duplicate is allowed
        arrayList.add(2930);// different data type is also accepted

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        List l= new ArrayList(); // Dynamic dispatch -- allowed
        System.out.println(l.isEmpty());

        List l1 = new ArrayList();// Dynamic dispatch --allowed
        l1.add("L1 string");
        System.out.println(l1);





    }
}
