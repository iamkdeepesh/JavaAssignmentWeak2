package Assignment2ndWeek;
import java.util.*;
public class factorial {
public static int fact(int a)
{
	int val=1;
	for(int i=a;i>0;i--)
	{
		val=val*i;
		
	}
	return val;
}
public static void main(String cs[])
{
	int a=1;
	Scanner sc=new Scanner(System.in);
	while(a==1)
	{
		System.out.println("Enter number to print factorial");
		int b=sc.nextInt();
		int c=fact(b);
		System.out.println(c);
		System.out.println("enter 1 to continue else press 0");
		a=sc.nextInt();
	}
	sc.close();
}
}
