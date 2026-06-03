package Numbers_Based_Program;
import java.util.Scanner;
public class Peterson_Number 
{
    public static void main(String args[])
    {
        int num,fact=1,d=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        int n=num;
        while(num!=0)
        {
            d=num%10;
            for(int i=1;i<d+1;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1;
            num=num/10;
        }
        if(n==sum)
        {
            System.out.println("Number is a Peterson Number");
        }
        else 
        {
            System.out.println("Number is not a Peterson Number");
        }
    }
    
}
