package OneDimenisonal_Array;
import java.util.Scanner;
public class Rotate_Array_Right_by_one_position 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(arr[size-1]+" ");
        for(int i=0;i<size-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
