package cic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void imprimirProductos(ArrayList<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            System.out.printf("Nombre: %s\nDescripción: %s\nPrecio: %.2f\n------------------------\n", p.nombre, p.descripcion, p.precio);
        }
    }
    
    public static ArrayList<Producto> buscarProducto(ArrayList<Producto> productos, String buscar) {
        ArrayList<Producto> productos_encontrados = new ArrayList<Producto>();
        
        for (Producto p : productos) {
            if (p.nombre.toLowerCase().contains(buscar)) {
                productos_encontrados.add(p);
            }
        }
        
        return productos_encontrados;
    }
    
    static ArrayList<Producto> cargarProductos(String ruta) throws IOException {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        FileInputStream in = new FileInputStream(ruta);
        
        Scanner sc = new Scanner(in);
        
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String descripcion = partes[1];
            String precio_str = partes[2];
            double precio = Double.parseDouble(precio_str);
            productos.add(new Producto(nombre, descripcion, precio));
        }
        
        in.close();
        
        return productos;
    }
    
    public static void main(String[] args) throws IOException {
        ArrayList<Producto> productos = cargarProductos("/Users/kmmx/Desktop/diplomado-java/productos.txt");
        
        imprimirProductos(productos);
        
        ArrayList<Producto> cocas = buscarProducto(productos, "coca");
        
        System.out.println("-- Buscar: coca --");
        imprimirProductos(cocas);
        
        ArrayList<Producto> galletas = buscarProducto(productos, "galleta");
        
        System.out.println("-- Buscar: galleta --");
        imprimirProductos(galletas);
    }
    
}
