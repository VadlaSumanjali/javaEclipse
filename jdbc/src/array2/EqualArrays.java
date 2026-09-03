package array2;
public class EqualArrays {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};

        boolean equal = true;

        if (arr1.length != arr2.length) {
            equal = false;
        }
        else {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
