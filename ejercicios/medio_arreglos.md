# Ejercicios Medios en Java

Por Alan Badillo Salas badillo.soft@hotmail.com

## Ceder el paso

En dos arreglos `N` y `O` se han dispuesto los id's de diferentes carros que necesitan continuar su trayecto recto, los carros de `N` van hacia el norte y los de `O` van hacia el oeste, por lo que sus autopistas se cruzan. 

### Problema 1

Se requiere un programa que dado un arreglo `X` determine si todos sus elementos son únicos. Para esto puede tomar el primer elemento, recorrer todos los demás y si el elemento es igual que alguno de sus siguientes entonces regresar `falso`, de otra forma regresar `verdadero` como se muestra en el siguiente pseudocódigo:

~~~txt
Entrada: X <Arreglo de números>
Salida: <Booleano> # Devuelve si X tiene elementos únicos

Inicio:
Para i desde 1 hasta |X|:
	Para j dese i + 1 hasta |X|:
		Si X[i] es igual X[j]:
			regresar FALSO
regresar VERDADERO
~~~

Implementa en una función llamada `boolean unico(int[] X)` el algoritmo anterior (dentro de alguna clase por ejemplo `Problema1`).

Basado en los ejercicios básicos calcula el arreglo equivalente a unir `N` y `O`, luego determina si la unión es única mediante la función `unico(...)`.

> Ejemplos

~~~txt
N: 1 4 3 2
O: 6 8 5 2 1
X: 1 4 3 2 6 8 5 2 1 # La unión de N y O
unico(X): false
~~~

~~~txt
N: 1 4 3 2
O: 6 8 5 9 0
X: 1 4 3 2 6 8 5 9 0 # La unión de N y O
unico(X): true
~~~

### Problema 2

Crea un arreglo dados `N` y `O` de tal forma que tome un elemento de cada uno, empezando por `N`. Los siguientes elementos serán del arreglo de mayor tamaño. Llama `A` el arreglo alternado.

> Ejemplos

~~~txt
N: 1 4 3 2
O: 6 8 5 9 0
A: 1 6 4 8 3 5 2 9 0
~~~

~~~txt
N: 1 4 3 2 7 9 3
O: 6 8 5 9 0
A: 1 6 4 8 3 5 2 9 7 0 9 3
~~~

Observa que el arreglo `A` guarda la información de como deberían cruzar los carros, primero el carro `1`, luego el `6` y así sucesivamente, esto es muy útil para simular un tráfico ideal e indicarle a cada auto cuando avanzar.
