package fiuba;
import java.util.List;
import java.util.ArrayList;
public class GrillaHoras{
	private Filtro filtro;
	private List<Empleado> empleados;
	
	public GrillaHoras(){
		empleados = new ArrayList<Empleado>();
	}
	
	public void setFiltro(Filtro unFiltro){
		filtro = unFiltro;
	}
	
	public void agregarEmpleado(Empleado unEmpleado){
		empleados.add(unEmpleado);
	}
	
	public List<CeldaHoras> getEmpleadosConFiltro(){
		return filtro.filtrar(empleados);
	}

	public String getColor(){
		filtro=new FiltroPorDia();
		empleados.get(0).setHorasDia(2,0);
		empleados.get(0).setHorasDia(3,0);
		List<CeldaHoras> lista=filtro.filtrar(empleados);
		int horas=lista.get(0).getHoras();
		if(horas<=3){
			return "verde";
		}else if(horas<=6){
			return "amarillo";	
		}else{
			return "rojo";	
		}
	}
}