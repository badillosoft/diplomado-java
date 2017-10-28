package cic.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class FileDownloaderClient {
    
    Socket client;
    
    ArrayList<File> files;
    
    void refresh(String host, int port) throws IOException, ClassNotFoundException {
        this.client = new Socket(host, port);
        
        ObjectInputStream in = new ObjectInputStream(this.client.getInputStream());
        
        this.files = (ArrayList<File>)in.readObject();
    }
    
    void download(String host, int port, File seleccionado, File destino) throws IOException {
        this.client = new Socket(host, port + 1);
        
        ObjectOutputStream out = new ObjectOutputStream(this.client.getOutputStream());
        
        out.writeObject(seleccionado);
        
        InputStream in = client.getInputStream();
        
        FileOutputStream fout = new FileOutputStream(destino);
        
        int b;
        
        while ((b = in.read()) != -1) {
            fout.write(b);
        }
        
        fout.close();
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileDownloaderClient fuc = new FileDownloaderClient();
        
        fuc.refresh("localhost", 2001);
        
        for (File f : fuc.files) {
            System.out.println(f.getAbsolutePath());
        }
    }
    
}
