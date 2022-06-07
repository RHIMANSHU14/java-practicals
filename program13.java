package ques13;

    public class program13 
    {
        public static void VarArg(int ...v)
        {
            System.out.println("number of args is "+v.length);
            System.out.println("content :");
            for(int x: v)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }

        public static void main (String args[])
        {
            int a[]= {1 , 2 , 3 , 4 , 5 , 6};
            int b[]= {7};
            int c[]= {};
            VarArg(a);
            System.out.println();
            
            VarArg(b);
            System.out.println();
            
            VarArg(c);
            System.out.println();
        }
    }
