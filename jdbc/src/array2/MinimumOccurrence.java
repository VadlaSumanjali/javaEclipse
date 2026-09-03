package array2;
import java.util.HashMap;

public class MinimumOccurrence {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int minCount = Integer.MAX_VALUE;
        int minElement = 0;

        for (int num : map.keySet()) {

            if (map.get(num) < minCount) {
                minCount = map.get(num);
                minElement = num;
            }
        }

        System.out.println("Minimum occurring element = " + minElement);
        System.out.println("Count = " + minCount);
    }
}