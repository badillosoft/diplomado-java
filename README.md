# Diplomado Java (Módulos I y II)

Intructor: Alan Badillo Salas badillo.soft@hotmai.com

Bienvenidos al diplomado de Java

## Enlaces

### Descargar Java SE 8u111 con Netbeans 8.2
> http://www.oracle.com/technetwork/es/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html

### Documentación oficial de Java
> https://docs.oracle.com/javase/tutorial/

### Presentaciones
> https://slides.com/alanbadillosalas/fundamentos-de-java-sesion-1/

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

## Ejercicios

* Crea una variable de cada tipo con valores dados e imprimelos en la pantalla usando formato de cadenas con `printf` como en el siguiente ejemplo:

~~~java
...
double x = 123.45;
...
System.out.printf("X: %f", x);
~~~

* Crea un programa que solicite de la entrada estándar las variables `a` y `b` que son dos números reales que representan el intervalo cerrado `[a, b]`. Luego solicite `x` también real e imprima `"x está en [a, b]"` o `"x no está en [a, b]"`, dependiendo si `x` pertenece o no al intervalo `[a, b]`.

* El siguiente programa genera los primeros `n` números de Fibonacci, sin embargo, faltan líneas de código para funcionar.

~~~java
class Main {
  public static void main(String[] args) {
    int n = 10;
    int a = 1, b = 1, c;
    System.out.printf("%d %d ", a, b);
    for (int i = 2; i < n; i++) {
      c = a + b;
      // TODO: Asigna el valor de `b` a `a` y el de `c` a `b` en ese orden
      // TODO: Imprime el valor de `c` y un espacio
    }
    System.out.println();
  }
}
~~~

> https://repl.it/K5lt/0

* En el siguiente ejemplo https://repl.it/K5m1/0 se muestra un programa que imprime si un número es par o impar. Investiga como funciona el operador `condición ? exprV : exprF` conocido como el operador condicional, que actua como un `if-else` para asignar variables.

* Crea un programa que imprima tus iniciales (la primer letra de nombre y apellidos) mediante asteriscos como en el siguiente ejemplo

~~~txt
  ****    ****     ******
 **  **   **  *    **
********  *****    ******
**    **  **   *       **
**    **  ******   ******
~~~

* Modifica el programa https://repl.it/K5os/0 para que dado el valor de dado, el programa indique cual es su cara opuesta (nota: la suma de la cara más su opuesta siempre es 7).

* Modifica el programa de los dados https://repl.it/K5os/0 para mostrar el valor de lanzar el dado dos veces y su suma.

* Crea un programa que le pida el nombre al usuario y lo salude, por ejemplo: `Hola BATAMAN, buenos días`. Investiga como convertir a mayúsculas para mostrar el resultado así.

* Crea un programa que pida el número de huevos en una caja e indique cuántas docenas tiene y cuántos huevos sueltos. Por ejemplo, si el usuario ingresa `128` el programa debe decir: `tienes 10 docenas y 8 huevos`. Si `n` es el número de huevos, entonces el número de docenas es la parte entera de `n / 12` y los sobrantes son `n % 12`.
