$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("tareas.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "representar asignacion de tareas",
  "description": "",
  "id": "representar-asignacion-de-tareas",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Se le quiere asignar una tarea ocupada a un empelado",
  "description": "",
  "id": "representar-asignacion-de-tareas;se-le-quiere-asignar-una-tarea-ocupada-a-un-empelado",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que tengo la \"tarea1\" \"ocupada\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "se la asigna al \"empleado1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "la \"tarea1\" no queda asignada al \"empleado1\".",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 14
    },
    {
      "val": "ocupada",
      "offset": 23
    }
  ],
  "location": "TareasSteps.que_tengo_la_tarea_estado(String,String)"
});
formatter.result({
  "duration": 160485131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "empleado1",
      "offset": 17
    }
  ],
  "location": "TareasSteps.se_la_asigna_a_al_empleado(String)"
});
formatter.result({
  "duration": 781733,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 4
    },
    {
      "val": "empleado1",
      "offset": 34
    }
  ],
  "location": "TareasSteps.la_tarea_no_queda_asignada_al_empleado(String,String)"
});
formatter.result({
  "duration": 2435156,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Se le quiere asignar una tarea libre a un empelado que esta asignado al proyecto",
  "description": "",
  "id": "representar-asignacion-de-tareas;se-le-quiere-asignar-una-tarea-libre-a-un-empelado-que-esta-asignado-al-proyecto",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que el \"empleado1\" esta asignado al \"proyecto1\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "se le asigna la \"tarea1\" \"libre\" del \"proyecto1\" al \"empleado1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "la \"tarea1\" queda asignada al \"empleado1\".",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "empleado1",
      "offset": 8
    },
    {
      "val": "proyecto1",
      "offset": 37
    }
  ],
  "location": "TareasSteps.que_el_empleado_esta_asignado_al_proyecto(String,String)"
});
formatter.result({
  "duration": 121244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 17
    },
    {
      "val": "libre",
      "offset": 26
    },
    {
      "val": "proyecto1",
      "offset": 38
    },
    {
      "val": "empleado1",
      "offset": 53
    }
  ],
  "location": "TareasSteps.se_le_asigna_la_tarea_libre_del_proyecto_al_empleado(String,String,String,String)"
});
formatter.result({
  "duration": 265955,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 4
    },
    {
      "val": "empleado1",
      "offset": 31
    }
  ],
  "location": "TareasSteps.la_tarea_queda_asignada_al_empleado(String,String)"
});
formatter.result({
  "duration": 110489,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Se le quiere asignar una tarea libre a un empelado que no esta asignado al proyecto",
  "description": "",
  "id": "representar-asignacion-de-tareas;se-le-quiere-asignar-una-tarea-libre-a-un-empelado-que-no-esta-asignado-al-proyecto",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 15,
  "name": "que el \"empleado1\" esta asignado al \"proyecto2\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "se le asigna la \"tarea1\" \"libre\" del \"proyecto1\" al \"empleado1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 17,
  "name": "la \"tarea1\" no queda asignada al \"empleado1\".",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "empleado1",
      "offset": 8
    },
    {
      "val": "proyecto2",
      "offset": 37
    }
  ],
  "location": "TareasSteps.que_el_empleado_esta_asignado_al_proyecto(String,String)"
});
formatter.result({
  "duration": 132000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 17
    },
    {
      "val": "libre",
      "offset": 26
    },
    {
      "val": "proyecto1",
      "offset": 38
    },
    {
      "val": "empleado1",
      "offset": 53
    }
  ],
  "location": "TareasSteps.se_le_asigna_la_tarea_libre_del_proyecto_al_empleado(String,String,String,String)"
});
formatter.result({
  "duration": 149111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 4
    },
    {
      "val": "empleado1",
      "offset": 34
    }
  ],
  "location": "TareasSteps.la_tarea_no_queda_asignada_al_empleado(String,String)"
});
formatter.result({
  "duration": 61111,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Se le quiere asignar una tarea libre de otra iteracion a un empelado",
  "description": "",
  "id": "representar-asignacion-de-tareas;se-le-quiere-asignar-una-tarea-libre-de-otra-iteracion-a-un-empelado",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 20,
  "name": "que el \"empleado1\" esta asignado a el \"proyecto1\" en la \"iteracion2\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "se le asigna la \"tarea1\" \"libre\" de la \"iteracion1\" a el \"empleado1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 22,
  "name": "la \"tarea1\" no queda asignada al \"empleado1\".",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "empleado1",
      "offset": 8
    },
    {
      "val": "proyecto1",
      "offset": 39
    },
    {
      "val": "iteracion2",
      "offset": 57
    }
  ],
  "location": "TareasSteps.que_el_empleado_esta_asignado_a_el_proyecto_en_la_iteracion(String,String,String)"
});
formatter.result({
  "duration": 171112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 17
    },
    {
      "val": "libre",
      "offset": 26
    },
    {
      "val": "iteracion1",
      "offset": 40
    },
    {
      "val": "empleado1",
      "offset": 58
    }
  ],
  "location": "TareasSteps.se_le_asigna_la_tarea_estado_de_la_iteracion_a_el_empleado(String,String,String,String)"
});
formatter.result({
  "duration": 180889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 4
    },
    {
      "val": "empleado1",
      "offset": 34
    }
  ],
  "location": "TareasSteps.la_tarea_no_queda_asignada_al_empleado(String,String)"
});
formatter.result({
  "duration": 103645,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Se le quiere asignar una tarea libre de la iteracion actual a un empelado",
  "description": "",
  "id": "representar-asignacion-de-tareas;se-le-quiere-asignar-una-tarea-libre-de-la-iteracion-actual-a-un-empelado",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 25,
  "name": "que el \"empleado1\" esta asignado a el \"proyecto1\" en la \"iteracion2\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 26,
  "name": "se le asigna la \"tarea1\" \"libre\" de la \"iteracion2\" a el \"empleado1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 27,
  "name": "la \"tarea1\" queda asignada al \"empleado1\".",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "empleado1",
      "offset": 8
    },
    {
      "val": "proyecto1",
      "offset": 39
    },
    {
      "val": "iteracion2",
      "offset": 57
    }
  ],
  "location": "TareasSteps.que_el_empleado_esta_asignado_a_el_proyecto_en_la_iteracion(String,String,String)"
});
formatter.result({
  "duration": 183333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 17
    },
    {
      "val": "libre",
      "offset": 26
    },
    {
      "val": "iteracion2",
      "offset": 40
    },
    {
      "val": "empleado1",
      "offset": 58
    }
  ],
  "location": "TareasSteps.se_le_asigna_la_tarea_estado_de_la_iteracion_a_el_empleado(String,String,String,String)"
});
formatter.result({
  "duration": 122223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 4
    },
    {
      "val": "empleado1",
      "offset": 31
    }
  ],
  "location": "TareasSteps.la_tarea_queda_asignada_al_empleado(String,String)"
});
formatter.result({
  "duration": 112933,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Se le quiere asignar una tarea libre a un empelado que no tiene habilidades para resolverla",
  "description": "",
  "id": "representar-asignacion-de-tareas;se-le-quiere-asignar-una-tarea-libre-a-un-empelado-que-no-tiene-habilidades-para-resolverla",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 30,
  "name": "que el \"empleado1\" que no tiene la habilidad \"JAVA\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 31,
  "name": "se le asigna la \"tarea1\" \"libre\" que requiere la habilidad \"JAVA\" al \"empleado1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 32,
  "name": "la \"tarea1\" no queda asignada al \"empleado1\".",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "empleado1",
      "offset": 8
    },
    {
      "val": "JAVA",
      "offset": 46
    }
  ],
  "location": "TareasSteps.que_el_empleado_que_no_tiene_la_habilidad(String,String)"
});
formatter.result({
  "duration": 282578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 17
    },
    {
      "val": "libre",
      "offset": 26
    },
    {
      "val": "JAVA",
      "offset": 60
    },
    {
      "val": "empleado1",
      "offset": 70
    }
  ],
  "location": "TareasSteps.se_le_asigna_la_tarea_estado_que_requiere_la_habilidad(String,String,String,String)"
});
formatter.result({
  "duration": 198978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 4
    },
    {
      "val": "empleado1",
      "offset": 34
    }
  ],
  "location": "TareasSteps.la_tarea_no_queda_asignada_al_empleado(String,String)"
});
formatter.result({
  "duration": 114400,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Se le quiere asignar una tarea libre a un empelado que tiene habilidades para resolverla",
  "description": "",
  "id": "representar-asignacion-de-tareas;se-le-quiere-asignar-una-tarea-libre-a-un-empelado-que-tiene-habilidades-para-resolverla",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 36,
  "name": "que el \"empleado1\" que tiene la habilidad \"JAVA\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 37,
  "name": "se le asigna la \"tarea1\" \"libre\" que requiere la habilidad \"JAVA\" al \"empleado1\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 38,
  "name": "la \"tarea1\" queda asignada al \"empleado1\".",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "empleado1",
      "offset": 8
    },
    {
      "val": "JAVA",
      "offset": 43
    }
  ],
  "location": "TareasSteps.que_el_empleado_que_tiene_la_habilidad(String,String)"
});
formatter.result({
  "duration": 146666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 17
    },
    {
      "val": "libre",
      "offset": 26
    },
    {
      "val": "JAVA",
      "offset": 60
    },
    {
      "val": "empleado1",
      "offset": 70
    }
  ],
  "location": "TareasSteps.se_le_asigna_la_tarea_estado_que_requiere_la_habilidad(String,String,String,String)"
});
formatter.result({
  "duration": 164267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tarea1",
      "offset": 4
    },
    {
      "val": "empleado1",
      "offset": 31
    }
  ],
  "location": "TareasSteps.la_tarea_queda_asignada_al_empleado(String,String)"
});
formatter.result({
  "duration": 77244,
  "status": "passed"
});
});