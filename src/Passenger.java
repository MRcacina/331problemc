
public class Passenger {
	
	/*
	 * 
	 * Creating global variables for passenger.
	 * 
	 */
	
	private String tcNO;
	private String name;
	private String surname;
	private String mail;
	private String mobileTel;
	private String baggageID;
	private String isBoarded;
	
	/*
	 * Created constructor for Passenger.
	 */
	
	public Passenger(String tcNO,String name,String surname,
			String mail,String mobileTel){
		
		this.tcNO=name;
		this.name=name;
		this.surname=surname;
		this.mail=mail;
		this.mobileTel=mobileTel;
		this.isBoarded="No";
		
		
	}
	
	/*
	 * 
	 * Creating methods for the global variables
	 * to get and set them.
	 * 
	 * Making those methods public to be able to edit them 
	 * from other classes.
	 * 
	 */
	
	
	public String isBoarded() {
		return isBoarded;
	}
	public void setBoarded(String isBoarded) {
		this.isBoarded = isBoarded;
	}
	public String getTcNO() {
		return tcNO;
	}
	public void setTcNO(String tcNO) {
		this.tcNO = tcNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMobileTel() {
		return mobileTel;
	}
	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}
	public String getBaggageID() {
		return baggageID;
	}
	public void setBaggageID(String baggageID) {
		this.baggageID = baggageID;
	}
	
	
	

}
