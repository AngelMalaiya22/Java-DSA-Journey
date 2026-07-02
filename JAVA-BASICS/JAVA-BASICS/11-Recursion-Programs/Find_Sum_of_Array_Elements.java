package Recursion_Programs;
import java.util.Scanner;
public class Find_Sum_of_Array_Elements 
{
    public static void sum(int arr[], int sum, int index)
    {
        if(index== arr.length)
        {
            System.out.print(sum);
            return;
        }
        else
        {
            sum=sum+arr[index];
            sum(arr, sum, index+1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int index=0;
        sum(arr, sum, index);
    }
}
