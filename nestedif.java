public class nestedif 
    {
        public static void main (String args[])
        {
            try
            {
                int a=args.length;
                int b= 24/a;
                System.out.println("a="+a);
                try
                {
                    if(a==1)
                    a=a/(a-a);
                    if(a==2)
                    {
                        int c[] = [1];
                        c[42]=99;	
                    }
                }
                catch(ArrayIndexOutofBoundsException e)
                {
                    System.out.println("array index: " +e);
                }
            }
            catch(ArithmeticException e)
            {
                System.out.println("Divide by zero" +e);
            }
        }
    }
