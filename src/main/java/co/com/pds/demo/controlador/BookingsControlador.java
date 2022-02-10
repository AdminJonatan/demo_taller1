package co.com.pds.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.context.properties.bind.Name;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.pds.demo.Servicios.BookingsSerivicio;
import co.com.pds.demo.Servicios.ShowtimesServicios;
import co.com.pds.demo.entidades.Bookings;
import co.com.pds.demo.entidades.Showtimes;
import co.com.pds.demo.entidades.Usuarios;

@RestController
@RequestMapping("/bookings")
public class BookingsControlador {
	private final BookingsSerivicio bookingsSerivicio;

	
	
	public BookingsControlador(BookingsSerivicio bookingsSerivicio) {
		super();
		this.bookingsSerivicio = bookingsSerivicio;
	}
	

	@GetMapping("estado")
	public String estado() {
		return "Serivicio corriendo bookings";	
	}
	
	@GetMapping("")
	public List<Bookings> findAll(){
		return bookingsSerivicio.findAll();
	}
	
	@PostMapping
	public  ResponseEntity<Bookings> create(@RequestBody Bookings bookings) {
		Bookings  valid = bookingsSerivicio.create(bookings);
		if( valid == null) {
		 return	ResponseEntity.badRequest().build();
		}
	    return ResponseEntity.status(HttpStatus.CREATED).body(valid);
	}
	
	
	@GetMapping(value = "/{id}")
	public  Optional<Bookings> getbyid(@PathVariable Long id) {
		return bookingsSerivicio.getbyidBooking(id);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public  void create(@PathVariable Long id) {
		bookingsSerivicio.deletebyIdB(id);
	}

}
