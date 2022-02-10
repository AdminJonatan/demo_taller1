package  co.com.pds.demo.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class EntidadBase {

	
	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false, unique = true)
	protected Long id;
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o ) return true;
		if(o == null || getClass() != o.getClass()) return false;
		EntidadBase that = (EntidadBase) o;
		return Objects.equals(id,that.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
