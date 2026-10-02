package Linked_List_Programs;
import java.util.Scanner;


class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}


public class Count_Total_Nodes 
{
    private static Node root=null;
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of nodes you want to insert : ");
        int range=sc.nextInt();
        for(int i=0;i<range;i++)
        {
            System.out.print("Enter the value : ");
            int data=sc.nextInt();
            append(data);
        }
        int result=length();
        System.out.println("Length of linked list : "+ result);
    }


    public static void append(int data)
    {
        Node newNode=new Node(data);
        if(root == null)
        {
            root=newNode;
        }
        else
        {
            Node temp=root;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }


public static int length()
{
    int c=0;
    Node temp=root;
    while(temp != null)
    {
        c++;
        temp=temp.next;
    }
    return c;
}

}
