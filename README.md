# Diplomado Java (Módulos I y II)

Intructor: Alan Badillo Salas badillo.soft@hotmai.com

Bienvenidos al diplomado de Java

## Enlaces

### Descargar Java SE 8u111 con Netbeans 8.2

> http://www.oracle.com/technetwork/es/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html

### Documentación oficial de Java

> https://docs.oracle.com/javase/tutorial/

### Tutorial de Java Online

> http://www.learnjavaonline.org/en/

### Tutoriales de Spring

> http://spring.io/guides/gs/rest-service/

> http://spring.io/guides/gs/validating-form-input/

### Presentaciones

> https://slides.com/alanbadillosalas/fundamentos-de-java-sesion-1/

> http://slides.com/alanbadillosalas/fundamentos-de-java-sesion-1-9/fullscreen

> https://slides.com/alanbadillosalas/javaiostreams/

## Videos

> Sesión Extra 1 - https://youtu.be/6tPCNaSvWC0

> Sesión Extra 2 - https://youtu.be/POhPIkz0YdM

> Sesión Extra 3 - https://youtu.be/dGg0qUt3am

> Sesión Extra 4 - https://youtu.be/nVlF0a9NVuk

### Grupo WhatsApp 

https://chat.whatsapp.com/2acSx0BKYmcLKqejsVo9BU

## Tareas

* Crear una clase llamada `Calculadora` que posea el atributo `resultado: double` que almacena el último resultado computado. Crea 4 métodos `suma(a: double, b: double): double` que devuelva la suma de `a` y `b`, lo mismo para `resta(a: double, b: double): double`, `multiplicacion(a: double, b: double): double` y `division(a: double, b: double): double`. No olvides actualizar el atributo resultado en cada operación antes de devolverlo.

* El juego llamado `Serpientes y Escaleras` consiste en un tablero en el que se han dispuesto casillas de la 0 a la 49 en 10 filas, cada fila se compone de 10 casillas a la vez, las casillas se numeran de la siguiente forma: en las filas pares las casillas van de izquierda a derecha en forma creciente, en las filas pares las casillas se numeran de derecha a izquierda como se muestra en el siguiente ejemplo:

~~~txt
40 41 42 43 44 45 46 47 48 49
39 38 37 36 35 34 33 32 31 30
20 21 22 23 24 25 26 27 28 29
19 18 17 16 15 14 13 12 11 10
00 01 02 03 04 05 06 07 08 09
~~~

Dentro del tablero se han dispuesto `serpientes` y `escaleras`. Una serpiente tiene su cola en una casilla superior y su cabeza en otra casilla inferior de menor valor, cuando un jugador cae en una casilla superior donde hay una serpiente, este cae a la casila inferior (donde apunta la cabeza). Por el contrario, una escalera, está ubicada en una casilla inferior y termina en una casilla superior, si el jugador cae en la casilla inferior donde hay una escalera, sube automáticamente a la casilla superior.

Los jugadores empiezan en la casilla `00` y se encolan en turnos, primero el jugador 1, luego el juagador 2 y así sucesivamente. En cada turno el jugador tira dos dados y avanza la suma de los dados, siguiendo las reglas de las casillas (si hay serpiente cae y si hay escalera sube). El primer jugador en llegar a la casilla `49` gana (en esta casilla no puede haber ni serpientes ni escaleras).

En el caso que el jugador se encuentre cerca de la casilla `49` y se pase por ejemplo 4 casillas (a la casilla `53` que obviamente no existe), se descontarán los tiros restantes de `53 - 49 = 4` y llegará a la casilla ubicada en `49` menos las movidas hacia atrás en este caso `49 - 4 = 45` llegando a la casilla `45`.

Si lo desea puede pensar en una forma de asignar a cada casilla reglas especiales, por ejemplo, `Avanzar el resultado de tirar un dado`, `Retroceder el resultado de tirar un dado`, `Ve a la siguiente escalera`, `ve a la siguiente serpiernte`.

En la siguiente ruta `PROXIMAMENTE :v` se encuentra el código casi completo de serpientes y escaleras. La tarea es completar el proyecto resolviendo los códigos faltantes indicados en los //TODO.
