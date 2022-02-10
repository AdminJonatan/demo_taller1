package co.com.pds.demo.Servicios;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import co.com.pds.demo.entidades.Bookings;
import co.com.pds.demo.entidades.Movies;
import co.com.pds.demo.repositorio.BookingsRepository;
import co.com.pds.demo.repositorio.MoviesRepository;


@Service
public class MoviesServicioImpl  implements MoviesServicio  {

	
	private  MoviesRepository moviesRepository;
	
	public MoviesServicioImpl(MoviesRepository moviesRepository) {
		super();
		this.moviesRepository = moviesRepository;
	}


	@Override
	public List<Movies> findAllM() {
		// TODO Auto-generated method stub
		return moviesRepository.findAll();
	}

	@Override
	public Movies create(Movies movies) {
		
		if(movies.getTitle() == null  ||  movies.getTitle() =="" ||  movies.getDirector() == null  ||  movies.getDirector() ==""
				|| movies.getRating() >= 6 ||  movies.getRating() <= 0 ) {
            return null;
		}
		
		// TODO Auto-generated method stub
		return moviesRepository.save(movies);
	}

	@Override
	public Optional<Movies> getbyid(Long id) {
		// TODO Auto-generated method stub
		return moviesRepository.findById(id) ;
	}


	@Override
	public boolean deletebyId(Long id) {
			// TODO Auto-generated method stub
		    //Iterator < Movies > it = bookings.getMovies().iterator();
			/*while (it.hasNext()) {
			Movies nombre = it.next();
			 if(nombre.getId() == id) {
				 return false;
			 }
			}*/
			moviesRepository.deleteById(id);
			return true;
	
	}

}
