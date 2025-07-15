package Ex_32_Collection_FrameWorks_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab_215_Vectors {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        //Vector is same as Array list but
        //Vector which is thread safe and slow


        v.add("sri");
        v.add("latha");
        v.add("kore");
        System.out.println(v);
        v.remove("sri");
        System.out.println(v.contains("kore"));
        System.out.println(v);


        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }


        System.out.println(" ----  For  Each Loop ");

        for (Object o : v) {
            System.out.println(o);
        }

        System.out.println(" ----  Iterator ");

        //Iterator means pointing from one element to other element untill it traverse to last elemnt
        //Irrespective of the data type
//this is important bcz it used in both list and queues
        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ----  Enumeration ");
        //this is not used much

        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }




    }
}