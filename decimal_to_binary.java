import java.util.*;
class decimal_to_binary
{
	public static void main(String s[])
	{
		int b=1,d,k,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the decimal number : ");
		d=sc.nextInt();
		k=d;
		while(k!=0)
		{
			r=k%2;
			b=b*10+r;
			k/=2;
		} 
		k=b;
		b=0;
		while(k!=1)
		{
			r=k%10;
			b=b*10+r;
			k/=10;
		}
		System.out.print("("+d+")#2 = ("+b+")#10");
	}
} 