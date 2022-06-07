package practicle;
    import java.io.*;
    class Program20
    {
        public static void main(String[] args) throws IOException 
        {
            try
            {
                int i;
                System.out.println("Enter an Integer: ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                i = Integer.parseInt(br.readLine());	
                if (i < 0)
                {
                    throw new intException();
                }
            }
            catch(intException e)
            {
                System.out.println("Exception! Integer is negative");
            }
        }
    }

    class intException extends Exception
    {
        private static final long serialVersionUID = -324573551765039899L;
        public intException(){}	
        public intException(String message)
        {
            super(message);
        }
    }
