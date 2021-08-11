package arrpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraysumeven {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		
		
		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println("ENTER THE ARRAY SIZE :");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if(n<1 || n>10)
		{
			System.out.println(n+"  is an invalid array size");
			System.exit(0);
		}
		else
		{
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int sum[]= new int[n];
		System.out.println(" Enter the elements in first array");
		int i;
		for(i=0;i<n;i++)
		{
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(" Enter the elements in second array");
		
		for(i=0;i<n;i++)
		{
			arr2[i]=Integer.parseInt(br.readLine());
		}
		int ctrl =0;
		for(i=0;i<n;i++)
		{
			if((arr1[i]%2==0)   && (arr2[i]%2==0))
			{
				sum[i]=arr1[i] + arr2[i];
				ctrl=1;
			}
			else
				sum[i]=0;
				
		}if(ctrl==1)
		{
			for(i=0;i<n;i++)
			{
				System.out.println(sum[i]);
			}
		}
		else
			System.out.println("There are no even elements in the arrays");
		
		}

		
		
	}

}
