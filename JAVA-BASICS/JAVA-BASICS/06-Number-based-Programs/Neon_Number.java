package Numbers_Based_Program;
import java.util.Scanner;
public class Neon_Number 
{
    public static void main(String args[])
    {
        int num,square,d,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        num=sc.nextInt();
        square=num*num;
        while(square!=0)
        {
            d=square%10;
            sum=sum+d;
            square=square/10;
        }
        if(sum==num)
        {
            System.out.println("Number is neon number ");
        }
        else 
        {
            System.out.println("Number is not a neon number ");
        }
    }
    
}
