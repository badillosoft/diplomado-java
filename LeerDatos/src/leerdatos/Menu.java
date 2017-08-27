package leerdatos;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Ver clientes");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Realizar compra");
            System.out.println("4. Devolver compra");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("> ");

            opcion = sc.nextInt();
        } while(opcion < 1 || opcion > 5);
        
        switch(opcion) {
            case 1:
                System.out.println("CLIENTES");
                break;
        }
        
    }
    
}
