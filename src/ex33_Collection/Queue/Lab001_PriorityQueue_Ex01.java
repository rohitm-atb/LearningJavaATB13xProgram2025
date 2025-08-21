package ex33_Collection.Queue;

import java.util.PriorityQueue;

public class Lab001_PriorityQueue_Ex01 {
    public static void main(String[] args) {

        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Rohit");
        q.add("Morankar");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
