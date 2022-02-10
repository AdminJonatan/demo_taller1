package  co.com.pds.demo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name ="bookings")
public class Bookings implements Serializable  {

	private static final Long SerialVersionUID= 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private  long id;
	
	
	@Column(name = "userid")
	private long userid;
	 

	
	@Column(name = "showtimeid")
	private long showtimeid;
	
	@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "movies_ids") //Columna  diferente para que se acepte las relaciones (Nombre)
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private List<Movies> movies;

	public Bookings(long id, long userid, long showtimeid, List<Movies> movies) {
		super();
		this.id = id;
		this.userid = userid;
		this.showtimeid = showtimeid;
		this.movies = movies;
	}

	public Bookings() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getShowtimeid() {
		return showtimeid;
	}

	public void setShowtimeid(long showtimeid) {
		this.showtimeid = showtimeid;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	
}
