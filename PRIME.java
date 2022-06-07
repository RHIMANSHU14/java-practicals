import java.util.*;
public class PRIME {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n= a.nextInt();
        if(n%2==0){
            System.out.print("Number is not prime");
        }else{
            System.out.print("Number is prime");
        }
    }
}