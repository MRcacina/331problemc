import java.util.Scanner;

public class TicketSeller {
	
	/*
	 * Method to create passenger.
	 */
	
	public Passenger sellTicket(){
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the passengers TC No.");
		
		String tcNO = scanner.next();
		
		System.out.println("Please enter the passengers name.");
		
		String name = scanner.next();

		System.out.println("Please enter the passengers surname.");
		
		String surname = scanner.next();
		
		System.out.println("Please enter the passengers mail.");
		
		String mail = scanner.next();

		System.out.println("Please enter the passengers mobile tel.");
		
		String mobileTel = scanner.next();
		
		Passenger pass = new Passenger(tcNO,name,surname,mail,mobileTel);
		
		return pass;

		
	}
	
	

}
