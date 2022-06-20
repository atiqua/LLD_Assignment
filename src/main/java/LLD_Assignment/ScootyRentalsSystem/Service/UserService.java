package LLD_Assignment.ScootyRentalsSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import LLD_Assignment.ScootyRentalsSystem.Models.Outlet;
import LLD_Assignment.ScootyRentalsSystem.Models.User;

@Service
public class UserService implements IUserService {
	//Below list is a part of Database and Repository Layer. As I am not using any
	//DB here that is why using this temporary list to store Outlet's and User's information 
	
	List<Outlet> outletList;
	List<User> userList;
	
	public UserService() {
		outletList=new ArrayList<>();
		outletList.add(new Outlet("1",100.00));
		outletList.add(new Outlet("2",800.30));	
		
		userList=new ArrayList<>();
		userList.add(new User("1","Atiqua"));
		userList.add(new User("2","Atiya"));	
		
	}
	

	@Override
	public List<Outlet> getNearByOutlets() {
		
		return outletList;
	}

	@Override
	public User addUser(User user) {
		userList.add(user);
		return user;
	}

}
