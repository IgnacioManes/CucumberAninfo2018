package fiuba;
import java.util.List;
import java.util.ArrayList;

public class FiltroPorMes extends Filtro{
	
	public List<CeldaHoras> filtrar(List<Empleado> empleados){
		List<CeldaHoras> celdasFiltradas = new ArrayList<CeldaHoras>(); 
		
		
		
		for (Empleado unEmpleado : empleados) {
			
			CeldaHoras unaCelda = new CeldaHoras();			
			String mes = String.valueOf(1);
			unaCelda.setHoras(unEmpleado.getHorasMes());
			unaCelda.setEmpleado(unEmpleado.getNombre());
			unaCelda.setLabel("mes" + mes);
			
			celdasFiltradas.add(unaCelda);
		}
		
		return celdasFiltradas;
		
	}
	
}