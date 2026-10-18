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

public class Search_an_Element 
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
        System.out.println("Enter the number you wan to search : ");
        int s=sc.nextInt();
        boolean result=search(s);
        System.out.println(result);
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


    public static boolean search(int s)
    {
        Node temp=root;
        while(temp != null)
        {
            if(temp.data == s)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

}


