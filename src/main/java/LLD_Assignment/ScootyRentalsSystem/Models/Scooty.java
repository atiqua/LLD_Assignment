package LLD_Assignment.ScootyRentalsSystem.Models;


public class Scooty {
	String idScooty;
	String idOutlet;
	String availability;
	public String getIdScooty() {
		return idScooty;
	}
	public void setIdScooty(String idScooty) {
		this.idScooty = idScooty;
	}
	public String getIdOutlet() {
		return idOutlet;
	}
	public void setIdOutlet(String idOutlet) {
		this.idOutlet = idOutlet;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Scooty [idScooty=" + idScooty + ", idOutlet=" + idOutlet + ", availability=" + availability + "]";
	}
	public Scooty(String idScooty, String idOutlet, String availability) {
		super();
		this.idScooty = idScooty;
		this.idOutlet = idOutlet;
		this.availability = availability;
	}
	public Scooty() {
		super();
		
	}
	
	
	

}
