package Numbers_Based_Program;
import java.util.Scanner;
public class Factorial_of_the_number 
{
    public static void main(String args[])
    {
        int num, fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        for(int i=1;i<num+1;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of the number is :"+fact);
    }
    
}
