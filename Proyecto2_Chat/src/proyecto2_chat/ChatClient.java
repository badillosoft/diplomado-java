package proyecto2_chat;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatClient {
    
    public static void main(String[] args) throws IOException {
        // Creamos una conexión al servidor
        Socket client = new Socket("localhost", 1999);
        
        // Enviamos un mensaje al servidor
        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        out.writeUTF("Hola mundo");
        out.flush();
        
        // Recuperamos los mensajes del servidor
        DataInputStream in = new DataInputStream(client.getInputStream());
        while(true) {
            String message = in.readUTF();
            System.out.printf("Mensaje: %s\n", message);
        }
    }
    
}
