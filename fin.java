  package q17.fin;
    import q17.first.*;
    public class fin 
    {
        public void print()
        {
            System.out.println("Print in public in package q17.fin");	
        }
        private void print2()
        {
            System.out.println("This is printed in q17.fin package class private print2");
        }
        public static void main(String args[])
        {
            fin a = new fin();
            one b = new one();
            a.print();
            a.print2();
            b.print();
            System.out.println("Cannot call private print2 of external class hence using public print3 to call it");
            b.print3();		
        }
    }

    package q17.first;
    public class one 
    {
        public void print()
        {
            System.out.println("This is printed in q17.first package class public print");
        }
        private void print2()
        {
            System.out.println("This is printed in q17.first package class private print2");
        }
        public void print3()
        {
            System.out.println("this prits print2 from private");
            print2();
        }
    }

    package q17.Final;
    import q17.first.*;
    public class Final 
    {
        public void print()
        {
            System.out.println("Print in public in package q17.fin");	
        }
        private void print2()
        {
            System.out.println("This is printed in q17.fin package class private print2");
        }
        public static void main(String args[])
        {
            Final a = new Final();
            one b = new one();
            a.print();
            a.print2();
            b.print();
            System.out.println("Cannot call private print2 of external class hence using public print3 to call it");
            b.print3();	
        }
    }
