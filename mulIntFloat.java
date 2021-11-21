package Assignment2ndWeek;

public class mulIntFloat {
static int mul(int a,int b)
{
	int c=a*b;
	return c;
}
static float mul(float a,float b)
{
	float c=a*b;
	return c;
}
static double mul(double a,double b)
{
	double c=a*b;
	return c;
}
static long mul(long a,long b)
{
	long c=a*b;
	return c;
}
public static void main(String cs[])
{
	int a=mul(20,40);
	float b=mul(1.992f,2.323f);
	double c=mul(12.5677,43.7656678);
	long d=mul(32454673l,54637826l);
	System.out.println(a+"  int");
	System.out.println(b+"  float");
	System.out.println(c+"  double");
	System.out.println(d+"  long");
}
}
