package martpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parking {

	public static void main(String[] args)throws IOException
	{

		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		
		System.out.println("B1\r\n" + 
				"\r\n" + 
				"50\r\n" + 
				"\r\n" + 
				"B2\r\n" + 
				"\r\n" + 
				"50\r\n" + 
				"\r\n" + 
				"B3\r\n" + 
				"\r\n" + 
				"40\r\n" + 
				"\r\n" + 
				"B4\r\n" + 
				"\r\n" + 
				"40");
		System.out.println("CAR COUNT:");
		int count = Integer.parseInt(br.readLine());
		if(count <=0)
			System.out.println(count +"  is not a valid input");
		
		else if(count>0 && count<=50)
			System.out.println("The car can be parked at B1"); 
		else if (count>50 && count<=100)
			System.out.println("The car can be parked at B2");
		else if (count>100 && count<=140)
			System.out.println("The car can be parked at B3");
		else if (count>140 && count<=180)
			System.out.println("The car can be parked at B4");
		else
			System.out.println("Parking slots in full");

	}

}
