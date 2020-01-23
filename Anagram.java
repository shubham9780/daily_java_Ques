import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		String a=S.next();
		String b=S.next();
		int flag=0;
		if(a.length()!=b.length())
		{
		    System.out.println("Not a Anagram");
		}
		for(int i=0;i<a.length();i++)
		{
		    for(int j=0;j<b.length();j++)
		    {
		        if(a.charAt(i)==b.charAt(j))
		        {
		            flag++;
		            break;
		        }
		    }
		}
		if(flag==a.length())
		{
		    System.out.println("Anagram");
		}
		else
		{
		    System.out.println("Not a Anagram");
		}
	}
}