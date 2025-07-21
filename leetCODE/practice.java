import java.util.*;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age = sc.nextInt();

        System.out.print("what is your gpa?");
        double gpa = sc.nextDouble();

        System.out.print("are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("hello " + name);
        System.out.println("your age: " + age);
        System.out.println("your gpa is: " + gpa);
        // System.out.println("Student: " + isStudent);

        sc.close();

    }
}