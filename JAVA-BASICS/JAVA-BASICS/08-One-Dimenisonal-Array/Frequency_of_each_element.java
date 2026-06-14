package OneDimenisonal_Array;
import java.util.Scanner;
public class Frequency_of_each_element 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            int f=0;
            for(int j=0;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    f++;
                }
            }
            System.out.println("Frequency of " + arr[i] + " is : " + f);
        }
    }
    
}
