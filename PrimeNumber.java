package logicalprograms;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		number=s.nextInt();
		s.close();
		
		if(primeNumber(number))
			System.out.println(+number+" is prime number");
		else
			System.out.println(+number+" is not prime number");	
		
	}
	static boolean primeNumber(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
