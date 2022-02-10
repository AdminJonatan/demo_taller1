package co.com.pds.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.pds.demo.entidades.Showtimes;

public interface ShowtimesRepository   extends JpaRepository<Showtimes, Long>{

}
