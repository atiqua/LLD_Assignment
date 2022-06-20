package LLD_Assignment.ScootyRentalsSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import LLD_Assignment.ScootyRentalsSystem.Models.Scooty;
@Service
public class OutletService implements IOutletService {

//Below list is a part of Database and Repository Layer. As I am not using any
//DB here that is why using this temporary list to store Scooty's information 
List<Scooty> list;

public OutletService() {
	list=new ArrayList<>();
	list.add(new Scooty("1","Yes","2"));
	list.add(new Scooty("2","No","1"));
}
	
@Override
public List<Scooty> getAllScooties(long idOutlet) {
	List<Scooty> scootyList;
	scootyList=new ArrayList<>();
	
	for(Scooty temp : list )
	{
		if(Long.parseLong(temp.getIdOutlet())==idOutlet) {
			scootyList.add(temp);
	}
	}
	return scootyList;
	}

}


