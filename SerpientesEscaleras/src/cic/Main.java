package cic;

public class Main {
    public static void main(String[] args) {
        
        Jugador j1 = new Jugador(1);
        Jugador j2 = new Jugador(2);
        Jugador j3 = new Jugador(3);
        Jugador j4 = new Jugador(4);
        
        boolean terminado;
        
        do {
            if (!j1.tirar()) {
                if (!j2.tirar()) {
                    if (!j3.tirar()) {
                        if (!j4.tirar()) {
                            //
                        }
                    }
                }
            }
            
            // TODO: Ajusta la variable terminado a true si algun jugador tiene la posicion en 50 exactamente
        } while(!terminado);
        
    }
}
