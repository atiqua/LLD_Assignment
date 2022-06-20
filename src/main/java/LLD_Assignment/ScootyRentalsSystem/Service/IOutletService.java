package LLD_Assignment.ScootyRentalsSystem.Service;

import java.util.List;

import LLD_Assignment.ScootyRentalsSystem.Models.Scooty;

public interface IOutletService {
	public List<Scooty> getAllScooties(long idOutlet);
}
