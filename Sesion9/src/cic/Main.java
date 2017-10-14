package cic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("/Users/kmmx/Desktop/urls.txt");
        
        Scanner sc = new Scanner(in);
        
        String path = "/Users/kmmx/Downloads";
        
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] partes = linea.split(";");
            String url = partes[0];
            String name = partes[1];
            
            URLDownloader downloader = new URLDownloader(url, path, name);
            
            downloader.download();
        }
    }
    
}
