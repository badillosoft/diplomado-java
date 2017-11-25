package cic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Grafica2 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        JFreeChart grafica;
        
        DefaultPieDataset datos = new DefaultPieDataset();
        
        FileInputStream in = new FileInputStream("/Users/kmmx/datos.csv");
        
        Scanner sc = new Scanner(in);
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            
            String[] parts = line.split(",");
            
            String category = parts[0];
            int size = Integer.parseInt(parts[1]);
            
            datos.setValue(category, size);
        }
        
        in.close();
        
        grafica = ChartFactory.createPieChart("Comida Favorita", datos);
        
        ChartPanel panel = new ChartPanel(grafica);
        
        JFrame ventana = new JFrame("Gráfica v1.0");
        
        ventana.getContentPane().add(panel);
        
        ventana.pack();
        
        ventana.setVisible(true);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
