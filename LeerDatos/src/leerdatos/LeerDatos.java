package leerdatos;

import java.util.Scanner;

public class LeerDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        
        System.out.print("Dame la edad: ");
        edad = sc.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }
    
}
