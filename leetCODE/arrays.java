import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the array");
            int size = sc.nextInt();
            int numbers[] = new int[size];

            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            int x = sc.nextInt();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == x) {
                    System.out.println("number found at index:" + i);
                }
            }
        }
    }
}