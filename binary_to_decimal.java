import java.util.*;
class binary_to_decimal
{
	public static void main(String s[])
	{
		int b,d=0,k,r,pow=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the binary number : ");
		b=sc.nextInt();
		k=b;
		while(k!=0)
		{
			r=k%10;
			d=d+r*pow;
			pow*=2;
			k/=10;
		}
		System.out.print("("+b+")#10 = ("+d+")#2");
	}
} 