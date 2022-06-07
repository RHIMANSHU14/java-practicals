package practicle;
    import java.awt.*;
    import java.applet.*;
    public class Program25 extends Applet implements Runnable
    {
        String msg = " Hello World :This is My first Banner Program ";
        Thread t=null;
        boolean stopflag;

        public void init()
        {
            setBackground(Color.cyan);
            setForeground(Color.red);
        }

        public void start()
        {
            t=new Thread(this);
            stopflag=false;	
            t.start();
        }

        public void run()
        {
            for( ; ; )
            {
                try
                {
                    repaint();			
                    Thread.sleep(500);
                    if(stopflag)
                    {
                        break;
                    }
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }

        public void paint(Graphics g)
        {
            Font f=new Font("Segoe Script",Font.BOLD,34);
            g.setFont(f);	
            char ch;
            ch=msg.charAt(0);
            msg=msg.substring(1, msg.length());
            msg+=ch;
            g.drawString(msg, 150, 200);
            showStatus("This is show in status window");
        }
    }
