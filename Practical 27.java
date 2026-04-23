interface Classify {
	String getDivision(double average);
}

class Result implements Classify 
{
	public String getDivision(double average)
	{
		if(average >= 60)
		{
			return "First Division";
		}
		else
		{
		return "Second Division";
		}
	}
}
public class Practical27
{
	public static void main(String []args)
	{
		Result r = new Result();
		
		double average = 72.5;
		String division = r.getDivision(average);
		System.out.println("Average Marks: " + average);
		System.out.println("Division : " + division);
	}
}

