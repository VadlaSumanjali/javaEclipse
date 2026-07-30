package Queue;


import java.util.*;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addFirst(10);

        dq.addLast(30);
        dq.addLast(40);

        System.out.println("Deque : " + dq);

        System.out.println("First : " + dq.getFirst());

        System.out.println("Last : " + dq.getLast());

        dq.removeFirst();

        dq.removeLast();

        System.out.println("After Remove : " + dq);

        dq.push(5);

        System.out.println("After Push : " + dq);

        dq.pop();

        System.out.println("After Pop : " + dq);

        System.out.println("Contains 20 : " + dq.contains(20));

        System.out.println("Size : " + dq.size());

        System.out.println("Is Empty : " + dq.isEmpty());
    }
}