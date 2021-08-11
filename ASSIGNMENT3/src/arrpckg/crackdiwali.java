package arrpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crackdiwali {

	public static void main(String[] args) throws NumberFormatException, IOException {
	

		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println("Enter a number from the slot\r\n"
				+ "");
		int n=Integer.parseInt(br.readLine());
		System.out.println();
		if(n<5  || n>15)
		{
			System.out.println(n+"  is not a valid slot number");
			System.exit(0);
		}
		else
		{
			String arr1[] = new String[n];
		System.out.println(" Enter the " + n+ " customer names"
				+ "");
		int i;
		for(i=0;i<n;i++)
		     arr1[i]=br.readLine();
		
		
		char p;int ctrl=0;
		System.out.println("Enter the alphabet from the slot\r\n"
				+ "");
        p=(char)br.read();
       
		System.out.println("Customers List");
		int j;
		
		for(i=0;i<n;i++)
		{
			 String str;
			 str=arr1[i];char a;
			for(j=0;j<str.length();j++)
			{
			   a=str.charAt(j);
		      if(a == p)
		      {  System.out.println(arr1[i]);
		    	 ctrl++;
		    	 break; 
		      }
			}
		}
		if( ctrl == 0)
			System.out.println("Letter   " +p+"  is not present in any of the customer's name");
			
		
		
		}	
		
	
	
	}

}
