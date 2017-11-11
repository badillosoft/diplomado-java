# Práctica XIII - Instrucciones MySQL

A continuación se listan algunas instrucciones *MySQL* para realizar diversas operaciones.

Puedes consultar la sintaxis completa de los comandos en: https://dev.mysql.com/doc/refman/5.7/en/create-database.html

También ingresa al tutorial de *W3Schools*: https://www.w3schools.com/sql/default.asp

## Operaciones sobre tablas

> Crear una tabla

~~~sql
CREATE TABLE IF NOT EXISTS usuarios (
  id_usuarios INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(40) NOT NULL,
  apellido_p VARCHAR(40) NOT NULL
);
~~~

> Alterar una tabla (agregar campos)

~~~sql
ALTER TABLE usuarios
  ADD COLUMN apellido_m VARCHAR(40) NOT NULL,
  ADD COLUMN otro VARCHAR(40) NOT NULL
;
~~~

> Alterar una tabla (quitar campos)

~~~sql
ALTER TABLE usuarios
  DROP COLUMN otro
;
~~~

> Eliminar una tabla

~~~sql
DROP TABLE IF EXISTS usuarios;
~~~

## Insertar registros en una tabla

~~~sql
INSERT INTO USUARIOS (nombre, apellido_p, apellido_m) VALUES
("Ana", "Bae", "Cae"),
("Beto", "Cero", "Dedo"),
("Carla", "Ene", "Fao"),
("Diego", "Guo", "Hio")
;
~~~

## Buscar registros en una tabla

> Buscar todos los registros con todos los campos

~~~sql
SELECT * FROM usuarios;
~~~

> Buscar todos los registros con algunos campos

~~~sql
SELECT nombre, apellido_p FROM usuarios;
~~~

> Buscar todos los campos con una condición entera

~~~sql
SELECT * FROM usuarios WHERE id_usuarios > 1 AND id_usuarios <= 3;
~~~

> Buscar todos los campos con una condición en texto (empiezan con 'b')

~~~sql
SELECT * FROM usuarios WHERE nombre LIKE 'b%';
~~~

> Buscar todos los campos con una condición en texto (terminan con 'b')

~~~sql
SELECT * FROM usuarios WHERE nombre LIKE '%b';
~~~

> Buscar todos los campos con una condición en texto (continen 'b')

~~~sql
SELECT * FROM usuarios WHERE nombre LIKE '%b%';
~~~

## Actualizar registros en una tabla

~~~sql
UPDATE usuarios
SET apellido_p='Foo', apellido_m='Bar'
WHERE nombre LIKE 'b%';
~~~

## Eliminar registros en una tabla

~~~sql
DELETE FROM usuarios
WHERE id_usuarios > 3;
~~~

## Problemas

* Crear una tabla llamada productos con los campos `nombre`, `descripcion`, `costo`, `costo_unitario`, `creacion`, `modificacion`, `existencias`, `bloqueado`. Busca sus tipos de datos correctos y consulta como poner la fecha actual en los campos `creacion` y `modificacion`.

* Crea un programa que muestre un formulario con todos los campos para crear un nuevo producto.

* Inserta nuevos productos a través del formulario.

* Crea un programa que muestre una caja de texto donde se ingrese parte del nombre del producto o su descripción y haz la consulta para recuperar los productos que coincidan (usa el operador `LIKE`).

* Crea una lista y agrega todos los resultados encontrados.

* Crea un panel donde se muestren todos los datos de un solo producto.

* Enlaza el evento de la lista que cuando se seleccione un producto de la lista, este abra una nueva ventana y muestre los datos del producto seleccionado.

* Agrega un botón para editar la información del producto que al pulsarlo abra una ventana donde se permitan editar los datos del producto.

* Agrega un botón para eliminar el producto.



<br><br>
<hr>
<small>
Diplomado de Java - Alan Badillo Salas (badillo.soft@hotmail.com)<br>
Instituto Politécnico Nacional - Centro de Investigación en Cómputo
</small>