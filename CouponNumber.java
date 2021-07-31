package logicalprograms;
import java.util.*;
public class CouponNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter 2 digit coupon number");
		int coupon_Number;
		Scanner s=new Scanner(System.in);
		coupon_Number=s.nextInt();
		s.close();
		System.out.println("Number of times that random is repeated to get equal with given number: "+couponNumber(coupon_Number));
	}
	static int couponNumber(int number)
	{
		int flag=0,count=0;
		for(int i=1;i>flag;i++)
		{
			Random r=new Random();
			int random=r.nextInt((99-10)+1)+10;
			//System.out.println(number);
			count++;
			if(number==random)
			{
				flag++;
			}
			flag++;
		}
		return count;
	}
}
