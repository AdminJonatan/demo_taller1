package co.com.pds.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.pds.demo.entidades.Usuarios;

public interface UsuarioRepository   extends JpaRepository<Usuarios, Long>{//Extender la funciones  de la base de datos para spring como guardar,  eliminar, buscar, modificar

  
}
