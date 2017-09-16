# Ejercicios Básicos en Java

Por Alan Badillo Salas badillo.soft@hotmail.com

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