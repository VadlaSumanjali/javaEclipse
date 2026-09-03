package array2;
import java.util.HashMap;

public class MaximumOccurrence {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int maxElement = 0;

        for (int num : map.keySet()) {

            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxElement = num;
            }
        }

        System.out.println("Maximum occurring element = " + maxElement);
        System.out.println("Count = " + maxCount);
    }
}