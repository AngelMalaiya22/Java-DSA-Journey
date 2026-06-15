package OneDimenisonal_Array;

import java.util.Scanner;

public class Second_Largest_Element 
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
        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int sec_max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>sec_max && arr[i]<max)
            {
                sec_max=arr[i];
            }
        }
        System.out.println("Largest element in the array is : " + max);
        System.out.println("Second largest element in the array is : " + sec_max);
    } 
    
}
