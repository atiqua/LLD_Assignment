package LLD_Assignment.ScootyRentalsSystem.Service;

import LLD_Assignment.ScootyRentalsSystem.Models.Reservation;

public interface IReservation {
	public Reservation addNewReservation(Reservation reservation);
	public String cancelReservation(long idReserve);
}
