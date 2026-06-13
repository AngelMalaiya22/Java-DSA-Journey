package OneDimenisonal_Array;
import java.util.Scanner;
public class Average_of_Array 
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of the array elements is : " + sum);
        float avg=(float)sum/size;
        System.out.println("Average of the array elements is : " + avg);
    }
    
}
