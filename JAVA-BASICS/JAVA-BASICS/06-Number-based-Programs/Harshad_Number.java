package Numbers_Based_Program;
import java.util.Scanner;
public class Harshad_Number 
{
    public static void main(String args[])
    {
        int num,d=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        int n=num;
        while(num!=0)
        {
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
        if(n%sum==0)
        {
            System.out.println("Number is Harshad number ");
        }
        else 
        {
            System.out.println("Number is not a Harshad number");
        }
    }
    
}
