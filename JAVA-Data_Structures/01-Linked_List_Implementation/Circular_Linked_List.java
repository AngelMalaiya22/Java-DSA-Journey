package Linked_List;
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


public class Circular_Linked_List 
{
    private static Node root=null;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice, data, pos;

        while(true)
        {
            System.out.println("\n--- Circular Linked List Operations Menu ---");
            System.out.println("1. Display");
            System.out.println("2. Length");
            System.out.println("3. Append ");
            System.out.println("4. Insert ");
            System.out.println("5. Delete ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    display();
                    break;
                }
                
                case 2:
                {
                    System.out.println("Length of the list : " + length());
                    break;
                }

                case 3:
                {
                    System.out.println("Enter value to append : ");
                    data = sc.nextInt();
                    append(data);
                    break;
                }

                case 4:
                {
                    System.out.print("Enter value to insert : ");
                    data = sc.nextInt();
                    System.out.print("Enter the position : ");
                    pos = sc.nextInt();
                    insert(data, pos);
                    break;
                }

                case 5:
                {
                    System.out.print("Enter position for deleting the value : ");
                    pos = sc.nextInt();
                    delete(pos);
                    break;
                }

                case 6:
                {
                    System.out.println("Exiting program");
                    sc.close();
                    System.exit(0);
                }

                default:
                    System.out.println("Invalid choice! Please try again ");
            }
        }
    }



    public static void display()
    {
        if(root==null)
        {
            System.out.print("List is empty");
            return;
        }
        else
        {
            Node temp=root;
            System.out.print("Linked List : ");
            while(temp.next != root)
            {
                System.out.print(temp.data +"->");
                temp=temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        }
    }



    public static int length() 
    {
        if(root == null)
        {
            return 0;
        }
        int count = 0;
        Node temp = root;
        do 
        {
            count++;
            temp = temp.next;
        } 
        while(temp != root);
        return count;
    }


    

    public static void append(int data) 
    {
        Node newNode = new Node(data);
        if(root == null)
        {
            root = newNode;
            newNode.next = root;
            return;
        }
        else
        {
            Node temp = root;
            while(temp.next != root)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = root;
        }
    }




    public static void insert(int data, int pos) 
    {
        Node newNode = new Node(data);
        Node temp = root;
        int len = length();

        if(pos == 1 && len == 0)
        {
            root = newNode;
            newNode.next = root;
        }
        else if(pos == 1 && pos <= len)
        {
            while(temp.next != root)
            {
                temp = temp.next;
            }
            newNode.next = root;
            temp.next = newNode;
            root = newNode;
        }
        else if(pos == len + 1)
        {
            while(temp.next != root)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = root;
        }
        else if(pos <= len && pos > 1)
        {
            int i = 1;
            while(i < pos - 1)
            {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        else
        {
            System.out.println("Invalid Position\n");
            System.out.println("The length of the position is\n" + len);
        }
    }



    public static void delete(int pos) 
    {
        int len = length();
        Node temp = root;

        if(pos > len || pos < 1 || root == null)
        {
            System.out.println("\nInvalid Location");
            System.out.println("\nCurrently the length of linked list is " + len);
        }
        else if(pos == 1)
        {
            if(root.next == root)
            {
                root = null;
            }
            else
            {
                while(temp.next != root)
                {
                    temp = temp.next;
                }
                root = root.next;
                temp.next = root;
            }
        }
        else
        {
            int i = 1;
            while(i < pos - 1)
            {
                temp = temp.next;
                i++;
            }
            Node hold = temp.next;
            temp.next = hold.next;
            hold.next = null;
        }
    }

}
