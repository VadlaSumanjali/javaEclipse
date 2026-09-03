package array2;
import java.util.HashMap;

public class DuplicateElements {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 50};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.print("Duplicate elements: ");

        for (int num : map.keySet()) {

            if (map.get(num) > 1) {
                System.out.print(num + " ");
            }
        }
    }
}