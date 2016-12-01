import java.util.ArrayList;
import java.util.Scanner;

public class Operator {
	
	/*
	 * Writing method to set
	 * isBoarded information
	 * Taking arrayList of the 
	 * bus trip as input to determine 
	 * which bus trip we will edit
	 */
	
	public void setBoardedInformation(ArrayList<Passenger> a){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the TC NO of the passenger you would like to edit");
		
		String tc = s.next();
		
		for(Passenger p : a){
			
			if(tc.equals(p.getTcNO())){
				
				System.out.println("Passenger found !");
				
				System.out.println("Please enter 'Yes' or 'No' according to if passenger boarded or not.");
				
				String board = s.next();
				
				p.setBoarded(board);
				
				System.out.println("Passengers boarded information has been set.");
				
			}else{
				System.out.println("Passenger not found !");
			}
			
		}
		
		
		
		
		
	}
	
	
}