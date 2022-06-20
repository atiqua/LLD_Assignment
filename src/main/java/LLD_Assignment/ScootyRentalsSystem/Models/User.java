package LLD_Assignment.ScootyRentalsSystem.Models;

public class User {
	String idUser;
	String name;
	public User(String id, String name) {
		super();
		this.idUser = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + idUser + ", name=" + name + "]";
	}
	public String getId() {
		return idUser;
	}
	public void setId(String id) {
		this.idUser = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		super();
		
	}
}
