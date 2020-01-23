import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t!=0)
		{
		    System.out.println("Enter the string");
		String str=S.next();
		String arr[]=str.split("\\.");
		for(int i=arr.length-1;i>0;i--)
		{
		    System.out.print(arr[i]+".");
		}
		System.out.println(arr[0]);
		t--;
		}
	}
}