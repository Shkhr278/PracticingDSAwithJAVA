import java.util.*;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        do{
            System.out.println("your age can not be negative");
            System.out.print("enter your age: ");
            age = sc.nextInt();
        }
        while(age<0);
        System.out.println("you are " + age + " years old");

        sc.close();
    }
}
