import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the no. of test cases");
		int T=S.nextInt();
		int temp=0;
		int rem=0;
		int flag,k;
		for(int j=0;j<T;j++)
		{
		    int n=S.nextInt();
		    for(int i=0;i<=n;i++)
		    {
		        k=i;
		        flag=1;
		            temp=k%10-1;
		            while(k!=0)
		            {
		                rem=k%10;
		                if((rem-temp)==1 || (rem-temp)==-1)
		                {
		                    flag=1;
		                }
		                else
		                {
		                    flag=0;
		                    break;
		                }
		                          temp=rem;
		                k=k/10;
		             }
		             if(flag!=0)
		             {
		                 System.out.println(i+" ");
		             }
		    }
		}
	}
}
