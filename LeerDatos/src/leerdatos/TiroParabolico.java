package leerdatos;

import java.util.Scanner;

public class TiroParabolico {
    
    public static void main(String[] args) {
        // TODO: Declarar un objeto de la clase Scanner con System.in
        Scanner sc = new Scanner(System.in);
        // TODO: Declar todas las variables a utilizar con su tipo de dato
        float xo, yo;
        float vox, voy;
        float g = 9.81f;
        float x, y;
        float tmax;
        // TODO: Leer las variables desde el scanner
        System.out.print("Xo: ");
        xo = sc.nextFloat();
        System.out.print("Yo: ");
        yo = sc.nextFloat();
        System.out.print("Vox: ");
        vox = sc.nextFloat();
        System.out.print("Voy: ");
        voy = sc.nextFloat();
        System.out.print("T max: ");
        tmax = sc.nextFloat();
        // TODO: Crear un iterador sobre <t> desde 0 hasta <tmax>
        // TODO: Calcular el valor de <x> y <y>
        // TODO: Imprimir en el formato adecuado <t> <x> <y>
        for (float t = 0; t < tmax; t += 0.5f) {
            x = vox * t + xo;
            y = -g * t * t / 2 + voy * t + yo;
            System.out.printf("%f %f %f\r\n", t, x, y);
        }
        // TODO: Ser feliz :D
    }
    
}
