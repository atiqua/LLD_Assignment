package LLD_Assignment.ScootyRentalsSystem.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import LLD_Assignment.ScootyRentalsSystem.Models.Reservation;
import LLD_Assignment.ScootyRentalsSystem.Service.IReservation;
@RestController

public class ReservationController {
	@Autowired
	public IReservation reservation;
	
	//To add a new Reservation done by X User for Y Scooty 
	@PostMapping("/addNewReservation")
	public Reservation addNewReservation(@RequestBody Reservation reservation) {
		return this.reservation.addNewReservation(reservation);	
	}
	
	//To Cancel a Reservation if reservation gets expire
	@DeleteMapping("/cancelReservation/{idReserve}")
	public String cancelReservation(@PathVariable String idReserve)
	{
		reservation.cancelReservation(Long.parseLong(idReserve));
		return"Reservation Cancel!";
	}

	
}
