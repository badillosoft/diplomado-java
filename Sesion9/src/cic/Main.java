package cic;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        URLDownloader downloader = new URLDownloader(
            "https://misanimales.com/wp-content/uploads/2016/10/crecen-los-gatos.jpg",
            "/Users/kmmx/Desktop",
            "gato.jpg"
        );
        
        downloader.download();
    }
    
}
