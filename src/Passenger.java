
public class Passenger {
	
	/*
	 * 
	 * Creating global variables for passenger.
	 * 
	 */
	
	private int tcNO;
	private String name;
	private String surname;
	private String mail;
	private String mobileTel;
	private int baggageID;
	private boolean isBoarded;
	
	/*
	 * 
	 * Creating methods for the global variables
	 * to get and set them.
	 * 
	 * Making those methods public to be able to edit them 
	 * from other classes.
	 * 
	 */
	
	
	public boolean isBoarded() {
		return isBoarded;
	}
	public void setBoarded(boolean isBoarded) {
		this.isBoarded = isBoarded;
	}
	public int getTcNO() {
		return tcNO;
	}
	public void setTcNO(int tcNO) {
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
	public int getBaggageID() {
		return baggageID;
	}
	public void setBaggageID(int baggageID) {
		this.baggageID = baggageID;
	}
	
	
	

}
