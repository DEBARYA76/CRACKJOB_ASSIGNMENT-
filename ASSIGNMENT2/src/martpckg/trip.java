package martpckg;
import java.io.*;
public class trip
{
	public static void main(String[] args)throws IOException
	
	{
	InputStreamReader read =new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader (read);
	
	/* double amount = 0.0,fin_amount ;
	
	System.out.println(" Enter the flight name");
	String fl_name = br.readLine();
	System.out.println("Enter the class");
	String clas = br.readLine();
	System.out.println("Enter the number of seats");
	int seat=Integer.parseInt(br.readLine());
	System.out.println("Card Payment");
	char c= (char)br.read();*/
	
	String flightCompany[]= {"Air India "," Spice Jet", "Go Air "," IndiGo"};
	int ticket[][] = {{3200,3450,3300,3490},{6950,7945,7250,7560},{10340,9500,9890,9990}};
	
	
	System.out.println("Enter the flight name");
	  String inputFlightCompany = br.readLine();
	  int i=0;
	  for(i=0;i<4;i++)
	  {
	   if(inputFlightCompany.equals(flightCompany[i]))
	    break;
	  }
	
	
	
	
	 String travelClass[] = {"Travel class","Economy class","Business class"};
	  System.out.println("Enter the class");
	  String inputTravelClass = br.readLine();
	  int j=0;
	  for(j=0;j<3;j++) {
	   if(inputTravelClass.equals(travelClass[j]))
	    break;
	  }
	  // System.out.println(ticket[j][i]);
	  System.out.println("Enter the number of seats");
	  int noOfSeats = Integer.parseInt(br.readLine());
	  int k=0;
	  if(noOfSeats>5)
	   k++;
	  if(noOfSeats>10 &&( i==1 || i==3))
	   k++;
	  System.out.println("Card payment");
	  String c1 = br.readLine();
	  int b=0;
	  if(c1.equals("Y")||c1.equals("y"))
	   b = 1;
	  if(c1.equals("N")||c1.equals("n"))
	   b = 0;
	  float cardPaymentDiscount[] = {10.5f,7.5f,9.5f,8.5f};
	  float finalAmount = ticket[j][i]*noOfSeats - ticket[j][i]*k*5/100 - ticket[j][i]*b*cardPaymentDiscount[i]/100;
	  System.out.printf("%.2f",finalAmount);
	
	/**if (fl_name.equalsIgnoreCase("Air India"))
	{
		
		if(clas.equalsIgnoreCase("Travel" ))
		{
			if(c=='y'||c=='Y')
			    amount=(3200* seat-(3200*seat*(10.5/100)));
			else if (c=='n'||c=='N')
				amount=(3200* seat);
			else
				System.out.println("");
     	System.out.println(amount);		
		}
		else if(clas.equalsIgnoreCase("Economy"))
		{
			if(c=='y'||c=='Y')
			     amount=(6950* seat-(6950*seat*(10.5/100)));
			else if (c=='n'||c=='N')
				 amount=(6950* seat);
			else
				System.out.println("");
			
		}
		else if(clas.equalsIgnoreCase("Business"))	
		{
			if(c=='y'||c=='Y')
	           amount=(10340* seat-(103400*seat*(10.5/100)));
			else if (c=='n'||c=='N')
				amount=(103400* seat);
			else
				System.out.println("");
		}
		
		
		
		else
		{System.exit(0);}	
		System.out.println(amount);
	}
	else if (fl_name.equalsIgnoreCase(" Spice Jet")) 
	{
		if(clas.equalsIgnoreCase("Travel" ))
		{
			if(c=='y'||c=='Y')
			      amount=(3450* seat-(3450*seat*(7.5/100)));
			else if (c=='n'||c=='N')
				 amount= (3450* seat);
			else
				System.out.println("");
		}
		else if(clas.equalsIgnoreCase("Economy"))
		{ 
			if(c=='y'||c=='Y')
			 amount=(7945 * seat-(7945 *seat*(7.5/100)));
			else if (c=='n'||c=='N')
				 amount=(7945 * seat);
			else
				System.out.println("");
		}
		else if(clas.equalsIgnoreCase("Business"))	
		{
			if(c=='y'||c=='Y')
			 amount=(9500* seat-(9500*seat*(7.5/100)));
		    else if (c=='n'||c=='N')
               amount=(9500* seat);
		    else
				System.out.println("");
		}
		else
		{System.exit(0);}	
		System.out.println(amount);
	}
	else if (fl_name.equalsIgnoreCase("Go Air"))
	{
		if(clas.equalsIgnoreCase("Travel" ))
		{    if(c=='y'||c=='Y')
			       amount=( 3300* seat-( 3300*seat*(9.5/100)));
			 else if (c=='n'||c=='N')
			       amount=( 3300* seat);
			 else
					System.out.println("");
		}
		else if(clas.equalsIgnoreCase("Economy"))
		{
			
			 if(c=='y'||c=='Y')
			     amount=( 7250* seat-( 7250*seat*(9.5/100)));
			 else if (c=='n'||c=='N')
				 amount=( 7250* seat);
			 else
					System.out.println("");
		}
		else if(clas.equalsIgnoreCase("Business"))	
		{    if(c=='y'||c=='Y')
			 amount=(9890* seat-(9890*seat*(9.5/100)));
		    else if (c=='n'||c=='N')
		    	amount=(9890* seat);
		    else
				System.out.println("");
		}
		else
		{System.exit(0);}
		System.out.println(amount);
	}
	
	else if (fl_name.equalsIgnoreCase(" IndiGo"))
	{
		if(clas.equalsIgnoreCase("Travel" ))
		{
			if(c=='y'||c=='Y')
			 amount=(3490* seat-(3490*seat*(8.5/100)));
			else if (c=='n'||c=='N')
				amount=(3490* seat);
			else
				System.out.println("");
			
		}
		else if(clas.equalsIgnoreCase("Economy"))
		{
			if(c=='y'||c=='Y')
			 amount=(7560* seat-(7560*seat*(8.5/100)));
			else if (c=='n'||c=='N')
			    amount=(7560* seat);
			else
				System.out.println("");
		}
		else if(clas.equalsIgnoreCase("Business"))	
		{    if(c=='y'||c=='Y')
			          amount=(9990* seat-(9990*seat*(8.5/100)));
		     else if (c=='n'||c=='N')
		
		    	 amount=(9990* seat);
		     else
					System.out.println("");
			
		}
		else
		{System.exit(0);}	
		System.out.println(amount);
		}
	
	else
		System.out.println("");
	
	
	
	
	
	if(seat>5)
	{
		fin_amount=amount-(amount*10/100);
	}
	if((seat>10) &&  ((fl_name.equalsIgnoreCase(" IndiGo")))||(fl_name.equalsIgnoreCase(" Spice Jet")))
	{
		fin_amount=amount-(amount*5/100);
	}
	else
	{
		fin_amount=amount;
	}
	System.out.println(fin_amount);
	System.out.printf("Rs.%.2f",fin_amount);**/
	}

}
