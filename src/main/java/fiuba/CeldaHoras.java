package fiuba;
public class CeldaHoras{
	private String label;
	private String empleado;
	private int horas;
	
	public void setLabel(String unLabel){
		label = unLabel;
	}
	
	public void setEmpleado(String unEmpleado){
		empleado = unEmpleado;
	}
	
	public void setHoras(int unasHoras){
		horas = unasHoras;
	}
	
	public String getLabel(){
		return label;
	}
	
	public String getEmpleado(){
		return empleado;
	}
	
	public int getHoras(){
		return horas;
	}
}