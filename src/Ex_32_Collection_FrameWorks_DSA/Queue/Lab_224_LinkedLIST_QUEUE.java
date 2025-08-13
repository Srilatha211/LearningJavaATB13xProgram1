package Ex_32_Collection_FrameWorks_DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab_224_LinkedLIST_QUEUE {

        public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
    }