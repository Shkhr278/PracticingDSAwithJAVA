import java.util.*;

public class for_loops {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

//        1.
        System.out.print("Enter how many times you want to loop: ");
        int max = sc.nextInt();
        for (int i=0; i<max; i++) {
            System.out.println(i);
        }

//        2.
        System.out.println("how many seconds to countdown from? : ");
        int start = sc.nextInt();
         for (int i =start; i>0; i--){
             System.out.println(i);
             Thread.sleep(1000);
        }
        System.out.println("happy birthday");


        sc.close();
    }
}