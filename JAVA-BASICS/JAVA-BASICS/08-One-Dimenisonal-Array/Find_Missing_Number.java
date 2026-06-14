package OneDimenisonal_Array;
import java.util.Scanner;
public class Find_Missing_Number 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(i+1!=arr[i])
            {
                System.out.println("The missing number : "+ (i+1));
                break;
            }
        }

    }
    
}
