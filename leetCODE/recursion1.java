public class recursion1 {
    public static void printSum(int i, int n, int sum) {
        sum += i;
        if (i == n) {
            System.out.println(sum);
            return;
        }
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        printSum(1, 10, 0);
    }
}