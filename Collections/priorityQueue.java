package Collections;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=100;i>0;i--)
            q.add(i);
        
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);
    }
}
