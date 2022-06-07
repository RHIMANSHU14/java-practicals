import java.util.*;
public class decTobin {
    public static void main(String args[]){
        Scanner a= new Scanner(System.in);
        System.out.print("Enter the number which you want to convert decimal to binary=");
        int x= a.nextInt();
        String binary = Integer.toBinaryString(x);
        System.out.println(x + " in decimal = " + binary + " in binary.");
    }
}
