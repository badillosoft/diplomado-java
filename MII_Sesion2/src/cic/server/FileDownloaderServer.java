package cic.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class FileDownloaderServer implements Runnable {
    
    ServerSocket server;
    ServerSocket serverFile;
    
    ArrayList<File> files;
    
    FileDownloaderServer(int port, ArrayList<File> files) throws IOException {
        this.server = new ServerSocket(port);
        this.serverFile = new ServerSocket(port + 1);
        this.files = files;
    }
    
    void sendFileList() {
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
    
    void sendFile() {
        try {
            Socket socket = this.serverFile.accept();
            
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            OutputStream out = socket.getOutputStream();
            
            File f = (File)in.readObject();
            
            FileInputStream fin = new FileInputStream(f);
            
            int b;
            
            while((b = fin.read()) != -1) {
                out.write(b);
            }

            System.out.println("Cliente aceptado...");

            socket.close();
        } catch (Exception e) {
            //
        }
    }
    
    @Override
    public void run() {
        System.out.println("Servidor iniciado...");
        while (true) {
            this.sendFileList();
            this.sendFile();
        }
    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<File> files = new ArrayList();
        
        files.add(new File("C:/test/archivo.jpg"));
        files.add(new File("C:/test/archivo.txt"));
        files.add(new File("C:/test/archivo.mp4"));
        
        FileDownloaderServer fus = new FileDownloaderServer(2001, files);
        
        Thread t = new Thread(fus);
        
        t.start();
    }
    
}
