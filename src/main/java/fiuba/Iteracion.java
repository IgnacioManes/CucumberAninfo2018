package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Iteracion {
	private String Id;
	private List<Tarea> tareas;
	public Iteracion(String nombre) {
		this.Id=nombre;
		this.tareas = new ArrayList<Tarea>();	
	}
	public String getId(){
		return Id;
	}
	public List<Tarea> getTareas(){return tareas;}
	public void getRequerimientosCompletados(){}
	public void agregarTarea(Tarea tarea){
		tareas.add(tarea);
	}
	public void getFase(){}

}