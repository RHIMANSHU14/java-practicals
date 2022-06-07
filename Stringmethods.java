class Stringmethods
{
    public static void main (String[] args)
    {
        String s1 ="WELCOME TO JAVA PROGRAMMING";
        String s2 ="WELCOME TO C++ PROGRAMMING";

        StringBuffer ob1=new StringBuffer(s1);
        StringBuffer ob2=new StringBuffer(s2);
        
        System.out.println("Exexuting setCharAt() :");
        ob1.setCharAt(6,'E');
        System.out.println(ob1+"\n");
        
        System.out.println("Exexuting setLength() ;");
        ob1.setLength(15);
        System.out.println(ob+"\n"); 
       
        System.out.println("Exexuting append() :");
        ob1.append("XXXX");
        System.out.println(ob+"\n"); 
       
        System.out.println("Exexuting insert() :");
        ob1.insert(7,"YELLOW");
        System.out.println(ob1+"\n");
           
       System.out.println("Exexuting equals() :");
       System.out.println(ob1.equals(ob2));
        
    }
}
