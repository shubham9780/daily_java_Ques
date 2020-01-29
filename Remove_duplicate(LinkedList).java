import java.util.*;
public class Main
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static Node head;
    void insert(int data)
    {
       Node n=new Node(data);
       if(head==null)
       {
           head=n;
           return;
       }
       Node ptr=head;
       while(ptr.next!=null)
       {
           ptr=ptr.next;
       }
       ptr.next=n;
       return;
    }
    void print(Node head)
    {
        Node ptr=head;
    while(ptr!=null)
		{
		    System.out.print(ptr.data+" ");
		    ptr=ptr.next;
		}
    }
    Node removedup(Node head)
    {
        Node ptr=head;
        while(ptr!=null)
        {
            Node curr=ptr;
            while(curr.next!=null)
            {
            if(ptr.data==curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
            }
            ptr=ptr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Main a= new Main();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		while(size--!=0)
		{
		   a.insert(s.nextInt());
		}
		head=a.removedup(head);
		System.out.println("after removing");
		a.print(head);
	}
}