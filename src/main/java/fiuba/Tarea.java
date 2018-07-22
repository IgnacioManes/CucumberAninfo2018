package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
public class Tarea {
	private int id;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private float duracionEstimada;
	private String estado;
	private float estimacion;
	private int Prioridad;
	private Habilidad habilidad;


	public Tarea(String descripcion,String estado) {
	    this.descripcion = descripcion;
	    this.estado = estado;
	    this.habilidad = new Habilidad("");
	}
	public void setEstado(String estado){}
	public void agregarPersona(Empleado empleado){}
	public void agregarHabilidadNecesaria(Habilidad habilidad) {
		this.habilidad=habilidad;
	}
	public Habilidad getHabilidad() {
		return habilidad;
	}
	public String getEstado(){return estado;}
	public String getDesc(){return descripcion;}

}