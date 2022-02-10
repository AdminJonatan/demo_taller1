package co.com.pds.demo.Servicios;

import java.util.List;
import java.util.Optional;

import co.com.pds.demo.entidades.Movies;

public interface MoviesServicio {
	List<Movies> findAllM();
	Movies create(Movies usuarios);
	Optional<Movies> getbyid(Long id);
	boolean deletebyId(Long id);
}
