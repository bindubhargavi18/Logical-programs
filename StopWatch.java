package logicalprograms;
import java.util.*;
public class StopWatch 
{
	static double startTime,endTime;
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Start time:");
		startTime=s.nextDouble();
		System.out.println("Enter End time:");
		endTime=s.nextDouble();
		s.close();
		System.out.printf("ElapsedTime: %.2f",stopWatch());
	}
	static double stopWatch()
	{
		if(startTime>endTime)
			return 0;
		else
			return endTime-startTime;
	}

}
