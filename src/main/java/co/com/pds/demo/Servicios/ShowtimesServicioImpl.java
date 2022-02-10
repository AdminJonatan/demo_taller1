package co.com.pds.demo.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.pds.demo.entidades.Showtimes;
import co.com.pds.demo.repositorio.ShowtimesRepository;

@Service
public class ShowtimesServicioImpl implements ShowtimesServicios {

	
	private  ShowtimesRepository showtimesRepository;
	
	public ShowtimesServicioImpl(ShowtimesRepository showtimesRepository) {
		super();
		this.showtimesRepository = showtimesRepository;
	}

	@Override
	public List<Showtimes> findAll() {
		// TODO Auto-generated method stub
		return showtimesRepository.findAll();
	}

	@Override
	public Showtimes create(Showtimes showtimes) {
		// TODO Auto-generated method stub
		if(showtimes.getDate() == null  ) {
            return null;
		}
		return showtimesRepository.save(showtimes);
	}

	@Override
	public Optional<Showtimes> GetByid(Long id) {
		// TODO Auto-generated method stub
		return showtimesRepository.findById(id);
	}

	
}
