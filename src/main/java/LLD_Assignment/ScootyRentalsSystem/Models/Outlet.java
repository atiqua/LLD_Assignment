package LLD_Assignment.ScootyRentalsSystem.Models;

public class Outlet {
	String idOutlet;
	Double distance;
	public String getId() {
		return idOutlet;
	}
	public void setId(String id) {
		this.idOutlet = id;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public Outlet(String id, Double distance) {
		super();
		this.idOutlet = id;
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Outlet [id=" + idOutlet + ", distance=" + distance + "]";
	}
	public Outlet() {
		super();
		
	}
	
	

}
