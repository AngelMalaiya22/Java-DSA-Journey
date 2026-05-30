package Numbers_Based_Program;
import java.util.Scanner;
public class Count_digits 
{
    public static void main(String args[])
    {
        int num, c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number :");
        num=sc.nextInt();
        while(num!=0)
        {
            c++;
            num=num/10;
        }
        System.out.println("The No. of didgits are : "+c);
    }

    
}
