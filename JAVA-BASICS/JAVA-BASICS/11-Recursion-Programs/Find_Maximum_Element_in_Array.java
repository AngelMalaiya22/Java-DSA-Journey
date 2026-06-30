package Recursion_Programs;
import java.util.Scanner;
public class Find_Maximum_Element_in_Array 
{
    public static void maximum(int arr[], int max, int index)
    {
        if(index == arr.length)
        {
            System.out.print(max);
            return;
        }
        else
        {
            if(arr[index] > max)
            {
                max=arr[index];
            }
            maximum(arr, max, index+1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int index=0;
        maximum(arr, max, index);
    }
    
}
