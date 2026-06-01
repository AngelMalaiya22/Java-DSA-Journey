package Numbers_Based_Program;
import java.util.Scanner;
public class Perfect_Number 
{
    public static void main(String args[])
    {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
        {
            System.out.println("Number is a Perfect Number");
        }
        else 
        {
            System.out.println("Number is not a Perfect Number");
        }
    }
    
}
