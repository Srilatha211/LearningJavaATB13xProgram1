package List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab_217_ListIterator {
    public static void main(String[] args) {
        Vector List = new Vector();
        List.add("Item1");
        List.add("Item2");
        List.add("Item3");
        List.add("Item4");
        System.out.println(List);
//This is avoalble only in list so not used if common to all list,map,set etc then only we use them

        ListIterator listIterator = List.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.hasNext());


            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.hasPrevious());

            }
            System.out.println(" --- ");

            Iterator iterator = List.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}