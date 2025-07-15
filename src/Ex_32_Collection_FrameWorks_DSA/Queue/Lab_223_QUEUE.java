package Ex_32_Collection_FrameWorks_DSA.Queue;

import java.util.PriorityQueue;

public class Lab_223_QUEUE {
    public static void main(String[] args) {
        // Ex_32_Collection_FrameWorks_DSA.Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}