package  co.com.pds.demo.entidades;


import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import javassist.SerialVersionUID;



@Entity
@Table(name = "usuarios")
//@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Usuarios  implements Serializable{
	
	private static final Long SerialVersionUID= 1L;//Estructura
	
	@Id //Clave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Defininir que tipo identity clave primaria
	@Column(name ="id") //Nombre de columna base de datos
	private  long id; //Entidad con su tipo de datos
	
	@NotNull
	@NotEmpty(message = "El name es requerido")
	@Column(name = "name")
	private String name;
	
	@NotNull
	@NotEmpty(message = "El lastname es requerido")
	@Column(name = "lastname")
	private  String lastname;
	
	 
		public Usuarios() {
			
		}
		
		public Usuarios(long id, String name, String lastname) {
			this.id = id;
			this.name = name;
			this.lastname = lastname;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

	 
}
