package fiuba;
import java.util.List;
import java.util.ArrayList;

public class FiltroPorSemana extends Filtro{
	
	public List<CeldaHoras> filtrar(List<Empleado> empleados){
		List<CeldaHoras> celdasFiltradas = new ArrayList<CeldaHoras>(); 
		
		
		
		for (Empleado unEmpleado : empleados) {
			
			CeldaHoras unaCelda = new CeldaHoras();			
			String semana = String.valueOf(1);
			unaCelda.setHoras(unEmpleado.getHorasSemana());
			unaCelda.setEmpleado(unEmpleado.getNombre());
			unaCelda.setLabel("semana" + semana);
			
			celdasFiltradas.add(unaCelda);
		}
		
		return celdasFiltradas;
	}
}