package leerdatos;

public class Robot {
    
    boolean encendido;
    int posicion;
    
    void encender() {
        encendido = true;
    }
    
    void apagar() {
        encendido = false;
    }
    
    void avanzar() { 
        if (encendido) {
            posicion++;
        }
    }
    
    void log() {
        System.out.printf("Estado: %s\r\n", encendido);
        System.out.printf("Posición: %d\r\n", posicion);
    }
    
    public static void main(String[] args) {
        
        Robot bot = new Robot();
        
        bot.encender();
        bot.log();
        bot.avanzar();
        bot.avanzar();
        bot.avanzar();
        bot.avanzar();
        bot.log();
        
    }
    
}
