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
     void palindrome(Node head,int n)
    {
       Node slow = head;
       int c=0;
        Stack<Integer> stack = new Stack<Integer>(); 
  
        while (slow != null) { 
            stack.push(slow.data); 
            slow = slow.next; 
        } 
  
        while (head != null) { 
  
            int i = stack.pop(); 
            if (head.data == i) { 
                c++;
            } 
            else { 
                c=0;
                break; 
            } 
            head = head.next; 
        } 
        System.out.println(c);
        System.out.println(n);
        if(c==n)
        {
            System.out.println("Linked List is palindrome");
        }
        else
        {
            System.out.println("Linked List is not palindrome");
        }
    }
    public static void main(String[] args) {
        Main a= new Main();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int si=size;
		while(size--!=0)
		{
		   a.insert(s.nextInt());
		}
		a.palindrome(head,si);
	}
}