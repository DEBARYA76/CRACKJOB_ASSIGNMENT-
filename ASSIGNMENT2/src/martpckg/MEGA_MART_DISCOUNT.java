package martpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MEGA_MART_DISCOUNT {

	public static void main(String[] args)throws IOException 
	{
		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		
		System.out.println("WELCOME TO MEGA MART  !!!!!!");
		System.out.println("ENTER CUSTOMER ID");
		int customid =Integer.parseInt(br.readLine());
		System.out.println("ENTER THE BILL AMOUNT");
		double amount=Double.parseDouble(br.readLine());
		double total =0.0;
		if (customid<=0)
		{
			System.out.println(customid + "is not valid customer id");
			
		}
		else if(amount<=0)
		{
			System.out.println(amount + "is not valid bill amount");
			
		}
		    
		else
		{
			if(amount<1000)
			{
				System.out.println("Total Price is  ");
				System.out.printf("%.2f", amount);
			}	
			else
			{
				if(customid >=1 && customid <=100)
					total=(amount*85)/100;
				
				else if(customid>100 && customid <=250)
					total=(amount*82)/100;
				
				else if(customid>250 && customid <=500)
					total=(amount*77)/100;
				
				else if(customid>500 && customid <=1000)
					total=(amount*72)/100;
				else
					total=(amount*68)/100;
			}
			System.out.println("Total price is   ");
			System.out.printf("%.2f", total);
		}
		
		
	}

}
