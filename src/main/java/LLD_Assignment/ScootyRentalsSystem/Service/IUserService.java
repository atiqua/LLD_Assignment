package LLD_Assignment.ScootyRentalsSystem.Service;

import java.util.List;

import LLD_Assignment.ScootyRentalsSystem.Models.Outlet;
import LLD_Assignment.ScootyRentalsSystem.Models.User;

public interface IUserService {
	public List<Outlet> getNearByOutlets();
	public User addUser(User user);

}
