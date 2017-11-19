package proyecto3_security;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.*;

public class CompressZip {
    
    static String getFilename(String path) {
        Pattern regex = Pattern.compile("(\\w+\\.\\w+)$");
        
        Matcher matcher = regex.matcher(path);
        
        String filename = "";
        
        while(matcher.find()) {
            filename = matcher.group();
        }
        
        return filename;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileZip = "test.zip";
        
        String[] files = new String[] {
            "/Users/kmmx/mensajes.txt",
            "/Users/kmmx/python-scib.txt",
            "/Users/kmmx/python-scib[emails].txt",
            "/Users/kmmx/script.py",
            "/Users/kmmx/login_wid.py",
            "/Users/kmmx/demo.zip",
        };
        
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(fileZip));
        
        for (String file : files) {
            ZipEntry entry = new ZipEntry("foo/" + getFilename(file));
            
            zout.putNextEntry(entry);
            
            BufferedInputStream in = new BufferedInputStream(
                    new FileInputStream(file));
            
            byte[] buff = new byte[1024];
            
            while (in.read(buff) != -1) {
                zout.write(buff, 0, buff.length);
            }
            
            in.close();
            
            zout.closeEntry();
        }
        
        zout.close();
    }
    
}
