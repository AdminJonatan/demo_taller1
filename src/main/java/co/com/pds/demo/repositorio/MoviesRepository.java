package co.com.pds.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.pds.demo.entidades.Movies;

public interface MoviesRepository  extends JpaRepository<Movies,Long>{

}
