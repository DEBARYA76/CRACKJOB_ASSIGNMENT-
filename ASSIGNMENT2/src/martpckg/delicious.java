package martpckg;
import java.util.*;
public class delicious
{
	public static void main(String[] args) 
	{
		
		
			      int a, b, max, p, lcm = 0;
			      Scanner sc = new Scanner(System.in);
			      System.out.println("Enter the day interval of Sam:");
			      a = sc.nextInt();
			      System.out.println("Enter the day interval of Riya:");
			      b = sc.nextInt();
			      
			      if(a<=0 || b<=0)
			      {
			    	  System.out.println(a+"to"+b+"    is not a valid interval");
			      }
			      
			      else 
			      {
			      if(a > b)
			      {
			         max = p = a;
			      }
			      else
			      {
			         max = p = b;
			      }

			      while(a!= 0)
			      {
			         if(max % a == 0 && max % b == 0) {
			            lcm = max;
			            break;
			         }
			         max += p;
			      }
			      System.out.println("Sam and Riya will have their dinner on day   "+lcm);
			   }
		 }
	}

