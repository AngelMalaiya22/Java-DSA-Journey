package Pattern_Based_Programs;

public class Hollow_Rectangle 
{
    public static void main(String args[])
    {
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<6;j++)
            {
                if(i==1 || i==5 || j==1|| j==5)
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
