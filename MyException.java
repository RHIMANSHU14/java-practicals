import java.util.Scanner;

class MyException
{
    public static void main(String args[])
    {   
        int divisor,dividend,quo;
        Scanner obj = new Scanner ( System.in );

        System.out.println ( " Enter any dividend " );
        dividend = obj.nextInt();

        System.out.println ( " Enter any divisior  " );
        divisor = obj.nextInt();

        try
        { 	
            quo = divident / divisor;
            System.out.println ( " Quotient : " + quo );
        }

        catch (ArithmeticException e)
        {
            System.out.println(" Exception caught : " + e );
        }
    }
}
