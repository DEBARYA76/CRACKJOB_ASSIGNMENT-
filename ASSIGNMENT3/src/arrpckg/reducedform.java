package arrpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reducedform 
{
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		

		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.print("Enter the size of Array:  "
				+ "");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if(n<5  || n>10)
		{
			System.out.println(n+"   is an invalid array size");
			System.exit(0);
		}
		else
		{
			int arr[] = new int[n];
			int rank[] = new int[n];
	   int i,j;
		System.out.println(" Enter the array :");
		for(i=0;i<n;i++)
		
			arr[i]=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[i]>arr[j])
		               rank[i]++;
			}
		}
		for(i=0;i<n;i++)
		System.out.print( rank[i] +" ");
		}
	}
}
