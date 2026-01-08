import java.util.Scanner;
public class practical2
{
	public static void main (String args[] )
	{
		double a,b,c,d,e,f,x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Two Equations are: a*x+b*y=e and c*x+d*y=f\nWhere  a,b,c,d,e,f are conctant x,y are variables\n Now enter the values of content to Solve Equation");
		System.out.println("Enter value of a:");
		a=s.nextDouble();
		System.out.print("Enter value of b:");
		b=s.nextDouble();
		System.out.print("Enter value of c:");
		c=s.nextDouble();
		System.out.print("Enter value of d:");
		d=s.nextDouble();
		System.out.print("Enter value of e:");
		e=s.nextDouble();
		System.out.print("Enter value of f:");
		f=s.nextDouble();
		x=(e*d-b*f)/(a*d-b*c);
		y=(a*f-e*c)/(a*d-b*c);
		System.out.println("Value of x and y is: "+x+" " +y);
	}
}
