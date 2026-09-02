package array;

public class FirstOccurrence {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};

        int target = 20;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("First occurrence index = " + index);
    }
}
