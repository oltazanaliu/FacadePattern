import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FacadePatternClient {

	private static int  choice;
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		
		do{		
			System.out.print(" CAR SHOP \n");
			System.out.print(" 1.Mercedes \n");
			System.out.print(" 2.Porsche \n");
			System.out.print(" 3.Jeep \n");
			System.out.print(" 4.Exit \n");
			System.out.print("Make your choice: ");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
			
			choice=Integer.parseInt(br.readLine());
			
			Seller s=new Seller();
			
			switch (choice) {
			case 1:
				
				{ 
			
			      s.MercedesSale();
			    	 
			    }
				break;
				
	        case 2:
				
				{
			     
				  s.PorscheSale();		 
				      
			    }
				break;	
				
	        case 3:
				
	        	
	            {
				   
	            	
	             s.JeepSale();		
	            	    
	            }
				break;	
				

			default:
			{  
				System.out.println("You didn't choose");
				
			}		
				return;
			}
			
	  }while(choice!=4);
			
   }
		
		
		
		
}