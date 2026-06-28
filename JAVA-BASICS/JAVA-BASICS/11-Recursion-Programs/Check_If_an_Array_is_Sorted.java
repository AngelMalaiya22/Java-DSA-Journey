package Recursion_Programs;
import java.util.Scanner;
public class Check_If_an_Array_is_Sorted 
{
    public static boolean sorted(int arr[], int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        
        if(arr[index]<=arr[index+1])
        {
            return sorted(arr, index+1);
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements : ");
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(sorted(arr, 0))
        {
            System.out.print("The array is sorted");
        }
        else
            {
            System.out.println("The array is not sorted");
        }
    }
}
