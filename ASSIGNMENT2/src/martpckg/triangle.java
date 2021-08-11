package martpckg;
import java.util.*;
public class triangle
{

	public static void main(String[] args) 
	{
		               Scanner sc = new Scanner(System.in);
		               System.out.println("Enter three sides of triangle");
		               int Arr[];    //declaring array
		               Arr = new int[10]; 
		               int i,ctrl=0;
		               for (i=1;i<=3;i++)
		               {
		            	   Arr[i]= sc.nextInt();
		            	   if (Arr[i]<=0)
		            	   {System.out.println(Arr[i]+"  is invalid side");
		            	     ctrl++;
		            	     break;
		            	   
		            	   }
		               }
		               
		               if(ctrl==0) {
		                    System.out.print(Arr[1]+" ,"+Arr[2]+" ,"+Arr[3]);
		                    if(Arr[1]==Arr[2] &&  Arr[2]==Arr[3])
		                    System.out.println(" are the sides of Equilateral Triangle");
		                    else if(Arr[1]==Arr[2]||Arr[2]==Arr[3]||Arr[3]==Arr[1])
		                    System.out.println(" are the sides of Isosceles Triangle");
		                    else
		                    System.out.println(" are the sides of Scelene Triangle");
		        }                                        
		 }
		}

	