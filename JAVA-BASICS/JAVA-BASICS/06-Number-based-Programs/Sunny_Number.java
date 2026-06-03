package Numbers_Based_Program;
import java.util.Scanner;
public class Sunny_Number 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        int n=num;
        num=num+1;
        int sqrt=(int)Math.sqrt(num);
        if(sqrt*sqrt==num)
        {
            System.out.println("Number is a Sunny Number");
        }
        else 
        {
            System.out.println("Number is not a Sunny Number");
        }
    }
    
}
