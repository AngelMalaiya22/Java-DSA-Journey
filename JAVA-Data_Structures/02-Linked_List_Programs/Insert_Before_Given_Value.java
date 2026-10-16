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


public class Insert_Before_Given_Value 
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
        System.out.println("Enter the position at which you want to insert : ");
        int pos=sc.nextInt();
        System.out.println("Enter the value you want to insert : ");
        int data=sc.nextInt();
        insert_before_value(pos, data);
        display();
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


    public static void insert_before_value(int pos, int data)
    {
        Node newNode=new Node(data);
        Node temp=root;
        int index=0;
        while(temp != null)
        {
            if(index+2 == pos)
            {
                newNode.next=temp.next;
                temp.next=newNode;
            }
            index++;
            temp=temp.next;
        }
    }


    public static void display()
    {
        if(root == null)
        {
            System.out.println("\nList is empty");
            return;
        }
        else
        {
            Node temp = root;
            System.out.print("\nLinked list : ");
            while(temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
