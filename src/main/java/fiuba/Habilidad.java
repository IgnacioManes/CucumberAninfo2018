package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class Habilidad {
	private String nombre;
	private String descripcion;

	public Habilidad(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre(){
		return this.nombre;
	}
}