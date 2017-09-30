package cic;

import java.io.*;
import java.net.*;

public class FileDownloader implements Runnable {
    
    String str_url;
    String filename;
    
    FileDownloader(String str_url, String filename) {
        this.str_url = str_url;
        this.filename = filename;
    }
    
    void download() throws MalformedURLException, IOException {
        
        URL url = new URL(str_url);
        
        InputStream in = url.openStream();
        
        FileOutputStream out = new FileOutputStream(filename);
        
        int b;
        
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        
        in.close();
        out.close();
        
    }
    
    @Override
    public void run() {
        try {
            this.download();
        } catch(Exception e) {
            System.out.println("No se pudo descargar :(");
        }
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            FileDownloader downloader = new FileDownloader("http://techslides.com/demos/sample-videos/small.mp4", String.format("/Users/kmmx/test_%d.mp4", i));

            Thread t = new Thread(downloader);

            t.start();
            
            //downloader.run();
        }
    }
    
}







