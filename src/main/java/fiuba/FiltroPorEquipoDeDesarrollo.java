package fiuba;
import java.util.List;
import java.util.ArrayList;

public class FiltroPorEquipoDeDesarrollo extends Filtro{
	private int equipo;
	public FiltroPorEquipoDeDesarrollo (int equipo){
			this.equipo=equipo;
	}
	public List<CeldaHoras> filtrar(List<Empleado> empleados){
		List<CeldaHoras> celdasFiltradas = new ArrayList<CeldaHoras>(); 
			
		
		
		for (Empleado unEmpleado : empleados) {
			
			if (unEmpleado.getEquipo() == this.equipo ){
				CeldaHoras unaCelda = new CeldaHoras();			
				unaCelda.setHoras(unEmpleado.getHoras());
				unaCelda.setEmpleado(unEmpleado.getNombre());
				unaCelda.setLabel("Equipo " + String.valueOf(equipo));
				
				celdasFiltradas.add(unaCelda);
			}
		}
		
		return celdasFiltradas;
		
	}
	
}