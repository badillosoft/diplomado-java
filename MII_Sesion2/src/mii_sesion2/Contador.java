/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii_sesion2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author kmmx
 */
public class Contador implements Runnable {
    
    int contador = 0;
    JLabel label;
    
    Contador(JLabel label) {
        this.label = label;
    }
    
    @Override
    public void run() {
        while (true) {
            this.contador++;
            this.label.setText(String.format("%02d", contador));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                //
            }
        }
    }
    
}
