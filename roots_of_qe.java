import java.util.*;
class roots_of_qe
{
	public static void main(String s[])
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("\na(x^2)+bx+c=0\na=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		System.out.print("c=");
		c=sc.nextInt();
		d=b*b-4*a*c;
		if(d>0)
			System.out.println("1");	
		else if(d==0)
			System.out.println("0");
		else 
			System.out.println("-1");
	}
}