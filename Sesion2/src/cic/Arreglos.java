package cic;

public class Arreglos {
    
    public static void main(String[] args) {
        long[] numeros = new long[100];
        
        long a = 1, b = 1, c;
        
        numeros[0] = a;
        numeros[1] = b;
        
        for (int i = 2; i < numeros.length; i++) {
            c = a + b;
            numeros[i] = c;
            a = b;
            b = c;
        }
        
        System.out.println("Esperate");
    }
    
}
