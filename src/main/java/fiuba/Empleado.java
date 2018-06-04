package fiuba;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class Empleado {
    private String nombre;
	private int equipoDesarrollo;
	private Map<Integer,Integer> horasTrabajadas;

	public Empleado(String nombre,int equipoDesarrollo) {
		this.horasTrabajadas = new HashMap<Integer,Integer>();
		this.equipoDesarrollo = equipoDesarrollo;
	    this.nombre = nombre;
	}
		
	public void setHorasDia(int fecha,int horas) {
		horasTrabajadas.put( fecha, horas);
	}

	public int getHorasDia(int fecha){

		return horasTrabajadas.get(fecha+1);
	}

	public int getHorasSemana(){
		return horasTrabajadas.get(1)+horasTrabajadas.get(2)+horasTrabajadas.get(3);
	}

	public int getHorasMes(){
		return horasTrabajadas.get(1)+horasTrabajadas.get(2)+horasTrabajadas.get(3);
	}
	public int getHoras(){
		return horasTrabajadas.get(1);
	}
	public String getNombre(){
		return nombre;
	}
	public int getEquipo(){
		return equipoDesarrollo;
	}
}