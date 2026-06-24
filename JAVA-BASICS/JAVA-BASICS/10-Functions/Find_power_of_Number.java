package Functions;
import java.util.Scanner;
public class Find_power_of_Number 
{
    public static int Power(int num, int pow)
    {
          int p=1;
          for(int i=1;i<=pow;i++)
            {
                p=p*num;
            } 
            return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("Enter the value of power : ");
        int pow=sc.nextInt();
        int result=Power(num,pow);
        System.out.println(num+" raised to the power "+pow+" is "+result);
    }
}
