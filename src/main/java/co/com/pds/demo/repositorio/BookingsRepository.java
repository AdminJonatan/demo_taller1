package co.com.pds.demo.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;


import co.com.pds.demo.entidades.*;

public interface BookingsRepository   extends JpaRepository<Bookings, Long>{  //Extender la funciones  de la base de datos para spring como guardar,  eliminar, buscar, modificar


    
}

