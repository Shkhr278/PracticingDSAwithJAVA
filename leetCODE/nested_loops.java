import java.util.*;

public class nested_loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows ;
        int cols ;
        char symbols ;

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        cols = sc.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbols = sc.next().charAt(0);

        for(int i =1; i <= rows ; i++){
            for (int j= 1 ; j<= cols; j++){
                System.out.println(symbols);
            }
        }

        sc.close();
    }
}