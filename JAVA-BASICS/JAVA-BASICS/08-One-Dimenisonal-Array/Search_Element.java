package OneDimenisonal_Array;
import java.util.Scanner;
public class Search_Element 
{
    public static void main(String args[])
    {
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        System.out.print("Enter the element to be Searched :");
        int search=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("The elements is found at "+ (i+1) +" posistion in the array ");
                found=true;
                break;
            }
        }
        if(found==false)
            {
                System.out.println("The elements is not present in the array ");
            }
    }
    
}
