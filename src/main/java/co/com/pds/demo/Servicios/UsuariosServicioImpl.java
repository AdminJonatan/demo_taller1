package co.com.pds.demo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import co.com.pds.demo.entidades.Usuarios;
import co.com.pds.demo.repositorio.UsuarioRepository;



@Service
public class UsuariosServicioImpl implements UsuariosServicios {

	private  UsuarioRepository usuarioRepository;
	
	public UsuariosServicioImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}


	@Override
	public List<Usuarios> findAll() {
		return usuarioRepository.findAll();
	}


	@Override
	public Usuarios create(Usuarios usuarios) {
		
		if(usuarios.getLastname() == null  ||  usuarios.getLastname() =="" ||  usuarios.getName() == null  ||  usuarios.getName() =="" ) {
             return null;
		}
		
		return usuarioRepository.save(usuarios);
	}


	@Override
	public  void DeletefindId(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}


	


}
