import java.util.Scanner;

public class Functions {
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printName(name);
    }
}