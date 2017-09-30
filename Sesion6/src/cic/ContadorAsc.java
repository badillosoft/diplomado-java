package cic;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ContadorAsc implements Runnable {
    
    int contador = 0;
    JLabel label;
    
    ContadorAsc(JLabel label) {
        this.label = label;
    }
    
    public void run() {
        while(true) {
            contador++;
            label.setText(String.format("%d", contador));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
