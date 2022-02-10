package  co.com.pds.demo.entidades;



import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name ="showtimes")
public class Showtimes  implements Serializable  {
	
	private static final Long SerialVersionUID= 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private  long id;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
	@Column(name = "date")
	private Date date;
	 
	@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "movies_id") //La columna con la cual se va unir 
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private List<Movies> movies; //Relación con  Peliculas  y diferencia por la entidad 


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public List<Movies> getMovies() {
		return movies;
	}


	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}


	public Showtimes() {
	
	}


	public Showtimes(long id, Date date, List<Movies> movies) {
		super();
		this.id = id;
		this.date = date;
		this.movies = movies;
	}

	

	
}
