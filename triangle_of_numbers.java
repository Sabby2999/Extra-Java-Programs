import java.util.*;

class triangle_of_numbers
{
	public static void main(String s[])
	{
		int n,i,j,k,l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			l=i;
			for(j=n;j>i;j--)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(l++);
			l--;
			for(j=1;j<i;j++)
				System.out.print(--l);
			System.out.println();
		}
	}
}