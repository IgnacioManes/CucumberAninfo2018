package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Fase {
	private int Id;
	private List<Iteracion> iteraciones;
	Iteracion iteracion_actual;
	public Fase() {
		this.iteracion_actual = new Iteracion("");
		this.iteraciones = new ArrayList<Iteracion>();	
	}
	public void setIteracionActual(Iteracion iteracion){
		this.iteracion_actual=iteracion;
	}
	public Iteracion getIteracionActual(){
		return this.iteracion_actual;
	}
	public void agregarIteracion(Iteracion iteracion){
		this.iteraciones.add(iteracion);
	}
	public float getDuracion(){
		float duracion = 0;
		return duracion;}
	public Proyecto getProyecto(){
		Proyecto proyecto = new Proyecto("nombre");
		return proyecto;
	}
}