package OneDimenisonal_Array;

import java.util.Scanner;

public class Smallest_Element 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest element in the array is : " + min);
    }
    
}
