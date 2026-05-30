package Numbers_Based_Program;
import java.util.Scanner;
public class Duck_Number 
{
    public static void main(String args[])
    {
        int num,c=1,d,n;
        boolean condition_1=false;
        boolean condition_2=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=sc.nextInt();
        n=num;
        while(num!=0)
        {
            d=num%10;
            c=c*10;
            if(d==0)
            {
                condition_1=true;
            }
            num=num/10;
        }
        if((n/(c/10))==0)
        {
            condition_2=true;
        }
        if(condition_1==true && condition_2==false)
        {
            System.out.println("Number is duck number");
        }
        else 
        {
            System.out.println("Number is not a duck number");
        }
    }
}
