import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=S.nextInt();
	Stack<Integer> s=new Stack<Integer>();
	for(int i=0;i<size;i++)
	{
	    s.push(S.nextInt());
	}
	int min=s.peek();
	int a=0,n=1;
	while(!s.isEmpty())
	{
	   a=s.pop();
	   if(a<min)
	   {
	       min=a;
	   }
	}
	System.out.println("Minimun="+min);
	}
}