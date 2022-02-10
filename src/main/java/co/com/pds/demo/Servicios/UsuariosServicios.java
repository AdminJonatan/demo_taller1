package co.com.pds.demo.Servicios;

import java.util.List;

import co.com.pds.demo.entidades.Usuarios;

public interface UsuariosServicios {
	
	List<Usuarios> findAll();
	
	Usuarios create(Usuarios usuarios);
	
    void DeletefindId(Long id);
    
}

