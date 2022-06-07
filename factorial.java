import java.util.*;
public class factorial  {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number which you want to find factorial= ");
        int x=a.nextInt();
        int f=1;
        for(int i=1;i<=x;i++){
             f=f*i;
        }
        System.out.print("THE FACTORIAL OF THIS NUMBER IS " +  f);
    }
}
