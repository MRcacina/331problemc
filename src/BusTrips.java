import java.util.ArrayList;

public class BusTrips {
	
	/*
	 * Global variables of BusTrips.
	 */
	
	private String departureLocation;
	private String arrivalLocation;
	private String departureTime;
	private String arrivalTime;
	private ArrayList<Passenger> passengerList;
	
	
	/*
	 * Adding BusTrips constructor.
	 */
	
	public BusTrips(String departureLocation,String arrivalLocation,String departureTime,
			String arrivalTime){
		
		this.departureLocation=departureLocation;
		this.arrivalLocation=arrivalLocation;
		this.departureTime=departureTime;
		this.arrivalTime=arrivalTime;
		
	}
	
	
	/*
	 * Getters and setters for the class.
	 */
	
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getArrrivalLocation() {
		return arrivalLocation;
	}
	public void setArrrivalLocation(String arrrivalLocation) {
		this.arrivalLocation = arrrivalLocation;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public ArrayList<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(ArrayList<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	
	
	
	

}
