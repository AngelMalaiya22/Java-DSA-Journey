package Functions;
import java.util.Scanner;
public class Print_Name 
{
    public static void PrintMyName(String name)
    {
        System.out.println("Name : "+name);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name=sc.next();
        PrintMyName(name);
    }
    
}
