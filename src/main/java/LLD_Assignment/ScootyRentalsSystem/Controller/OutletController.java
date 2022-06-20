package LLD_Assignment.ScootyRentalsSystem.Controller;
import org.springframework.web.bind.annotation.RestController;

import LLD_Assignment.ScootyRentalsSystem.Models.Scooty;
import LLD_Assignment.ScootyRentalsSystem.Service.IOutletService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class OutletController {
	@Autowired
	private IOutletService outletService;
	
	//To fetch all the Scooties in the outlet
	@GetMapping("/allScooties/{idOutlet}")
	public List<Scooty> getAllScooties(@PathVariable String idOutlet)
	{
		return this.outletService.getAllScooties(Long.parseLong(idOutlet));
	}


}
