package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Empleado extends Recurso{
	private String rol;
	private float horasTrabajadas;
	private List<Habilidad> habilidades;
	private List<Tarea> tareas;
	private Proyecto proyecto;
	public Empleado(String nombre,String descripcion){
		super(nombre,descripcion);
		this.tareas = new ArrayList<Tarea>();
		this.habilidades = new ArrayList<Habilidad>();
		this.proyecto = new Proyecto("");
	}
	public float getHorasEstimadas(){return 0;}
	public void agregarTarea(Tarea tarea){
		if(puedeHacerLaTarea(tarea)){
			tareas.add(tarea);
		}
	}
	private boolean puedeHacerLaTarea(Tarea tarea){
		if(tarea.getEstado().equals("libre") && proyecto.tieneLaTarea(tarea.getDesc())){
			String nombreHabilidad=tarea.getHabilidad().getNombre();
			if(nombreHabilidad!=""){
				for (Habilidad habilidad : habilidades){
					if(nombreHabilidad==habilidad.getNombre()){
						return true;
					}
				}
			}else{
				return true;
			}

		}
		return false;
	}

	public void agregarHabilidad(Habilidad habilidad){
		this.habilidades.add(habilidad);
	}
	public void setProyecto(Proyecto proyecto){
		this.proyecto=proyecto;
	}
	public String getNombreProyecto(){ return "";}

	public String getTarea(String tareaDesc){ 
		for (Tarea tarea : tareas) {
	        if (tarea.getDesc().equals(tareaDesc)) {
	            return tareaDesc;
	        }
	    }
	    String vacio="";
		return vacio;
	}
}