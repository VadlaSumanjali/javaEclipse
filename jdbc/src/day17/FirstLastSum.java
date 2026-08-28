package day17;
class FirstLastSum {
    public static void main(String[] args) {

        int n = 583924;

        int last = n % 10;
        int first = n;

        while (first >= 10) {
            first = first / 10;
        }

        int sum = first + last;

        System.out.println("First digit: " + first);
        System.out.println("Last digit: " + last);
        System.out.println("Sum: " + sum);
    }
}
