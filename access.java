import java.util.Scanner;
    class test 
    {
        private 
        int a;
        public 
        int b;
        final int c;
        test(int x,int y,int z)
        {
            a=x;
            b=y;
            c=z;			
        }
        void change()
        {
            int z;
            z=a;
            a=b;
            b=z;
        }
        void show()
        {		
            System.out.println("a="+a+"   b="+b+"   c="+c);
        }
    }

    public class access
    {
        public static void swap(int a,int b)
        {
            int temp;
            temp=a;
            a=b;
            b=temp;
        }

        public static void main(String args[])
        {
            test o1=new test(1,2,3);
            System.out.println("Initial value of a ,b and c");
            o1.show();
            System.out.println();
            System.out.println("Private and final cannot be changed but public can be changed as:");
            System.out.println();
            o1.b=4;
            o1.show();
            System.out.println();
            System.out.println("To show that passing object are pass by reference :");
            System.out.println();
            System.out.println("Initial value of a ,b and c before swap are");
            System.out.println();
            o1.show();
            System.out.println();
            o1.change();
            System.out.println("a,b,c after swap are ");
            o1.show();
            System.out.println();
            System.out.println("Primitive data types are passed by reference as:");
            System.out.println("Enter x and y");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println("x and y before swap ");
            System.out.println("x="+x+"   y="+y);
            swap(x,y);
            System.out.println();
            System.out.println("x and y after swap ");
            System.out.println("x="+x+"   y="+y);
            sc.close();
        }
    }
