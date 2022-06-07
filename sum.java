
import java.util.Scanner;

public class sum {
    public static void main (String args[]){

        System.out.print("Enter the first number= ");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.print("Enter the second number= ");
        int y = a.nextInt();
        int sum = x + y;
        System.out.println("Sum of two number= "+sum);
    }
}
