package logicalprograms;
import java.util.*;
public class PerfectNumber 
{
	
	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		s.close();
		if(perfectNumber(number)==number)
			System.out.println(+number+" is perfect number");
		else
			System.out.println(+number+" not perfect number");
	}
	static int perfectNumber(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if (n%i==0)
				sum+=i;
		}
		return sum;
	}

}
