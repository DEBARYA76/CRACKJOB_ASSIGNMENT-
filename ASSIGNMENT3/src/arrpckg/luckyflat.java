package arrpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class luckyflat
{

	public static void main(String[] args) throws  IOException
	{
		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println("Enter the number of flats available:");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if(n<5  || n>15)
		{
			System.out.println(n+"   is an invalid availability");
			
		}
		else
		{
			int arr1[] = new int[n];
		
	
		System.out.println(" Enter the flat numbers:");
		int i,n1,o=0,m=0;
		for(i=0;i<n;i++)
		{
			n1=Integer.parseInt(br.readLine());
			if (n1<100 && n1>=1000)
					{
				      System.out.println(n1 +"  is an invalid flat number");
				      o++;
				      break;
					}
			else if(n1/100 == 8)	
			       
				    {
				      System.out.println(n1 +"   will not be considered");
				      m++;
				      break;
					}
				
		   else
				    	
				    {
				    	arr1[i]=n1;
				 	}
		}	
		
		if( (o==0)&& (m==0))
		{
			int c=0;    	
			for(i=0;i<n;i++)
			{
			int sum =0;
				 sum= sum(arr1[i]);
				if(sum>9)
					 sum= sum(sum);
				else  if(sum == 5 )
				{
					System.out.println(arr1[i]);
					c++;
				}
				else
					System.out.println();
				
			}	
			   if((c == 0))
			   {
				System.out.println("There is no lucky flat in");
				for(i=0;i<n;i++)
				{
					System.out.print(arr1[i]  + " , ");
				}
			   }
		}			}
	}	
	
	
	
	
	public static  int sum(int n)
			{
				
				int i, r,sum=0 ;
				while(n>0)
				{
				r=n%10;
				sum+=r;
				n/=10;
				}
				
				return (sum);
			}
		

	} 


