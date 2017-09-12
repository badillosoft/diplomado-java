# Ejercicios Básicos en Java

Por Alan Badillo Salas badillo.soft@hotmail.com

## Ejercicios anteriores

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

## Copiar los valores de un arreglo

Dado un arreglo `A`, crear un arreglo `B` del mismo tamaño y copiar elemento por elemento del arreglo `A` al `B` en las mismas posiciones.

> Ejemplo:

~~~txt
A: 3 2 6 5 8 7 1 6 5 4 9 8
B: 3 2 6 5 8 7 1 6 5 4 9 8
~~~

## Invertir un arreglo

Dado un arreglo `A`, crear un arreglo `B` del mismo tamaño y copiar elemento por elemento del arreglo `A` al `B` en las posiciones inversas, es decir, primer índice posible `0` debe colocarse en el último índice posible `A.length - 1`, el segundo índice en el penúltimo y así. Puedes hacer `n = A.length - 1` y seguir la regla `B[i] = A[n - i]`.

> Ejemplo:

~~~txt
A: 3 2 6 5 8 7 1 6 5 4 9 8
B: 8 9 4 5 6 1 7 8 5 6 2 3
~~~

## Dividir un arreglo

Dado un arreglo `A` y un número `p` llamado el `pivote`, necesitamos cortar el arreglo `A` en dos arreglos `L` y `R` tal que el arreglo `L` tenga los valores de `A` desde el índice `0` hasta el índice `p` y los valores de `R` tengan los valores de `A` desde el ìndice `p + 1` hasta el índice `A.length - 1`. El tamño de `L` es `p + 1` y el tamaño de `R` es `A.length - (p + 1)`. Crea los arreglos `L` y `R` con sus respectivos tamaños y llenalos con los elementos de `A`. Hint: para `L` tenemos `L[i] = A[i] (0 <= i <= p)`, para `R` tenemos `R[i - (p + 1)] = A[i] (p + 1 <= i < A.length)`.

> Ejemplo:

~~~txt
A: 3 2 6 5 8 7 1 6 5 4 9 8
p: 4
L: 3 2 6 5 8
R: 7 1 6 5 4 9 8
~~~

## Unir dos arreglos

Dado un arreglo `A` y un arreglo `B`, crear un arreglo `C` que tenga el tamaño de lo que mida `A` más lo que mida `B`. Los elementos de `C` equivalen a los elementos de `A` en las primeras posiciones y los de `B` en las siguientes hasta llenarse con ambos.

> Ejemplo:

~~~txt
A: 1 5 3 4 6 2
B: 8 3 2 6 5 9 0 1
C: 1 5 3 4 6 2 8 3 2 6 5 9 0 1
~~~
