package co.com.pds.demo.Servicios;

import java.util.List;
import java.util.Optional;

import co.com.pds.demo.entidades.Showtimes;

public interface ShowtimesServicios {

	List<Showtimes> findAll();
	
	Showtimes create(Showtimes showtimes);
	
	Optional<Showtimes> GetByid(Long id);
	
	
}
