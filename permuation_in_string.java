import java.util.*;
public class Main
{
  public static  int  count=0;
    public static void permute(String str,int i,int n)
    {
        char temp;
        if(i==n)
        {
            count++;
            System.out.print(str+" ");
        }
        else
        {
            for(int j=i;j<n;j++)
            {
                char[] c = str.toCharArray();
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                str=String.valueOf(c);
                permute(str,i+1,n);
                char[] a = str.toCharArray();
                temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                str=String.valueOf(a);
            }
        }
    }
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		for(int i=0;i<t;i++)
		{
		    String str=S.next();
		    permute(str,0,str.length());
		      System.out.println();
        System.out.print("Number of permutations= "+count);
		}
	}
}
