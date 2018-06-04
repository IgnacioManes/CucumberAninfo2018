$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("horas.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "representar horas libres",
  "description": "",
  "id": "representar-horas-libres",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Empleado cargo una cantidad baja de horas trabajadas",
  "description": "",
  "id": "representar-horas-libres;empleado-cargo-una-cantidad-baja-de-horas-trabajadas",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que el empleado cargo \"2\" horas en la fecha \"1\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "consulto las horas del empleado en esa fecha",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "se refleja que esta libre en color \"verde\"",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 45
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_cargo_horas(int,int)"
});
formatter.result({
  "duration": 98577450,
  "status": "passed"
});
formatter.match({
  "location": "HorasLibresSteps.consulto_las_horas_del_empleado()"
});
formatter.result({
  "duration": 108723,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "verde",
      "offset": 36
    }
  ],
  "location": "HorasLibresSteps.se_refleja_que_esta_libre_en_color(String)"
});
formatter.result({
  "duration": 2492398,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Empleado cargo una cantidad media de horas trabajadas",
  "description": "",
  "id": "representar-horas-libres;empleado-cargo-una-cantidad-media-de-horas-trabajadas",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que el empleado cargo \"4\" horas en la fecha \"1\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "consulto las horas del empleado en esa fecha",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "se refleja que no esta completamente ocupado en color \"amarillo\"",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 45
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_cargo_horas(int,int)"
});
formatter.result({
  "duration": 195101,
  "status": "passed"
});
formatter.match({
  "location": "HorasLibresSteps.consulto_las_horas_del_empleado()"
});
formatter.result({
  "duration": 19539,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amarillo",
      "offset": 55
    }
  ],
  "location": "HorasLibresSteps.se_refleja_que_no_esta_completamente_ocupado_en_color(String)"
});
formatter.result({
  "duration": 113384,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Empleado cargo una cantidad alta de horas trabajadas",
  "description": "",
  "id": "representar-horas-libres;empleado-cargo-una-cantidad-alta-de-horas-trabajadas",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 15,
  "name": "que el empleado cargo \"7\" horas en la fecha \"1\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "consulto las horas del empleado en esa fecha",
  "keyword": "Cuando "
});
formatter.step({
  "line": 17,
  "name": "se refleja que esta ocupado en color \"rojo\"",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 45
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_cargo_horas(int,int)"
});
formatter.result({
  "duration": 236944,
  "status": "passed"
});
formatter.match({
  "location": "HorasLibresSteps.consulto_las_horas_del_empleado()"
});
formatter.result({
  "duration": 37329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rojo",
      "offset": 38
    }
  ],
  "location": "HorasLibresSteps.se_refleja_que_esta_ocupado_en_color(String)"
});
formatter.result({
  "duration": 147418,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Se consultan las horas de un empleado",
  "description": "",
  "id": "representar-horas-libres;se-consultan-las-horas-de-un-empleado",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 20,
  "name": "que el empleado tiene cargadas \"8\" horas",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "consulto las horas del mismo",
  "keyword": "Cuando "
});
formatter.step({
  "line": 22,
  "name": "se muestran las \"8\" horas trabajadas del empleado.",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 32
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_tiene_cargadas_horas(int)"
});
formatter.result({
  "duration": 141835,
  "status": "passed"
});
formatter.match({
  "location": "HorasLibresSteps.consulto_las_horas()"
});
formatter.result({
  "duration": 45950,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 17
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_cargo_horas(int)"
});
formatter.result({
  "duration": 233400,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Se filtran las horas por días",
  "description": "",
  "id": "representar-horas-libres;se-filtran-las-horas-por-días",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 25,
  "name": "que un empleado carga \"6\" horas el día \"1\", \"8\" horas el día \"2\" y \"5\" horas el día \"3\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 26,
  "name": "se aplica el filtro por día",
  "keyword": "Cuando "
});
formatter.step({
  "line": 27,
  "name": "se mostrarán las horas en \"3\" columnas distintas, una por cada día.",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 40
    },
    {
      "val": "8",
      "offset": 45
    },
    {
      "val": "2",
      "offset": 62
    },
    {
      "val": "5",
      "offset": 68
    },
    {
      "val": "3",
      "offset": 85
    }
  ],
  "location": "HorasLibresSteps.que_un_empleado_carga_horas_3_días(int,int,int,int,int,int)"
});
formatter.result({
  "duration": 416957,
  "status": "passed"
});
formatter.match({
  "location": "HorasLibresSteps.se_aplica_el_filtro_por_día()"
});
formatter.result({
  "duration": 30218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 27
    }
  ],
  "location": "HorasLibresSteps.se_mostrarán_las_horas_en_columnas_distintas(int)"
});
formatter.result({
  "duration": 141403,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Se filtran las horas por semana",
  "description": "",
  "id": "representar-horas-libres;se-filtran-las-horas-por-semana",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 30,
  "name": "que un empleado carga \"6\" horas el día \"1\", \"8\" horas el día \"2\" y \"5\" horas el día \"3\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 31,
  "name": "se aplica el filtro por semana",
  "keyword": "Cuando "
});
formatter.step({
  "line": 32,
  "name": "se mostrarán el total de las horas semanales (\"19\" horas) en una sola columna.",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 40
    },
    {
      "val": "8",
      "offset": 45
    },
    {
      "val": "2",
      "offset": 62
    },
    {
      "val": "5",
      "offset": 68
    },
    {
      "val": "3",
      "offset": 85
    }
  ],
  "location": "HorasLibresSteps.que_un_empleado_carga_horas_3_días(int,int,int,int,int,int)"
});
formatter.result({
  "duration": 342317,
  "status": "passed"
});
formatter.match({
  "location": "HorasLibresSteps.se_aplica_el_filtro_por_semana()"
});
formatter.result({
  "duration": 53147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "19",
      "offset": 47
    }
  ],
  "location": "HorasLibresSteps.se_mostrarán_las_horas_en_columna(int)"
});
formatter.result({
  "duration": 233954,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Se filtran las horas por mes",
  "description": "",
  "id": "representar-horas-libres;se-filtran-las-horas-por-mes",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 35,
  "name": "que un empleado carga \"26\" horas la semana \"1\", \"38\" horas la semana \"2\" y \"35\" horas la semana \"3\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 36,
  "name": "se aplica el filtro por mes",
  "keyword": "Cuando "
});
formatter.step({
  "line": 37,
  "name": "se mostrarán el total de las horas mensuales (\"99\" horas) en una sola columna.",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "26",
      "offset": 23
    },
    {
      "val": "1",
      "offset": 44
    },
    {
      "val": "38",
      "offset": 49
    },
    {
      "val": "2",
      "offset": 70
    },
    {
      "val": "35",
      "offset": 76
    },
    {
      "val": "3",
      "offset": 97
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_cargo_horas_semanas(int,int,int,int,int,int)"
});
formatter.result({
  "duration": 512776,
  "status": "passed"
});
formatter.match({
  "location": "HorasLibresSteps.se_aplica_el_filtro_por_mes()"
});
formatter.result({
  "duration": 66275,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99",
      "offset": 47
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_cargo_horas_en_columna_mes(int)"
});
formatter.result({
  "duration": 247613,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Se filtran las horas por equipo de desarrollo",
  "description": "",
  "id": "representar-horas-libres;se-filtran-las-horas-por-equipo-de-desarrollo",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 40,
  "name": "que un empleado del equipo \"1\" carga \"11\" horas, un empleado del equipo \"2\" carga \"12\" horas",
  "keyword": "Dado "
});
formatter.step({
  "line": 41,
  "name": "se aplica el filtro por equipo de desarrollo \"1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 42,
  "name": "se mostrará el detalle de las horas del empleado que cargó \"11\" horas.",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 28
    },
    {
      "val": "11",
      "offset": 38
    },
    {
      "val": "2",
      "offset": 73
    },
    {
      "val": "12",
      "offset": 83
    }
  ],
  "location": "HorasLibresSteps.que_el_empleado_del_equipo_cargo_horas(int,int,int,int)"
});
formatter.result({
  "duration": 242665,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 46
    }
  ],
  "location": "HorasLibresSteps.se_aplica_el_filtro_por_equipo(int)"
});
formatter.result({
  "duration": 133629,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 60
    }
  ],
  "location": "HorasLibresSteps.se_mostrará_el_detalle_de_las_horas_del_empleado(int)"
});
formatter.result({
  "duration": 199774,
  "status": "passed"
});
});