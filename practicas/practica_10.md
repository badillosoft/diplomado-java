# Práctica X - Dibujando con Graphics

Casi todos los controles de *Swing* pueden sobrecargar el método `paint(Graphics g)` que nos permitirá pintar primitivas y algunas otras cosas sobre el control. Lo más usual es crear un `JPanel` y sobreescribir dicho método para pintar cosas en él.

## Pintar un rectángulo sobre un `JPanel`

Para pintar sobre el lienzo (canvas) del `JPanel` debemos crear una clase derivada de `JPanel` en nuestro proyecto dando clic en `JPanel Form...`. Una vez hecho esto recurrimos al código de la clase sobreescribirmos el siguiente método:

~~~java
...
public class Hello extends javax.swing.JPanel {
    ...
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
    ...
}
~~~

Esto nos permitirá acceder al objeto de la clase `Graphics` llamado `g`, el cual posee diversos métodos que nos permitirán dibujar primitivas sobre el panel, por ejemplo, para dibujar un rectángulo en la posición `(0, 0)` con `200` pixeles de ancho y `100` de alto:

~~~java
@Override
public void paint(Graphics g) {
    super.paint(g);
    g.drawRect(0, 0, 200, 100);
}
~~~

Existen otros métodos que nos permitirán trazar arcos, líneas, imágenes o ajustar el color de trazo, de relleno, entre otros.

## Problemas

* Crea un `JPanel` en el proyecto.

* Agrega al menos 10 rectángulos en las posiciones y tamaños que desees.

* Crea un `JFrame` y agrega dos veces el panel desde la paleta.

* Cambia el color de cada rectángulo mediante la clase `Color` y el método `g.setColor`.

* Cambia `drawRect` por `fillRect`.

<br><br>
<hr>
<small>
Diplomado de Java - Alan Badillo Salas (badillo.soft@hotmail.com)<br>
Instituto Politécnico Nacional - Centro de Investigación en Cómputo
</small>