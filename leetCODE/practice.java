import java.util.*;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double r;

        System.out.print("enter the value of radius= ");
                r=sc.nextDouble();
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r,2);
        double volume=(4.0/3.0) * Math.PI* Math.pow(r,3);

        System.out.println("circumference = "+ circumference);
        System.out.println("volume = "+ volume);
        System.out.println("area = "+ area);

        sc.close();

    }
}