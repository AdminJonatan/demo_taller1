package co.com.pds.demo.controlador;
import java.util.List;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.pds.demo.Servicios.UsuariosServicios;

import co.com.pds.demo.entidades.Usuarios;


@RestController
@RequestMapping("/usuario")
public class UsuariosControl {

	@PostMapping
	public  ResponseEntity<Usuarios>  create(@Valid @RequestBody Usuarios usuarios) {
		Usuarios  valid = usuariosServicios.create(usuarios);
		if( valid == null) {
		 return	ResponseEntity.badRequest().build();
		}
	  return ResponseEntity.status(HttpStatus.CREATED).body(valid);
	}
	
	private final UsuariosServicios usuariosServicios;
	public UsuariosControl(UsuariosServicios usuariosServicios) {
		super();
		this.usuariosServicios = usuariosServicios;
	}
	
	@GetMapping("estado")
	public String estado() {
		return "Serivicio corriendo usuarios";	
	}
	
	@GetMapping("")
	public List<Usuarios> findAll(){
		return usuariosServicios.findAll();
	}
	
	
	@DeleteMapping(value = "/{id}")
	public  void create(@PathVariable Long id) {
		usuariosServicios.DeletefindId(id);
	}
	
}


