package cic.client;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
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
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileDownloaderClient fuc = new FileDownloaderClient();
        
        fuc.refresh("localhost", 2001);
        
        for (File f : fuc.files) {
            System.out.println(f.getAbsolutePath());
        }
    }
    
}
