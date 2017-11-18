package proyecto2_chat;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer {
    
    static void broadcast(ArrayList<Socket> clients, String message) throws IOException {
        // A cada cliente le enviamos el mensaje
        for (Socket client : clients) {
            if (client.isClosed()) {
                continue;
            }
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF(message);
            out.flush(); // Fin del mensaje
        }
    }
    
    public static void main(String[] args) throws IOException {
        // Creamos un servidor en localhost:1999
        ServerSocket server = new ServerSocket(1999); 
        
        // Creamos una lista de clientes, para poder enviarles mensajes
        ArrayList<Socket> clients = new ArrayList();
        
        // Procesamos todas las conexiones
        while(true) {
            // Obtenemos el siguiente cliente conectado
            Socket client = server.accept();
            System.out.println("Cliente conectado:");
            
            // Agregamos el cliente conectado a la lista
            clients.add(client);
            
            // Creamos un hilo que recibe del cliente todos los mensajes
            // que quiera enviar
            new Thread(new Runnable() {
                public void run() {
                    // Hasta el infinito
                    while(true) {
                        try {
                            if (client.isClosed() || !client.isConnected()) {
                                return;
                            }
                            // Recuperamos el mensaje de entrada
                            DataInputStream in = new DataInputStream(client.getInputStream());
                            String message = in.readUTF();

                            System.out.printf("Mensaje: %s\n", message);

                            // Retransmitimos el mensaje a todos los clientes
                            broadcast(clients, message);
                        } catch(Exception e) {
                            System.out.println(e);
                            try {
                                client.close();
                            } catch (IOException ex) {
                                System.out.println(ex);
                            }
                            return;
                        }
                    }
                }
            }).start();
        }
    }
    
}
