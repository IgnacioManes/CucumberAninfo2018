package fiuba;
import java.util.List;
import java.util.ArrayList;

public class FiltroPorDia extends Filtro{
	
	public List<CeldaHoras> filtrar(List<Empleado> empleados){
		List<CeldaHoras> celdasFiltradas = new ArrayList<CeldaHoras>(); 
		
		
		
		for (Empleado unEmpleado : empleados) {
			
			for(int i = 0; i < 3; i++){
				CeldaHoras unaCelda = new CeldaHoras();			
				String dia = String.valueOf(i+1);
				unaCelda.setHoras(unEmpleado.getHorasDia(i));
				unaCelda.setEmpleado(unEmpleado.getNombre());
				unaCelda.setLabel("dia" + dia);
				
				celdasFiltradas.add(unaCelda);
			}
		}
		
		return celdasFiltradas;
	}
	
}