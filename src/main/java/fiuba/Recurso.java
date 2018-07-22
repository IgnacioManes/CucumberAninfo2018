package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class Recurso {
    protected String nombre;
	protected String descripcion;
	protected Proyecto proyecto;
	public Recurso(String nombre,String descripcion) {
		this.nombre = nombre;
	    this.descripcion = descripcion;
	}

	
}