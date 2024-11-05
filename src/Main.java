/*
En una carrera de mountainbike es posible ir desde la meta hasta la llegada combinando recorridos.
El ciclista antes de largar la carrera debe elegir los recorridos que más le gusten.
De los recorridos se conoce la distancia que abarca medida en kilómetros.
Existen tres tipos de recorridos clasificados según su complejidad: fácil, intermedia y avanzada.
-Los recorridos intermedios tienen un indicador para saber si están en una pendiente ascendente o descendente.
-Los recorridos avanzados presentan una cantidad de obstáculos.

*   Recorrido fácil: el tiempo estimado para recorrerlo se calcula como distancia/30. El puntaje es 2 * distancia.

*   Recorrido intermedio: el tiempo estimado para recorrerlo se calcula como distancia/25 * índice.
    Donde el índice es 1.5 si el recorrido es una pendiente hacia arriba y 0.5 si es una pendiente descendente.
    El puntaje de este recorrido es 1 + índice.

*   Recorrido avanzado: el tiempo estimado para recorrerlo es distancia/20 * obstáculos.
    El puntaje se obtiene de multiplicar 0.5 por distancia.

A partir de lo anteriormente enunciado, se pide:

Obtener los ciclistas de la carrera cuyo puntaje supere los 30 puntos.
El puntaje de un ciclista es la suma de los puntajes de los recorridos que eligió.
El ciclista que tenga el mayor tiempo estimado.
El tiempo estimado de un ciclista es la suma de los tiempos estimados de los recorridos que eligió.
Determinar si algún ciclista terminará su recorrido en menos de 2 hs.
Para dicho cálculo se tiene en cuenta su velocidad promedio y la distancia total que debe recorrer
(la suma de las distancias de los recorridos que eligió).



Segunda Parte

Ahora la Unipe creció y tiene más de dos sedes y decidió organizar el “Tour Unipe”.
El mismo consiste en un conjunto de carreras al estilo Tour de France y cada sede presenta a sus ciclistas.

El Tour Unipe quiere conocer:
La sede ganadora: Es la que tiene el o la participante con mayor puntaje total.
Se quiere conocer el participante ganador del torneo

Pregunta bonus:

Ahora cada ciclista puede ser “principiante” o “experto”.
Los ciclistas expertos ven su puntaje multiplicado por una constante menor a 1.
Esto se hace a forma de aplicar cierto handicap para poder balancear las competencias.

 */
