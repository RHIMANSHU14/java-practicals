class Distance
{
    double len;
    int foot;
    double inch;
    Distance()
    {
        len=1;
        inch=1;
        foot=1;
    }

    Distance(int l)
    {
        len=l;
    }
    Distance(Distance ob)
    {	
        len=ob.len;
    }

    void convert(Distance ob1)
    {
        len=ob1.len;
        foot=(int)(ob1.len/30.48);
        System.out.println("The distance in feet is "+"="+foot);
        inch=(ob1.len%30.48);
        System.out.println("The distance in inch is "+"="+inch);
    }
}

class D
{
    public static void main(String args[])
    {
        Distance ob=new Distance(157);
        Distance ob1= new Distance(ob);
        ob1.convert(ob);
    }
}
