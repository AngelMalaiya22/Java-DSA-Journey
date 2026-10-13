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


public class Find_nth_node_from_last 
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
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        length();
        nthNode(n);
    }

    public static void append(int data) 
    {
        Node newNode = new Node(data);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            Node temp = root;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public static int length()
    {
        Node temp=root;
        int c=0;
        while(temp != null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }

    public static void nthNode(int n)
    {
        int len=length();
        Node temp=root;
        int c=1;
        while(temp.next != null)
        {
            if(c ==((len-n)+1))
            {
                System.out.println("The nth node from last is : "+temp.data);
                break;
            }
            temp=temp.next;
            c++;
        }
    }
}