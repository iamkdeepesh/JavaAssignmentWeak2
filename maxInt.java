package Assignment2ndWeek;

public class maxInt {
 static int max(int a,int b,int c)
 {
	 int d=(a>b)?((a>c)?a:c):((b>c)?b:c);
	 return d;
 }
 static int max(int a,int b)
 {
	 int c=(a>b)?a:b;
	 return c;
 }
 public static void main()
 {
	 int a=max(20,30,40);
	 int b=max(40,21);
	 System.out.println(a+"  max of three");
	 System.out.println(b+"  max of two");
 }
}
