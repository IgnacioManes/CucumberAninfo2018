package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
public class Proyecto {
	private String nombre;
	private String estado;
	private Date fecha_release;
	private float horasEstimadasInicial;
	private float horasEstimadasFinal;
	private List<Recurso> recursos;
	private List<Fase> fases;
	private Fase fase_actual;
	public Proyecto(String nombre) {  
		this.nombre=nombre  ;
		this.fases = new ArrayList<Fase>();
		this.fase_actual = new Fase();
		this.horasEstimadasFinal=0;
	}
	public boolean tieneLaTarea(String tareaDesc){
		for (Tarea tarea : fase_actual.getIteracionActual().getTareas()) {
			if(tarea.getDesc().equals(tareaDesc)){		
				return true;		
			}
		}
		return false;
	}
	public Recurso getLiderDeProyecto(){
		recursos.add(new Recurso("h","h"));
		return recursos.get(0);
	}
	public String getEquipoDeDesarrollo(){return "equipo";}
	public float getHorasTrabajadas(){return horasEstimadasFinal;}
	public float getTiempoTotalEmpleado(){return horasEstimadasFinal;}
	public void setFaseActual(Fase fase){
		this.fase_actual=fase;
	}
	public void setIteracionActual(Iteracion iteracion){
		this.fase_actual.setIteracionActual(iteracion);
	}
	public void agregarIteracion(Iteracion iteracion){
		this.fase_actual.agregarIteracion(iteracion);
	}
	
	public String getNombre(){return nombre;}
	public Iteracion getIteracionActual(){
		Iteracion iteracion=new Iteracion("");
		return iteracion;
	}

}