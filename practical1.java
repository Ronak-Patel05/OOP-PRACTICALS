import java.util.Scanner;
public class practical1
{
	public static void main(String args[])
	{
		double meter,feet;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value in meters:");
		meter = s.nextDouble();
		feet=(meter*3.28084);
		System.out.println("Value in feet : "+feet);
		s.close();
	}
}



