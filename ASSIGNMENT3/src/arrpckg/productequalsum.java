package arrpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class productequalsum 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		

		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println("Enter the array size"
				+ "");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if(n<1  || n>10)
		{
			System.out.println(n+"   is invalid array size");
			System.exit(0);
		}
		else
		{
			int arr1[] = new int[n];
			int arr2[] = new int[n];
	
		System.out.println(" Enter the elements of the first array");
		int i,n1,o=0;
		for(i=0;i<n;i++)
		{
			arr1[i]=Integer.parseInt(br.readLine());
			if (arr1[i]<10 && arr1[i]>=999)
					{
				      System.out.println(arr1[i] +"  is not a valid input");
				      o++;
				      break;
					}
		}
		System.out.println(" Enter the elements of the second array");
		for(i=0;i<n;i++)
		{
			arr1[i]=Integer.parseInt(br.readLine());
			if (arr2[i]<10 && arr1[i]>=999)
					{
				      System.out.println(arr2[i] +"  is not a valid input");
				      o++;
				      break;
					}
		}
		int arrp1[] = new int[n];
		int arrp2[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			arrp1[i]=arr1[i];
			arrp2[i]=arr2[i];
		}
	
        int m1,a,p = 1,s=o,flag=0;
		for(i=0;i<n;i++)
		 {  m1=arr1[i];
		    a=arr2[i];
			
			
			while(arr1[i]!=0)
			{
				int r =arr1[i]%10;
				 p=p*r;
				arr1[i]/=10;
			}
	
			while(arr2[i]!=0)
			{
				int r =arr2[i]%10;
				 s+=r;
				arr2[i]/=10;
			}
			
			if(p==s)
			{
				System.out.println(m1 +" , "+a);
				flag++;
			}
			
		}
		if(flag==0)
		{
			System.out.print("No pair found in ");
		for(i=0;i<n;i++)
			System.out.print(arrp1[i]+"   ");
		System.out.print(" and  ");
		for(i=0;i<n;i++)
			System.out.print(arrp2[i]+"   ");
		}
	}

   }
}
