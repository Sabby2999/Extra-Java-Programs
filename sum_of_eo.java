import java.util.*;
class sum_of_eo
{
	public static void main(String s[])
	{
		int n,se=0,so=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			if(r%2==0)
				se+=r;	
			else
				so+=r;
			n/=10;
		}
		System.out.println("Sum of even : "+se+"\nSum of odd : "+ so);
	}
}