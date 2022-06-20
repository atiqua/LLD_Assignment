package LLD_Assignment.ScootyRentalsSystem.Controller;
import org.springframework.web.bind.annotation.RestController;
import LLD_Assignment.ScootyRentalsSystem.Models.Outlet;
import LLD_Assignment.ScootyRentalsSystem.Models.User;
import LLD_Assignment.ScootyRentalsSystem.Service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController

public class UserController {
	@Autowired
	private IUserService userService;
	
	
	//To add any new User
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
		
	}
	
	//To fetch all the near by Outlets
	@GetMapping("/nearByOutlets")
	public List<Outlet> getNearByOutlets()
	{
		return userService.getNearByOutlets();
	}
}
