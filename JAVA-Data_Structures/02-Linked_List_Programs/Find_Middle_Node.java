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


public class Find_Middle_Node 
{
    private static Node root=null;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number nodes you wan to enter : ");
        int range = sc.nextInt();
        for(int i=0;i<range;i++)
        {
            System.out.print("Enter the value");
            int data=sc.nextInt();
            append(data);
        }
        length();
        middle_node();
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
        int count=0;
        Node temp=root;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void middle_node()
    {
        int len=length();
        int i=len/2;
        int index=0;
        Node temp=root;
        while(temp != null)
        {
            if(index == i)
            {
                System.out.print("The Middle Node is : "+ temp.data);
                break;
            }
            else
            {
                temp=temp.next;
                index++;
            }
        }
    }
    
}
