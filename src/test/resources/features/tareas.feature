# language: es
Característica: representar asignacion de tareas

Escenario: Se le quiere asignar una tarea ocupada a un empelado
    Dado que tengo la "tarea1" "ocupada"
    Cuando se la asigna al "empleado1"
    Entonces la "tarea1" no queda asignada al "empleado1".

Escenario: Se le quiere asignar una tarea libre a un empelado que esta asignado al proyecto
    Dado que el "empleado1" esta asignado al "proyecto1"
    Cuando se le asigna la "tarea1" "libre" del "proyecto1" al "empleado1"
    Entonces la "tarea1" queda asignada al "empleado1".

Escenario: Se le quiere asignar una tarea libre a un empelado que no esta asignado al proyecto
    Dado que el "empleado1" esta asignado al "proyecto2"
    Cuando se le asigna la "tarea1" "libre" del "proyecto1" al "empleado1"
    Entonces la "tarea1" no queda asignada al "empleado1".

Escenario: Se le quiere asignar una tarea libre de otra iteracion a un empelado
    Dado que el "empleado1" esta asignado a el "proyecto1" en la "iteracion2"
    Cuando se le asigna la "tarea1" "libre" de la "iteracion1" a el "empleado1"
    Entonces la "tarea1" no queda asignada al "empleado1".

Escenario: Se le quiere asignar una tarea libre de la iteracion actual a un empelado
    Dado que el "empleado1" esta asignado a el "proyecto1" en la "iteracion2"
    Cuando se le asigna la "tarea1" "libre" de la "iteracion2" a el "empleado1"
    Entonces la "tarea1" queda asignada al "empleado1".

Escenario: Se le quiere asignar una tarea libre a un empelado que no tiene habilidades para resolverla
    Dado que el "empleado1" que no tiene la habilidad "JAVA"
    Cuando se le asigna la "tarea1" "libre" que requiere la habilidad "JAVA" al "empleado1"
    Entonces la "tarea1" no queda asignada al "empleado1".


Escenario: Se le quiere asignar una tarea libre a un empelado que tiene habilidades para resolverla
    Dado que el "empleado1" que tiene la habilidad "JAVA"
    Cuando se le asigna la "tarea1" "libre" que requiere la habilidad "JAVA" al "empleado1"
    Entonces la "tarea1" queda asignada al "empleado1".