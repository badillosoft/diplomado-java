package cic;

public class Jugador {
    
    // TODO: Crea el atributo posicion de tipo entero
    int id;
    
    // TODO: Crea un constructor que reciba un entero con el id del jugador
    
    boolean tirar() {
        // TODO: Crear la variable de tipo int d1 que contenga un número aleatorio entre 1 y 6
        // TODO: Crear la variable de tipo int d2 que contenga un número aleatorio entre 1 y 6
        
        int iposicion = this.posicion;
        
        this.posicion += d1 + d2;
        
        // TODO: Llama al método comprobar_reglas()
        
        System.out.printf("Jugador %d de movió de la casilla %d a la casilla %d\n", this.id, iposicion, this.posicion);
        
        if (this.posicion == 50) {
            System.out.printf("Jugador %d gana!\n", this.id);
            return true;
        }
        
        return false;
    }
    
    void caer(int a, int b) {
        System.out.printf("Jugador %d cae de la casilla %d a la casilla %d\n", this.id, a, b);
        this.posicion = b;
    }
    
    void subir(int a, int b) {
        System.out.printf("Jugador %d sube de la casilla %d a la casilla %d\n", this.id, a, b);
        this.posicion = b;
    }
    
    void comprobar_reglas() {
        // TODO: Crea las condiciones para que si la posición es 12 por ejemplo, mande a llamar al método
        //          caer(12, 3) que regresa la posición de la 12 a la 3
        //          Si por ejemplo la posición es 15 que mande a llamar al método subir(15, 24) que cambia la posición
        //          de la 15 a la 24
        
        if (this.posicion > 50) {
            int extra = (this.posicion - 50);
            this.posicion = 50 - extra;
            System.out.printf("Jugador %d regresa %d casillas\n", this.id, extra);
        }
    }
    
}
