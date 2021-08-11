package arrpckg;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uniqueproducts {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{


		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println("Enter the number of items: "
				+ "");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if(n<5  || n>20)
		{
			System.out.println(n+"  is an invalid item count");
			
		}
		else
		{


			System.out.println(" Enter the bar code ID for "+n + " items:");
			int i,o=0,j,m,p=0;
			int arr1[] = new int[n];
			int arr2[] = new int[n];
			for(i=0;i<n;i++)
			{
				arr1[i]=Integer.parseInt(br.readLine());
				if ((arr1[i]<99) || (arr1[i]>1000))
				{
					System.out.println(arr1[i] +" is an invalid bar code ID");
					o++;
					break;
				}

			}

			for(i=0;i<n;i++)
			{
				String s= Integer.toString(arr1[i]); 
				int l=s.length();
				int flag=1;

				for(m=0;m<l-1;m++)

				{

					for(j=m+1;j<l;j++)
					{

						if(s.charAt(m)==s.charAt(j)) 
						{ 
							flag=0;
							break;
						}
					}

				} 
				if(flag !=0 )
				{

					arr2[p]=arr1[i];
					p++;


				}

			}
			if( o==0)
			{
				if(p>0 )
				{
					for(i=0;i<p;i++)
						System.out.println(arr2[i]);
					System.out.println("There are "+p+" items with Unique number in the bar code ID\r\n"
							+ "");

				}
				else
				{
					System.out.println("There are no items with unique number in");
					for(i=0;i<=n;i++)
					{System.out.print(arr1[i]+" , ");}
				}
			}	
		}
	}
}
