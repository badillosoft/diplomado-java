package cic.server;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class FileDownloderServer implements Runnable {
    
    ServerSocket server;
    
    ArrayList<File> files;
    
    FileDownloderServer(int port, ArrayList<File> files) throws IOException {
        this.server = new ServerSocket(port);
        this.files = files;
    }
    
    @Override
    public void run() {
        System.out.println("Servidor iniciado...");
        while (true) {
            try {
                Socket socket = this.server.accept();
                
                ObjectOutputStream out = new ObjectOutputStream(
                        socket.getOutputStream());
                
                out.writeObject(this.files);
                
                System.out.println("Cliente aceptado...");
                
                socket.close();
            } catch (Exception e) {
                //
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<File> files = new ArrayList();
        
        files.add(new File("C:/test/archivo.jpg"));
        files.add(new File("C:/test/archivo.txt"));
        files.add(new File("C:/test/archivo.mp4"));
        
        FileDownloderServer fus = new FileDownloderServer(2001, files);
        
        Thread t = new Thread(fus);
        
        t.start();
    }
    
}
