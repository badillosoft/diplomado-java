package cic;

public class Pila {
    
    int[] numeros = new int[10];
    int contador = -1;
    
    boolean apilar(int x) {
        if (contador + 1 >= numeros.length) {
            System.out.println("La pila está llena :(");
            return false;
        }
        
        numeros[contador + 1] = x;
        
        contador++;
        
        return true;
    }
    
    int desapilar() {
        if (contador < 0) {
            System.out.println("La pila está vacía :(");
            return 0;
        }
        
        int ultimo = numeros[contador];
        
        contador--;
        
        return ultimo;
    }
    
    void log() {
        for (int i = 0; i <= contador; i++) {
            System.out.printf("%d->", numeros[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Pila pila = new Pila();
        
        pila.apilar(5);
        pila.apilar(4);
        pila.apilar(6);
        pila.apilar(1);
        pila.apilar(3);
        pila.log();
        pila.apilar(9);
        pila.apilar(2);
        pila.apilar(8);
        pila.log();
        pila.apilar(7);
        pila.apilar(10);
        pila.apilar(123);
        pila.apilar(123);
        pila.apilar(123);
        pila.log();
        
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.log();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.log();
        pila.apilar(20);
        pila.apilar(23);
        pila.apilar(25);
        pila.log();
    }
    
}
