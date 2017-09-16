package cic;

import java.io.*;

public class PartirArchivos {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedInputStream in = new BufferedInputStream(
            new FileInputStream("/test/mi_archivo.zip")
        );
        BufferedOutputStream out1 = new BufferedOutputStream(
            new FileOutputStream("/test/mi_archivo[1-3].part")
        );
        BufferedOutputStream out2 = new BufferedOutputStream(
            new FileOutputStream("/test/mi_archivo[2-3].part")
        );
        BufferedOutputStream out3 = new BufferedOutputStream(
            new FileOutputStream("/test/mi_archivo[3-3].part")
        );
        
        int n = 0;

        while(in.read() != -1) {
            n++;
        }
        
        System.out.printf("Tamaño: %d bytes\n", n);
        
        in.close();
        in = new BufferedInputStream(
            new FileInputStream("/test/mi_archivo.zip")
        );
        
        int p = (int)(n / 3);
        int n1 = p, n2 = p, n3 = n - 2 * p;
        int c;
        int cnt = 0;
        
        while((c = in.read()) != -1) {
            if (cnt < n1) {
                out1.write(c);
            } else if (cnt >= n1 && cnt < (n1 + n2)) {
                out2.write(c);
            } else {
                out3.write(c);
            }
            cnt++;
        }
        
        in.close();
        out1.close();
        out2.close();
        out3.close();
        
    }
    
}
