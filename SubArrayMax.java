import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
	    int k=S.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=S.nextInt();
		}
		int max=0;
		for(int i=0;i<=n-k;i++)
		{
		    max=arr[i];
		    for(int j=i;j<=k+i-1;j++)
		    {
		        if(arr[j]>max)
		        {
		            max=arr[j];
		        }
		    }
		    System.out.print(max+" ");
		}
	}
}