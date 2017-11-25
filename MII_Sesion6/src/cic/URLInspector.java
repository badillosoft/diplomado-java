package cic;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLInspector {

    public static void main(String[] args) throws MalformedURLException, IOException {

        Scanner sci = new Scanner(System.in);
        
        System.out.print("Ingresa la url: ");
        
        String raw_url = sci.nextLine();
        
        URL url = new URL(raw_url);

        InputStream in = url.openStream();

        Scanner sc = new Scanner(in);

        String text = "";

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            text += line;
        }

        //System.out.println(text);

        String pattern = "https?://([\\w\\.]+)/?[^\"\\s\\,]*";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            for (int g = 0; g <= 0; g++) {
                int i = matcher.start(g);
                int f = matcher.end(g);
                String link = matcher.group(g);
                System.out.printf("G(%d) [%d, %d] %s\n", g, i, f, link);
            }
        }
    }

}
