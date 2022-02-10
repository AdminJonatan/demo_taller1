package co.com.pds.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estado")
public class controladorEstado {
	
	
	@GetMapping("")
	public String estado() {
		return "Serivicio corriendo";	
	}
	
}


