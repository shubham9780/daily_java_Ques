import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	int n=S.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=S.nextInt();
	}
	int flag=0;
	for(int i=0;i<=n-2;i++)
	{
	    flag=0;
	    for(int j=i+1;j<n;j++)
	    {
	        if(arr[i]>=arr[j])
	        {
	            flag=1;
	        }
	        else{
	            flag=0;
	            break;
	        }
	    }
	    if(flag==1)
	    {
	        System.out.println(arr[i]);
	    }
	}
	System.out.println(arr[n-1]);
	}
}