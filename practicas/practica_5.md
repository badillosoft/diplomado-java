# Práctica IV - Contador Minutos / Segundos

Se requiere una aplicación que simule un contador tradicional de minutos y segundos, para esto necesitaremos un _label_ que muestre en el formato adecuado cuántos minutos y segundos van, por ejemplo `16:32` representaría 16 minutos y 32 segundos. También necesitaremos un botón para incrementar en un segundo y otro botón para incrementar en un minuto. Recuerda que si los segundos llegan a 60, estos deberán colocarse a 0 otra vez. No es necesario que los segundos incrementen a los minutos (es opcional) dado que lo único que se requiere es poder ajustar una hora en específico.

## Pasos para resolver la práctica

* Coloca un `JLabel` y dos `JButton` tomando en cuenta que deben estar centrados posibles a cualquier tamaño de ventana.

* Ajusta las propiedades del `JLabel` para mostrar `00:00` y de los botones para que digan `+ Min` y `+ Sec`.

* Crear dos atributos de tipo entero en la clase asociada a la ventana llamados `secs` y `mins`.

* Controla el evento `mouseClicked` de ambos botones, en el de segundos haz `secs++` y en el de minutos `mins++`. En ambos métodos manda a llamar un método llamado `updateClock()`.

* Crea el método `void updateClock();` que ajuste el texto del _label_ con el formato adecuado de los minutos y segundos, algo así `jLabel1.setText(String.format("%2d:%2d", mins, secs));`.

* Ejecuta el programa y verifica que funcione correctamente.

* Agrega las condiciones necesarias para que cuando se realice `secs++` se verifique que si `secs >= 60` entonces `secs = 0`. Lo mismo para `mins`.

* Vuelve ejecutar y saca CAPTURA con el reloj ajustado en `16:32`.

## Problemas

* Modifica tu programa agregando los botones `- Mins` y `- Secs` con la funcionalidad correcta. Toma en cuenta que si `secs < 0` entonces `secs = 59`. Lo mismo para mins.

* Explica (escrito) qué se necesita para ahora tener horas, minutos y segundos. Justifica bien tu argumento, es decir, indicar que variables extras se necesitan, en que partes se aumenta código y que tipo de código.

> __Nota:__ Comprime tu proyecto en `ZIP` (no `RAR`, no `7z`, no otros) y guardalo en una memoria USB o envíalo a tu correo. Las prácticas deberás entregarlas a más tardar antes de la siguiente clase de viernes (una semana máximo) al correo `badillo.soft@hotmail.com` con el asunto `Práctica I - <TU PRIMER NOMBRE Y PRIMER APELLIDO>`.

> __Nota:__ En el mismo archivo comprimido `ZIP` deberás adjuntar un archivo `<TU PRIMER NOMBRE Y PRIMER APELLIDO>.txt` que contenga las respuestas que se piden como texto (como la lista de las 5 propiedades con su descripción). En caso de no solicitar respuestas escritas deberás crear igualmente el archivo pero dejarlo vacío. Si se requieren capturas de pantalla, deberás adjuntarlas en una carpeta llamada `capturas`.

> __Nota:__ En caso de no seguir estas instrucciones la práctica no será recibida hasta el final del curso con un puntaje del `50%` solamente. La suma total de cada práctica es de `100 puntos` distribuidos por número de incisos sin importar si uno es más díficil que otro.

### Diplomado de Java - Alan Badillo Salas (badillo.soft@hotmail.com)

### Instituto Politécnico Nacional - Centro de Investigación en Cómputo