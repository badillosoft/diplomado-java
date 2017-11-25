/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cic;

import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;

public class Grafica {
    
    public static void main(String[] args) {
        JFreeChart grafica;
        
        DefaultPieDataset datos = new DefaultPieDataset();
        
        datos.setValue("Pizza", 35);
        datos.setValue("Tacos", 49);
        datos.setValue("Ensalada", 3);
        
        grafica = ChartFactory.createPieChart("Comida Favorita", datos);
        
        ChartPanel panel = new ChartPanel(grafica);
        
        JFrame ventana = new JFrame("Gráfica v1.0");
        
        ventana.getContentPane().add(panel);
        
        ventana.pack();
        
        ventana.setVisible(true);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
