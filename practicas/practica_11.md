# Práctica XI - Línea dinámica

Hay veces en los que necesitamos mezclar la interfaz gráfica tradicional con una interfaz personalizada. Supongamos por ejemplo que deseamos dibujar una recta que va del punto `(x1, y1)` al punto `(x2, y2)`. Lo que haríamos sería poner cuatro atributos de la clase `JPanel` y sobreescribir su método `paint(Graphics g)` para poder dibujar la línea mediante `drawLine(...)`. Lo siguiente sería proponer métodos públicos llamdos `setX1`, `setY1` y así sucesivamente para poder modificar dichos atributos y mover la línea de un lado a otro fuera del panel. Finalmente dichos valores pueden ser obtenidos desde cajas de texto ingresadas por el usuario que manden a llamar respectivamente a cada método.

## Problemas

* Crea un `JPanel` en el proyecto.

* Agrega cuatro atributos públicos de tipo entero llamados `x1`, `x2`, `y1`, `y2`.

* Modifica el método `paint` para dibujar una línea del punto `(x1, y1)` al punto `(x2, y2)`.

* Crea un JFrame con cuatro cajas de texto `txt_x1` y así sucesivamente y agrega también el `JPanel` que dibuja la línea.

* En el evento `keyReleased` de cada caja ajusta los atributos `x1`, `x2`, `y1`, `y2` según corresponda. **Nota: Llama al método `repaint()` del `JPanel`**

* Cambia la línea a color rojo.

<br><br>
<hr>
<small>
Diplomado de Java - Alan Badillo Salas (badillo.soft@hotmail.com)<br>
Instituto Politécnico Nacional - Centro de Investigación en Cómputo
</small>