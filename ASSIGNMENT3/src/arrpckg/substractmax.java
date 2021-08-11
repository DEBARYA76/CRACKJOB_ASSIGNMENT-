package arrpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class substractmax {

	public static void main(String[] args) throws IOException

	
	{
		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println("ENTER THE ARRAY SIZE :");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if(n<3  || n>20)
		{
			System.out.println(n+"  is an invalid  size");
			System.exit(0);
		}
		else
		{
			int arr1[] = new int[n];
		
	
		System.out.println(" Enter array elements:\r\n"
				+ "");
		int i;
		for(i=0;i<n;i++)
		{
			arr1[i]=Integer.parseInt(br.readLine());
		}
		int max=0;
		for(i=0;i<n;i++)
		{
			if(max<arr1[i])
				max=arr1[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.println(max-arr1[i]);
		}
		}
		
		
		
		
		

	}

}
