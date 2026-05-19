package Operators;
import java.util.Scanner;
public class Check_if_person_eligible_to_vote 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the person :");
        int age = sc.nextInt(System.in);
        if(age>=18)
        {
            System.out.println("The person is eligible for voting");
        }
        else 
        {
            System.out.println("The person is not eligible for voting ");
        }
    }
    
}
