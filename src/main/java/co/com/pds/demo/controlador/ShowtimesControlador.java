package co.com.pds.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.metadata.PostgresTableMetaDataProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.pds.demo.Servicios.ShowtimesServicios;
import co.com.pds.demo.entidades.Movies;
import co.com.pds.demo.entidades.Showtimes;
import co.com.pds.demo.entidades.Usuarios;

@RestController
@RequestMapping("/showtimes")
public class ShowtimesControlador {
	
	private final ShowtimesServicios showtimesServicios;

	public ShowtimesControlador(ShowtimesServicios showtimesServicios) {
		super();
		this.showtimesServicios = showtimesServicios;
	} 
	
	
	@GetMapping("Estado")
	public String estado() {
		return "Serivicio corriendo showtimes";	
	}
	
	@GetMapping("")
	public List<Showtimes> findAll(){
		return showtimesServicios.findAll();
	}
	@PostMapping
	public  ResponseEntity<Showtimes> create(@RequestBody Showtimes showtimes) {
		
		Showtimes  valid = showtimesServicios.create(showtimes);
		if( valid == null) {
		 return	ResponseEntity.badRequest().build();
		}
	  return ResponseEntity.status(HttpStatus.CREATED).body(valid);
	
	}
	
	@PutMapping(value = "/{id}")
	public  Showtimes update(@RequestBody Showtimes showtimes, @PathVariable long id) {
		showtimes.setId(id);
		return showtimesServicios.create(showtimes);
	}
	
	@GetMapping(value = "/{id}")
	public  Optional<Showtimes> getbyid(@PathVariable Long id) {
		return showtimesServicios.GetByid(id);
	}

}
