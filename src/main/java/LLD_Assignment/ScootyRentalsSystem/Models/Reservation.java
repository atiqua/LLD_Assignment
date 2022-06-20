package LLD_Assignment.ScootyRentalsSystem.Models;


public class Reservation {
	String idReserve;
	String Userid;
	String Scootyid;
	public Reservation(String idReserve, String userid, String scootyid) {
		super();
		this.idReserve = idReserve;
		Userid = userid;
		Scootyid = scootyid;
	}
	public Reservation() {
		super();
	
	}
	public String getIdReserve() {
		return idReserve;
	}
	public void setIdReserve(String idReserve) {
		this.idReserve = idReserve;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getScootyid() {
		return Scootyid;
	}
	public void setScootyid(String scootyid) {
		Scootyid = scootyid;
	}
	

}
