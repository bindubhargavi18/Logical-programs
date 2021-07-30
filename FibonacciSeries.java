package logicalprograms;
import java.util.*;
public class FibonacciSeries 
{
	static int firstNumber=0,secondNumber=1;
	public static void main(String[] args) 
	{
		int totalSeries;
		System.out.println("Enter number upto series to be printed:");
		Scanner s=new Scanner(System.in);
		totalSeries=s.nextInt();
		s.close();
		System.out.println(("Fibonacci series:"));
		System.out.print(firstNumber+" "+secondNumber+" ");
		fibonacciSeries(totalSeries);
		
	}
	static void fibonacciSeries(int series)
	{
		int nextNumber;
		for(int i=2;i<series;i++)
		{			
			nextNumber=firstNumber+secondNumber;
			System.out.print(nextNumber+" ");
			firstNumber=secondNumber;
			secondNumber=nextNumber;
		}		
	}
	

}
