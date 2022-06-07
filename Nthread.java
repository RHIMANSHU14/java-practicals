class Newthread extends Thread
{	
    String name;
    Newthread(String Threadname)
    {
        super(Threadname);
        name=Threadname;	
        start();
    }
    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
            System.out.println(name+ "  :  "+i);
            sleep(500);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println(name+"  Interrupted  ");
        }

        System.out.println(name+"  Exiting  ");
    }
}

class Nthread
{
    public static void main(String args[])
    {
        Newthread ob1=new Newthread("First");

        System.out.println(" First thread is alive :"+ob1.isAlive() );

        ob1.setPriority(6);

        try{
            for(int i=5;i>0;i--)
            {
                System.out.println("Main Thread : "+i);;
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }

        System.out.println(" First thread is alive :"+ob1.isAlive() );

        System.out.println("Main Thread Exiting");
    }
}
