package martpckg;

import java.util.Scanner;
import java.util.*;

public class freequencyofdigit {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER : ");
		long n=sc.nextLong();
		if (n<=0) {
			System.out.println(n+"  falls behind the limit");}
		else if (n> 999999999)
		{
			System.out.println(n+"  exceeds the limit");
		}
		else {
			System.out.println("Enter the number who freequecy needs to be shown:");
			int p=sc.nextInt();
			if(p<0 || p>9) {
				System.out.println(p+"  is not valid");}
			else
			{
				int count = 0; 
				long num=n;
				  
			    
			    while (n > 0)  
			    { 
			  
			        
			    	count = (n % 10 == p) ?  count + 1 : count; 
			        n = n / 10; 
			    } 
			  
			    if(count ==0)
			    	System.out.println(p +"  is not available in  " +num);
			    else
			    	System.out.println("Count of "+p+"   in   "+num +" is "+count);
			}
		}
	}

}
