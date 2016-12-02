import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Train Program.");
		
		System.out.println("Please write start and press enter to continue.");
		
		Scanner s = new Scanner(System.in);
		
		String temp = s.next();
		
		while(true){
			
			System.out.println("Which operation would you like to do ?");
			
			System.out.println("Press 1 to add Bus Trip");
			
			System.out.println("Press 2 to Sell Ticket");
			
			System.out.println("Press 3 to edit Boarding Information");
			
			System.out.println("Press 4 to add Baggage Information");
			
			System.out.println("Press 5 to list all Bus Trips");
			
			System.out.println("Press 6 to list all Passengers in a Bus Trip");
			
			String first = s.next();
			
			if(first.equals("1")){
				
				System.out.println("\n" + "\n");
				
			}
			
			else if(first.equals("2")){
				
				System.out.println("\n" + "\n");
				
			}

			else if(first.equals("3")){
	
				System.out.println("\n" + "\n");
	
			}

			else if(first.equals("4")){
	
				System.out.println("\n" + "\n");
	
			}

			else if(first.equals("5")){
	
				System.out.println("\n" + "\n");
	
			}

			else if(first.equals("6")){
	
				System.out.println("\n" + "\n");
	
			}
			
			else{
				
				System.out.println("Wrong input ! Please try again." + "\n" + "\n" + "\n");
			}
			
			
			
			
		} // End of infinite while
		
		
		
		
		
		

	} // End of main method.
	
	
	

} // End of class.
