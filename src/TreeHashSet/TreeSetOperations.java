package TreeHashSet;

import java.util.TreeSet;

public class TreeSetOperations {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);
        System.out.println(set.contains(20));
        System.out.println(set.first());
        
        set.remove(30);
        System.out.println(set.higher(10));
        System.out.println(set.lower(30));
        System.out.println(set.ceiling(35));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set);

    }
}