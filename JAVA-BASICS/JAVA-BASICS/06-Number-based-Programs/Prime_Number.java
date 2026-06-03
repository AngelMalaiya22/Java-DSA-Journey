package Numbers_Based_Program;
import java.util.Scanner;
public class Prime_Number 
{
    public static void main(String args[])
    {
        int num, c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        num=sc.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Number is a prime number");
        }
        else 
        {
            System.out.println("Number is not a prime number");
        }
    }
    
}
