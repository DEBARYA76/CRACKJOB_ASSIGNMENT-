package martpckg;

import java.util.Scanner;

public class billcalculation
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		int call=sc.nextInt();
		if(call<=0)
			System.out.println( call +"    is an invalid input ");
		else if(call>1000) {
			System.out.println(call +"   exceeds the maximum limit ");}
		
		else
		{
			System.out.println("Enter the number of SMS:");
			int sms=sc.nextInt();
			if(sms<=0)
			{System.out.println( sms +"    is an invalid input ");
				}
			else if(sms>1000)
				System.out.println(sms +"  exceeds the maximum limit ");
			else
			{
			  double amount=150+((call-100)*1.5 +	(sms-100)*0.5);
			 System.out.println("Amount to be paid is Rs.");
			 System.out.printf("Rs.%.2f",((amount*105.5)/100));
			}
		}
	}

}
