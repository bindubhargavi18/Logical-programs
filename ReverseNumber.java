package logicalprograms;
import java.util.*;
public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter number:");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		s.close();
		System.out.println("Reverse: "+reverseNumber(number));
	}
	static int reverseNumber(int num)
	{
		int remainder,reverse=0;
		while(num>0)
		{
			remainder=num%10;
			reverse=(reverse*10)+remainder;
			num/=10;
		}
		return reverse;
	}
}
