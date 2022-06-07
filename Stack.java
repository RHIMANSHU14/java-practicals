
    class St
    {
        int s[]=new int[10];
        int tos;
        St()
        {
            tos=-1;
        }
        void push(int item)
        {
            if(tos==9)
                System.out.println("Stack is full");
            else
                s[++tos]=item;
        }
        int pop()
        {
            if(tos<0)
            {
                System.out.println("stack underflow");
                return 0;
            }
            else
                return s[tos--];
        }
    }

    class Stack
    {
        public static void main(String args[])
        {	St ob=new St();
            for(int i=0; i<10; i++)
                ob.push(i);
            System.out.println("the stack is");
            for(int i=0; i<10; i++)
                System.out.print(ob.pop( ));
        }
    }

