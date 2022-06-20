package LLD_Assignment.ScootyRentalsSystem.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import LLD_Assignment.ScootyRentalsSystem.Models.Reservation;

@Service
public class ReservationService implements IReservation{
	//Below list is a part of Database and Repository Layer. As I am not using any
	//DB here that is why using this temporary list to store Reservation's information 
	
	List<Reservation> reservationList;
	
	public ReservationService() {
		reservationList=new ArrayList<>();
		reservationList=new ArrayList<>();
		reservationList.add(new Reservation("1","1","1"));
	}
	

	@Override
	public Reservation addNewReservation(Reservation reservation) {
	reservationList.add(reservation);
//      Logic to update Availability of Scooty in the database. As it is not not using a DB that is why can't implement
//		list.forEach(e->{
//			if(e.getIdScooty==resrvation.getScootyId) {
//				e.setAvailability="No";
//			}
//		});
		return reservation;
	}


	@Override
	public String cancelReservation(long idReserve) {
		reservationList=this.reservationList.stream().filter(e->Long.parseLong
				(e.getIdReserve())!=idReserve).collect(Collectors.toList());
		return null;
	}

}
