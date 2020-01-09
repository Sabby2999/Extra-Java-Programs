import java.util.*;

class number_pattern
{
	public static void main(String s[])
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(n-j+1);
			}
			System.out.println();
		}
	}
}