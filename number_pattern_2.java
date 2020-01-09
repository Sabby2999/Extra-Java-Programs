import java.util.*;

class number_pattern_2
{
	public static void main(String s[])
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==1||j==i)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}