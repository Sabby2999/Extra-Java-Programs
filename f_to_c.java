import java.util.*;
class f_to_c
{
	public static void main(String s[])
	{
		int a,b,c,i,j;
		float k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Fahrenheit to Celsius\nFrom :  ");
		a=sc.nextInt(); 
		System.out.println("To : ");
		b=sc.nextInt();
		System.out.println("Difference : ");
		c=sc.nextInt();
		System.out.println("\tF\t|\tC");
		for(i=a;i<=b;i+=c)
		{
			k=5*(i-32);
			k/=9;
			System.out.println("\t"+i+"\t|\t"+k);	
		}
	}
}