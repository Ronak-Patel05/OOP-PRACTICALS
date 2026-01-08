import java.util.Scanner;
public class practical4
{
	public static void main(String args[])
	{
		double w,h,bmi;
		Scanner weight=new Scanner(System.in);	
		Scanner height=new Scanner(System.in);
		System.out.println("Enter weight in pounds");
		w=weight.nextDouble();
		System.out.println("Enter height in inches");
		h=height.nextDouble();
		w*=0.45359237;
		h*=0.0254;
		bmi=(w/(h*h));
		System.out.println("BMI:"+bmi);
	}
}
