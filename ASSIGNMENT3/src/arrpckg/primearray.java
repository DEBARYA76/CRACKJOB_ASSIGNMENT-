package arrpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primearray 
{
	public static void main(String[] args) throws  IOException
	{
		
		
		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println(" ARRAY SIZE :");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		
		if(n<1 )
		{
			System.out.println(n+"  is an invalid array size");
		}
		else
		{
			int arr1[] = new int[n];
			int mul=1;
		
			System.out.println(" Enter the elements in  array");
			int i;
			for(i=0;i<n;i++)
			{
				arr1[i]=Integer.parseInt(br.readLine());
			}
			
			int p=0;int m=0;
			for(i=0;i<n;i++)
			 {
				if(arr1[i]<=0)
				{
					System.out.println(arr1[i] +"   is an invalid array element");
					m++;
					break;
				}
				else
				{
					int ret = prime(arr1[i]);
					if(ret == 0 )
					{
						mul*=arr1[i];
						p++;
					}
					else
						continue;
					
				
					
				}

			 }
			 if(p == 0 && m  ==  0)
				{
					System.out.print("No element found in ");	
					for(i=0;i<n;i++) 
					{
						System.out.print(arr1[i]);
						System.out.print(" ,");
					}
					}
		    if(p>=1  && m==0)
					{
						System.out.println(mul);}
				    }
	      
		
		      
				
			
		}
	public static  int prime(int n)
	{
		
	int i,  ctrl = 0;
	for(i=2;i<=n/2;i++)
	{
		
		if(n%i== 0)
		{
			ctrl++;break;}	
		
	}
	return (ctrl);
	}

}

