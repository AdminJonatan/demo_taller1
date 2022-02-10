package co.com.pds.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.pds.demo.Servicios.MoviesServicio;
import co.com.pds.demo.entidades.Movies;
import co.com.pds.demo.entidades.Usuarios;

@RestController
@RequestMapping("/movies")
public class MoviesControl {
	

	private final MoviesServicio moviesServicio;

	public MoviesControl(MoviesServicio moviesServicio) {
		super();
		this.moviesServicio = moviesServicio;
	}
	
	@GetMapping("Estado")
	public String estado() {
		return "Serivicio corriendo movies";	
	}
	
	@GetMapping("")
	public List<Movies> findAll(){
		return moviesServicio.findAllM();
	}
	@PostMapping
	public ResponseEntity<Movies> create(@RequestBody Movies movies) {
		Movies  valid = moviesServicio.create(movies);
		if( valid == null) {
			return	ResponseEntity.badRequest().build();
		}
			return ResponseEntity.status(HttpStatus.CREATED).body(valid);
	}
	
	@GetMapping(value = "/{id}")
	public  Optional<Movies> getbyid(@PathVariable Long id) {
		return moviesServicio.getbyid(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public  ResponseEntity<Object> deletebyid(@PathVariable Long id) {
		boolean valid =  moviesServicio.deletebyId(id);
		if(valid == false) {
			return	ResponseEntity.badRequest().build();
		}
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(valid);
		
	}
	
	
	
}
