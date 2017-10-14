package cic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDownloader {
    String url;
    String path;
    String name;
    
    URLDownloader(String url, String path, String name) {
        this.url = url;
        this.path = path;
        this.name = name;
    }
    
    void download() throws MalformedURLException, IOException {
        URL url = new URL(this.url);
        
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        
        conn.setRequestMethod("HEAD");
        
        InputStream in = conn.getInputStream();
        
        String filename = String.format("%s/%s", this.path, this.name);
        
        FileOutputStream out = new FileOutputStream(filename);
        
        int b;
        int i = 0;
        int p = 0;
        int ip = 0;
        
        int n = conn.getContentLength();
        
        while ((b = in.read()) != -1) {
            out.write(b);
            
            p = (int)(100.0 * i / n);
            
            if (ip != p) {
                ip = p;
                System.out.printf("Progreso: %d%%\n", p);
            }
            
            i++;
        }
        
        in.close();
        out.close();
        conn.disconnect();
    }
}
