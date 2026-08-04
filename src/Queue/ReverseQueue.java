package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue: " + q);
 
        System.out.println();

        Stack<Integer> s = new Stack<>();

        // Move queue -> stack
        while (!q.isEmpty()) {
            s.push(q.poll());
        }

        System.out.println("Stack: " + s);

        // Move stack -> queue
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        System.out.println("Reversed Queue: " + q);
    }
}