package fiuba;

import java.util.List;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class HorasLibresSteps {
	private Empleado fachadaEmpleado;
	private Empleado fachadaEmpleado1;
	private Empleado fachadaEmpleado2;
	private Empleado fachadaEmpleado3;
	private GrillaHoras grilla;
	private int horasCargadas;
	private String color;
	private int fecha;
    private final String nombreEmpleado = "Ignacio Manes";
	private final int equipoDesarrollo = 1;
	private final int fecha_default = 1;

    @Dado("^que el empleado cargo \"(.*?)\" horas en la fecha \"(.*?)\"$")
    public void que_el_empleado_cargo_horas(int horasCargadas,int fecha) throws Throwable {
        fachadaEmpleado = new Empleado(nombreEmpleado,equipoDesarrollo);
		fachadaEmpleado.setHorasDia(fecha,horasCargadas);
		this.fecha=fecha;
    }

    @Cuando("^consulto las horas del empleado en esa fecha$")
    public void consulto_las_horas_del_empleado() throws Throwable {
		grilla = new GrillaHoras();
        grilla.agregarEmpleado(fachadaEmpleado);
    }
	//Escenario: Empleado cargo una cantidad baja de horas trabajadas
    @Entonces("^se refleja que esta libre en color \"(.*?)\"$")
    public void se_refleja_que_esta_libre_en_color(String colorEsperado) throws Throwable {
        assertEquals(colorEsperado, grilla.getColor());
    }
	//Escenario: Empleado cargo una cantidad media de horas trabajadas
    @Entonces("^se refleja que no esta completamente ocupado en color \"(.*?)\"$")
    public void se_refleja_que_no_esta_completamente_ocupado_en_color(String colorEsperado) throws Throwable {
        assertEquals(colorEsperado, grilla.getColor());
    }
	//Escenario: Empleado cargo una cantidad alta de horas trabajadas
    @Entonces("^se refleja que esta ocupado en color \"(.*?)\"$")
    public void se_refleja_que_esta_ocupado_en_color(String colorEsperado) throws Throwable {
        assertEquals(colorEsperado, grilla.getColor());
    }

	//Escenario: Se consultan las horas de un empleado
	@Dado("^que el empleado tiene cargadas \"(.*?)\" horas$")
	public void que_el_empleado_tiene_cargadas_horas(int horasCargadas) throws Throwable {
        fachadaEmpleado = new Empleado(nombreEmpleado,equipoDesarrollo);
		fachadaEmpleado.setHorasDia(fecha_default,horasCargadas);
		fachadaEmpleado.setHorasDia(2,0);
		fachadaEmpleado.setHorasDia(3,0);
    }
	@Cuando("^consulto las horas del mismo$")
	public void consulto_las_horas() throws Throwable {
		grilla = new GrillaHoras();
        grilla.agregarEmpleado(fachadaEmpleado);
		grilla.setFiltro(new FiltroPorDia());
    }
		@Entonces("^se muestran las \"(.*?)\" horas trabajadas del empleado.$")
	public void que_el_empleado_cargo_horas(int horasEsperadas) throws Throwable {
		assertEquals(horasEsperadas, grilla.getEmpleadosConFiltro().get(0).getHoras());
    }

	@Dado("^que un empleado carga \"(.*?)\" horas el día \"(.*?)\", \"(.*?)\" horas el día \"(.*?)\" y \"(.*?)\" horas el día \"(.*?)\"$")
	public void que_un_empleado_carga_horas_3_días(int horasCargadas1,int fecha1,int horasCargadas2,int fecha2,int horasCargadas3,int fecha3) throws Throwable {
        fachadaEmpleado = new Empleado(nombreEmpleado,equipoDesarrollo);
		fachadaEmpleado.setHorasDia(fecha1,horasCargadas1);
		fachadaEmpleado.setHorasDia(fecha2,horasCargadas2);
		fachadaEmpleado.setHorasDia(fecha3,horasCargadas3);
    }
	//Escenario: Se filtran las horas por días 
	@Cuando("^se aplica el filtro por día$")
	public void se_aplica_el_filtro_por_día() throws Throwable {
		grilla = new GrillaHoras();
    	grilla.agregarEmpleado(fachadaEmpleado);
		grilla.setFiltro(new FiltroPorDia());
    }
	@Entonces("^se mostrarán las horas en \"(.*?)\" columnas distintas, una por cada día.$")
	public void se_mostrarán_las_horas_en_columnas_distintas(int cantDias) throws Throwable {
		assertEquals(cantDias,grilla.getEmpleadosConFiltro().size());
    }
	
	//Escenario: Se filtran las horas por semana
	@Cuando("^se aplica el filtro por semana$")
	public void se_aplica_el_filtro_por_semana() throws Throwable {
		grilla = new GrillaHoras();
        grilla.agregarEmpleado(fachadaEmpleado);
		grilla.setFiltro(new FiltroPorSemana());
    }
	@Entonces("^se mostrarán el total de las horas semanales \\(\"(.*?)\" horas\\) en una sola columna.$")
	public void se_mostrarán_las_horas_en_columna(int cantHorasSemanales) throws Throwable {
		List<CeldaHoras> listaPorSemana=grilla.getEmpleadosConFiltro();
		assertEquals(cantHorasSemanales,listaPorSemana.get(0).getHoras());
		assertEquals(1,listaPorSemana.size());
	}
	
	//Escenario: Se filtran las horas por mes
	@Dado("^que un empleado carga \"(.*?)\" horas la semana \"(.*?)\", \"(.*?)\" horas la semana \"(.*?)\" y \"(.*?)\" horas la semana \"(.*?)\"$")
	public void que_el_empleado_cargo_horas_semanas(int horasCargadas1,int fecha1,int horasCargadas2,int fecha2,int horasCargadas3,int fecha3) throws Throwable {
    	fachadaEmpleado = new Empleado(nombreEmpleado,equipoDesarrollo);
		fachadaEmpleado.setHorasDia(fecha1,horasCargadas1);
		fachadaEmpleado.setHorasDia(fecha2,horasCargadas2);
		fachadaEmpleado.setHorasDia(fecha3,horasCargadas3);
    }
	@Cuando("^se aplica el filtro por mes$")
	public void se_aplica_el_filtro_por_mes() throws Throwable {
		grilla = new GrillaHoras();
        grilla.agregarEmpleado(fachadaEmpleado);
		grilla.setFiltro(new FiltroPorMes());
		
    }
	@Entonces("^se mostrarán el total de las horas mensuales \\(\"(.*?)\" horas\\) en una sola columna.$")
	public void que_el_empleado_cargo_horas_en_columna_mes(int cantHorasMensuales) throws Throwable {
		List<CeldaHoras> listaPorMes=grilla.getEmpleadosConFiltro();
		assertEquals(cantHorasMensuales,listaPorMes.get(0).getHoras());
		assertEquals(1,listaPorMes.size());
    }
	
	//Escenario: Se filtran las horas por equipo de desarrollo
	@Dado("^que un empleado del equipo \"(.*?)\" carga \"(.*?)\" horas, un empleado del equipo \"(.*?)\" carga \"(.*?)\" horas$")
	public void que_el_empleado_del_equipo_cargo_horas(int equipo1,int horasCargadas1,int equipo2,int horasCargadas2) throws Throwable {
        fachadaEmpleado1 = new Empleado(nombreEmpleado,equipo1);
		fachadaEmpleado1.setHorasDia(fecha_default,horasCargadas1);
		fachadaEmpleado1.setHorasDia(2,0);
		fachadaEmpleado1.setHorasDia(3,0);
		fachadaEmpleado2 = new Empleado(nombreEmpleado,equipo2);
		fachadaEmpleado2.setHorasDia(fecha_default,horasCargadas2);
		fachadaEmpleado2.setHorasDia(2,0);
		fachadaEmpleado2.setHorasDia(3,0);
    }
	@Cuando("^se aplica el filtro por equipo de desarrollo \"(.*?)\"$")
	public void se_aplica_el_filtro_por_equipo(int equipo) throws Throwable {
		grilla = new GrillaHoras();
        grilla.agregarEmpleado(fachadaEmpleado1);
        grilla.agregarEmpleado(fachadaEmpleado2);
		grilla.setFiltro(new FiltroPorEquipoDeDesarrollo(equipo));
		
    }
	@Entonces("^se mostrará el detalle de las horas del empleado que cargó \"(.*?)\" horas.$")
	public void se_mostrará_el_detalle_de_las_horas_del_empleado(int horasCargadas) throws Throwable {
		List<CeldaHoras> listaPorEquipo=grilla.getEmpleadosConFiltro();
		assertEquals(horasCargadas,listaPorEquipo.get(0).getHoras());
    }
}
