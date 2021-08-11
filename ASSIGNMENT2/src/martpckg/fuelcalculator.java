package martpckg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fuelcalculator {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		InputStreamReader read =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader (read);
		System.out.println("Enter the no of liters to fill the tank:");
		double litr=Double.parseDouble(br.readLine());
		System.out.println("Enter the distance covered:\r\n"  );
		double dist=Double.parseDouble(br.readLine());
		double litkm,milegallon;
		if (litr<=0)
		{
			System.out.println(litr + "  is invalid input");
			
		}
		else if(dist<=0)
		{
			System.out.println(dist + "  is an invalid input");
			
		}
		    
		else
		{
			litkm=(litr/dist)*100;
			System.out.println("Liters/100KM");
			System.out.printf("%.2f", litkm);
			milegallon= (dist*0.6214)/ (litr*0.2642);
			System.out.println("\n");
			System.out.println("Miles/gallons");
			System.out.printf("%.2f", milegallon);
			
			
		}
		
		
		

	}

}
