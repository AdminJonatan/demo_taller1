package co.com.pds.demo.Servicios;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.pds.demo.entidades.Bookings;
import co.com.pds.demo.entidades.Movies;
import co.com.pds.demo.repositorio.BookingsRepository;


@Service
public class BookingsSerivicio  implements BookingsServicios {

	private BookingsRepository bookingsSerivicio;
	
	
	public BookingsSerivicio(BookingsRepository bookingsSerivicio) {
		super();
		this.bookingsSerivicio = bookingsSerivicio;
	}

	@Override
	public List<Bookings> findAll() {
		// TODO Auto-generated method stub
		return bookingsSerivicio.findAll();
	}

	@Override
	public Bookings create(Bookings bookings) {
		if(bookings.getUserid() == 0 || bookings.getShowtimeid() == 0  || Objects.isNull(bookings.getUserid())  ||  Objects.isNull(bookings.getShowtimeid())  ) {
			return null;
		}
		// TODO Auto-generated method stub
		return bookingsSerivicio.save(bookings);
	}

	@Override
	public Optional<Bookings> getbyidBooking(Long id) {
		// TODO Auto-generated method stub
		return bookingsSerivicio.findById(id);
	}

	

	@Override
	public void deletebyIdB(Long id) {
		// TODO Auto-generated method stub
		bookingsSerivicio.deleteById(id);
	}

	
	

}
