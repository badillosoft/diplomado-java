# Ejercicios Básicos en Java - Arreglos

Por Alan Badillo Salas badillo.soft@hotmail.com

## Clase Jugador

La clase `Jugador` debería contener la información del jugador, por ejemplo, si es su turno, su nombre, un método para tirar los dados que devuelva la suma de los dados tirados aleatoriamente. También se debería marcar cuál es la casilla en la que se encuentra (doble referencia).

~~~txt
+--------------------------------+
| Clase: Jugador                 |
+--------------------------------+
| nombre: String                 |
| enTurno: boolean               |
| casillaActual: Casilla         |
+--------------------------------+
| tirarDados(): int              |
+--------------------------------+
~~~

## Clase Casilla

La clase `Casilla` debería almacenar la información de los jugadores dentro de la casilla, también proveer un método que indique cual es la siguiente casilla en el caso de que se caiga en la casilla con determinado valor de los dados (en una casilla normal el jugador cae en la casilla y avanza un número dado de casillas según el valor de los dados, en una casilla especial la casilla apuntaría a la cabeza de la serpiente o al final de la escalera sin importar el valor de los dados). Para esto hay que indicar que tipo de casilla es: "normal", "avanza_2", "avanza_n", "regresa_2", "regresa_n", "cabeza_serpiente", "cola_serpiente", "inicio_escalera", "fin_escalera". En caso de ser serpíente o escalera debemos almacenar la información de la serpiente y escalera.

~~~txt
+-----------------------------------+
| Clase: Casilla                    |
+-----------------------------------+
| juagdores: List<Jugador>          |
| tipo: String                      |
| serpiente: Serpiente?             |
| escalera: Escalera?               |
+-----------------------------------+
| colocarJugador(Jugador j, int n)  |
+-----------------------------------+
~~~