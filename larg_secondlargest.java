import java.util.*;
public class Main
{
    public static void find(int arr[],int n)
    {
        int max1=0;
        int max2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max1=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max2)
            {
                if(arr[i]<max1)
                {
                    max2=arr[i];
                }
            }
        }
        System.out.println("Largest="+max1);
        System.out.println("Second Largest="+max2);
    }
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=S.nextInt();
        }
        find(arr,n);
	}
}

