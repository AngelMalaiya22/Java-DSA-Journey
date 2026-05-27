package Pattern_Based_Programs;

public class Star_Triangel 
{
    public static void main(String args[])
    {

        int c=4;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(j<c)
                {
                    System.out.print("  ");
                }
                else 
                {   
                    System.out.print("* ");
                }
            }
            c--;
            System.out.println("");
        }
    }
    
} 
