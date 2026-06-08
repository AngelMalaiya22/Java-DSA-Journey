package Pattern_Based_Programs;

public class Inverted_Half_Pyramid 
{
    public static void main(String args[])
    {
        int c=4;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<c+1;j++)
            {
                System.out.print("* ");
            }
            c--;
            System.out.println("");
        }
    }
    
}
