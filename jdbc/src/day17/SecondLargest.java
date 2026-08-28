package day17;
class SecondLargest {
    public static void main(String[] args) {

        int n = 583924;
        int largest = -1;
        int secondLargest = -1;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } 
            else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            n = n / 10;
        }

        System.out.println("Second largest digit: " + secondLargest);
    }
}
