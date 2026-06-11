package Pattern_Based_Programs;

public class Zero_one_Triangle 
{
    public static void main(String args[])
    {
        int a=1,b=0,c=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j<=i)
                {
                    System.out.print(a+" ");
                    c=a;
                    a=b;
                    b=c;
                }
            }
            System.out.println("");
        }
    }
    
}
