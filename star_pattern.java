import java.util.*;

class star_pattern
{
	public static void main(String s[])
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
				System.out.print(" ");
			for(j=1;j<2*i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}