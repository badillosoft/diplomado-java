# Proyecto II - JFileDownloader v1.0

`JFileDownloader` será una aplicación para descargar archivos provistos por un servidor. Haremos uso de sockets para su implementación

## Montar un servidor

~~~java
ServerSocket server = new ServerSocket(2001);

...

while(true) {
    Socket client = server.accept();

    // TODO: Trabajar con el cliente

    client.close();
}
~~~

## Enviar un objeto del servidor al cliente

~~~java
Socket client = server.accept();

ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());

out.writeObject(obj);
~~~

## Montar un cliente

~~~java
Socket client = new Socket("localhost", 2001);

// TODO: Trabajar con el cliente
~~~

## Recuperar un objeto del sevidor

~~~java
ObjectInputStream in = new ObjectInputStream(client.getInputStream());

ArrayList<File> obj = (ArrayList<File>)in.readObject();
~~~

## Problemas

<br><br>
<hr>
<small>
Diplomado de Java - Alan Badillo Salas (badillo.soft@hotmail.com)<br>
Instituto Politécnico Nacional - Centro de Investigación en Cómputo
</small>