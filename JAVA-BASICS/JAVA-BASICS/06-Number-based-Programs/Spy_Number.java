package Numbers_Based_Program;
import java.util.Scanner;
public class Spy_Number 
{
    public static void main(String args[])
    {
        int num,product=1,sum=0,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        while(num!=0)
        {
            d=num%10;
            sum=sum+d;
            product=product*d;
            num=num/10;
        }
        if(sum==product)
        {
            System.out.println("Number is Spy Number ");
        }
        else 
        {
            System.out.println("Number is not a Spy Number ");
        }
    }
}
