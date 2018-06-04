# language: es
Característica: representar horas libres

  Escenario: Empleado cargo una cantidad baja de horas trabajadas
    Dado que el empleado cargo "2" horas en la fecha "1"
    Cuando consulto las horas del empleado en esa fecha
    Entonces se refleja que esta libre en color "verde"

  Escenario: Empleado cargo una cantidad media de horas trabajadas
    Dado que el empleado cargo "4" horas en la fecha "1"
    Cuando consulto las horas del empleado en esa fecha
    Entonces se refleja que no esta completamente ocupado en color "amarillo"

  Escenario: Empleado cargo una cantidad alta de horas trabajadas
    Dado que el empleado cargo "7" horas en la fecha "1"
    Cuando consulto las horas del empleado en esa fecha
    Entonces se refleja que esta ocupado en color "rojo"
	
	Escenario: Se consultan las horas de un empleado
		Dado que el empleado tiene cargadas "8" horas
		Cuando consulto las horas del mismo
		Entonces se muestran las "8" horas trabajadas del empleado.
	
	Escenario: Se filtran las horas por días 
		Dado que un empleado carga "6" horas el día "1", "8" horas el día "2" y "5" horas el día "3"
		Cuando se aplica el filtro por día
		Entonces se mostrarán las horas en "3" columnas distintas, una por cada día.
	
	Escenario: Se filtran las horas por semana
		Dado que un empleado carga "6" horas el día "1", "8" horas el día "2" y "5" horas el día "3"
		Cuando se aplica el filtro por semana
		Entonces se mostrarán el total de las horas semanales ("19" horas) en una sola columna.
	
	Escenario: Se filtran las horas por mes
		Dado que un empleado carga "26" horas la semana "1", "38" horas la semana "2" y "35" horas la semana "3"
		Cuando se aplica el filtro por mes
		Entonces se mostrarán el total de las horas mensuales ("99" horas) en una sola columna.
	
	Escenario: Se filtran las horas por equipo de desarrollo
		Dado que un empleado del equipo "1" carga "11" horas, un empleado del equipo "2" carga "12" horas
		Cuando se aplica el filtro por equipo de desarrollo "1"
		Entonces se mostrará el detalle de las horas del empleado que cargó "11" horas.
	
