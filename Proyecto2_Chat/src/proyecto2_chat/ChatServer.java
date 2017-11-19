package proyecto2_chat;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;

public class ChatServer {
    
    static String bot_censura_email(String message) {
        String pattern = "([\\w\\.\\-\\_]+)@\\w+(\\.\\w{2,4}){1,2}";
        
        Pattern regex = Pattern.compile(pattern);
        
        Matcher matcher = regex.matcher(message);
        
        while(matcher.find()) {
            String email = matcher.group(0);
            String user = matcher.group(1);
            int user_start = matcher.start(1);
            int user_end = matcher.end(1);
            
            System.out.printf("Email: %s | Censurar: %s", email, user);
            
            String m_left = message.substring(0, user_start + 3);
            String m_right = message.substring(user_end);
            String censored = "";
            for (int i = 3; i < user_end - user_start; i++) {
                censored += "*";
            }
            
            message = m_left + censored + m_right;
        }
        
        return message;
    }
    
    static String bot_invierte_hola(String message) {
        String pattern = "hola";
        
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        
        Matcher matcher = regex.matcher(message);
        
        while(matcher.find()) {
            int start = matcher.start(0);
            int end = matcher.end(0);
            
            String m_left = message.substring(0, start);
            String m_right = message.substring(end);
            
            message = m_left + "aloh" + m_right;
        }
        
        return message;
    }
    
    static void broadcast(ArrayList<Socket> clients, String message) throws IOException {
        message = bot_censura_email(message);
        message = bot_invierte_hola(message);
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
