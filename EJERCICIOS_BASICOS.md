# Ejercicios Medios en Java

Por Alan Badillo Salas badillo.soft@hotmail.com

## Copiar los valores de un arreglo

Dado un arreglo `A`, crear un arreglo `B` del mismo tamaño y copiar elemento por elemento del arreglo `A` al `B` en las mismas posiciones.

## Invertir un arreglo

Dado un arreglo `A`, crear un arreglo `B` del mismo tamaño y copiar elemento por elemento del arreglo `A` al `B` en las posiciones inversas, es decir, primer índice posible `0` debe colocarse en el último índice posible `A.length - 1`, el segundo índice en el penúltimo y así. Puedes hacer `n = A.length - 1` y seguir la regla `B[i] = A[n - i]`.

## Dividir un arreglo

Dado un arreglo `A` y un número `p` llamado el `pivote`, necesitamos cortar el arreglo `A` en dos arreglos `L` y `R` tal que el arreglo `L` tenga los valores de `A` desde el índice `0` hasta el índice `p` y los valores de `R` tengan los valores de `A` desde el ìndice `p + 1` hasta el índice `A.length - 1`. El tamño de `L` es `p + 1` y el tamaño de `R` es `A.length - (p + 1)`. Crea los arreglos `L` y `R` con sus respectivos tamaños y llenalos con los elementos de `A`. Hint: para `L` tenemos `L[i] = A[i] (0 <= i <= p)`, para `R` tenemos `R[i - (p + 1)] = A[i] (p + 1 <= i < A.length)`.