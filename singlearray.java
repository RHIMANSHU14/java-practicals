public class singlearray
    {
        static  int num[]={1,2,3,4,5};
        static void print(int i)
        {
            if(i==0)
                return;
            else
                print(i-1);
            System.out.print(num[i-1]+" ");
        }

        public static void main(String args[])
        {
            print(5);
        }
    }

