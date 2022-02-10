package co.com.pds.demo.Servicios;

import java.util.List;
import java.util.Optional;

import co.com.pds.demo.entidades.Bookings;

public interface BookingsServicios {
	List<Bookings> findAll();
	Bookings create(Bookings bookings);
	Optional<Bookings> getbyidBooking(Long id);
	void deletebyIdB(Long id);
}
