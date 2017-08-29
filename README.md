# Diplomado Java (Módulos I y II)

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
