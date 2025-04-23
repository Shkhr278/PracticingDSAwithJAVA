import java.util.Scanner;

public class Functions {
    public static int PRod(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(PRod(num1, num2));
    }
}