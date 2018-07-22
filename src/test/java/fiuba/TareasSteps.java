package fiuba;

import java.util.List;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TareasSteps {
	private Empleado fachada_empleado;
	private Proyecto fachada_proyecto;
	private Proyecto fachada_proyecto2;
	private Tarea fachada_tarea;
	private Iteracion fachada_iteracion;
	private	Fase fachada_fase ;
	private	Habilidad fachada_habilidad ;
    @Dado("^que tengo la \"(.*?)\" \"(.*?)\"$")
    public void que_tengo_la_tarea_estado(String tarea,String estado) throws Throwable {
    	this.fachada_tarea = new Tarea(tarea,estado);
    }

    @Cuando("^se la asigna al \"(.*?)\"$")
    public void se_la_asigna_a_al_empleado(String empleado) throws Throwable {
    	this.fachada_empleado = new Empleado(empleado,"DESC");
    	this.fachada_empleado.agregarTarea(this.fachada_tarea);
    }

    @Entonces("^la \"(.*?)\" no queda asignada al \"(.*?)\".$")
    public void la_tarea_no_queda_asignada_al_empleado(String tarea,String empleado) throws Throwable {
    	assertFalse(this.fachada_empleado.getTarea(tarea).equals(tarea));
    }

	@Dado("^que el \"(.*?)\" esta asignado al \"(.*?)\"$")
	public void que_el_empleado_esta_asignado_al_proyecto(String empleado,String proyecto) throws Throwable {
		this.fachada_empleado = new Empleado(empleado,"DESC");
		this.fachada_proyecto = new Proyecto(proyecto);
		this.fachada_empleado.setProyecto(fachada_proyecto);
    }
	@Cuando("^se le asigna la \"(.*?)\" \"(.*?)\" del \"(.*?)\" al \"(.*?)\"$")
	public void se_le_asigna_la_tarea_libre_del_proyecto_al_empleado(String tarea,String estado,String proyecto,String empleado) throws Throwable {
		this.fachada_tarea = new Tarea(tarea,estado);
		this.fachada_iteracion = new Iteracion("iteracion");
		this.fachada_iteracion.agregarTarea(this.fachada_tarea);
		this.fachada_fase = new Fase();
		if(proyecto==this.fachada_proyecto.getNombre()){
			this.fachada_proyecto.setFaseActual(this.fachada_fase);
			this.fachada_proyecto.setIteracionActual(this.fachada_iteracion);
			this.fachada_empleado.setProyecto(this.fachada_proyecto);
	    	this.fachada_empleado.agregarTarea(this.fachada_tarea);
	    }else{
	    	this.fachada_proyecto2 = new Proyecto(proyecto);
	    	this.fachada_proyecto2.setFaseActual(this.fachada_fase);
			this.fachada_proyecto2.setIteracionActual(this.fachada_iteracion);
	    	this.fachada_empleado.agregarTarea(this.fachada_tarea);
	    }
    }
    @Entonces("^la \"(.*?)\" queda asignada al \"(.*?)\".$")
    public void la_tarea_queda_asignada_al_empleado(String tarea,String empleado) throws Throwable {
		assertTrue(this.fachada_empleado.getTarea(tarea).equals(tarea));
    }

    	@Dado("^que el \"(.*?)\" esta asignado a el \"(.*?)\" en la \"(.*?)\"$")
	public void que_el_empleado_esta_asignado_a_el_proyecto_en_la_iteracion(String empleado,String proyecto,String iteracion) throws Throwable {
		this.fachada_empleado = new Empleado(empleado,"DESC");
		this.fachada_proyecto = new Proyecto(proyecto);
		this.fachada_empleado.setProyecto(fachada_proyecto);
		this.fachada_iteracion = new Iteracion(iteracion);
		this.fachada_fase = new Fase();
		this.fachada_proyecto.setFaseActual(this.fachada_fase);
		this.fachada_proyecto.setIteracionActual(this.fachada_iteracion);
    }


    @Cuando("^se le asigna la \"(.*?)\" \"(.*?)\" de la \"(.*?)\" a el \"(.*?)\"$")
    public void se_le_asigna_la_tarea_estado_de_la_iteracion_a_el_empleado(String tarea,String estado,String iteracion,String empleado) throws Throwable {
    	this.fachada_tarea = new Tarea(tarea,estado);
    	if(fachada_iteracion.getId()==iteracion){
			this.fachada_iteracion.agregarTarea(this.fachada_tarea);
			this.fachada_proyecto.setIteracionActual(this.fachada_iteracion);
	    	this.fachada_empleado.agregarTarea(this.fachada_tarea);
    	}else{
    		this.fachada_iteracion = new Iteracion(iteracion);
    		this.fachada_iteracion.agregarTarea(this.fachada_tarea);
    		this.fachada_proyecto.agregarIteracion(this.fachada_iteracion);
    		this.fachada_empleado.agregarTarea(this.fachada_tarea);
    	}
    }

    @Dado("^que el \"(.*?)\" que no tiene la habilidad \"(.*?)\"$")
    public void que_el_empleado_que_no_tiene_la_habilidad(String empleado,String habilidad) throws Throwable {
    	this.fachada_empleado = new Empleado(empleado,"DESC");
		this.fachada_habilidad = new Habilidad(habilidad);
    }
    @Cuando("^se le asigna la \"(.*?)\" \"(.*?)\" que requiere la habilidad \"(.*?)\" al \"(.*?)\"$")
    public void se_le_asigna_la_tarea_estado_que_requiere_la_habilidad(String tarea,String estado,String habilidad,String empleado) throws Throwable {
    	this.fachada_proyecto = new Proyecto("proyecto");
    	this.fachada_tarea = new Tarea(tarea,estado);
    	this.fachada_tarea.agregarHabilidadNecesaria(fachada_habilidad);
		this.fachada_iteracion = new Iteracion("iteracion");
		this.fachada_iteracion.agregarTarea(this.fachada_tarea);
		this.fachada_fase = new Fase();
		this.fachada_proyecto.setFaseActual(this.fachada_fase);
		this.fachada_proyecto.setIteracionActual(this.fachada_iteracion);
		this.fachada_empleado.setProyecto(this.fachada_proyecto);
    	this.fachada_empleado.agregarTarea(this.fachada_tarea);
    }

    @Dado("^que el \"(.*?)\" que tiene la habilidad \"(.*?)\"$")
    public void que_el_empleado_que_tiene_la_habilidad(String empleado,String habilidad) throws Throwable {
    	this.fachada_empleado = new Empleado(empleado,"DESC");
		this.fachada_habilidad = new Habilidad(habilidad);
		this.fachada_empleado.agregarHabilidad(fachada_habilidad);
		}
}

