package cic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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
        
        URLConnection conn = url.openConnection();
        
        conn.addRequestProperty("User-Agent", 
            "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
        
        InputStream in = conn.getInputStream();
        
        String filename = String.format("%s/%s", this.path, this.name);
        
        FileOutputStream out = new FileOutputStream(filename);
        
        //byte[] buff = new byte[1024];
        //int c;
        int b;
        int i = 0;
        int p = 0;
        int ip = 0;
        
        int n = conn.getContentLength();
        
        System.out.printf("Descargando %s en %s [%d bytes]\n",
            this.url, filename, n);
        
        //while ((c = in.read(buff)) != -1) {
        while ((b = in.read()) != -1) {
            //out.write(buff, 0, c);
            out.write(b);
            
            p = (int)(100.0 * i / n);
            
            if (ip != p) {
                ip = p;
                System.out.printf("Progreso %s: %d%%\n", this.url, p);
            }
            
            //i += c;
            i++;
        }
        
        in.close();
        out.close();
    }
}
