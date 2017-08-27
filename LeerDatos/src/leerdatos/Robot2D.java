package leerdatos;

public class Robot2D {
    
    double x;
    double y;
    double t;
    double d = 1;
    
    void avanzar() {
        x += d * Math.cos(t);
        y += d * Math.sin(t);
    }
    
    void girarIzquierda() {
        t += 15 * Math.PI / 180;
    }
    
    void girarDerecha() {
        t -= 15 * Math.PI / 180;
    }
    
    void log() {
        System.out.printf("(%.2f, %.2f) [%.2f]\r\n", x, y, t);
    }
    
    public static void main(String[] args) {
        Robot2D bot = new Robot2D();
        
        bot.log();
        bot.avanzar();
        bot.log();
        for (int i = 0; i < 6; i++) {
            bot.girarIzquierda();
        }
        bot.avanzar();
        bot.log();
        for (int i = 0; i < 6; i++) {
            bot.girarIzquierda();
        }
        bot.avanzar();
        bot.log();
        for (int i = 0; i < 6; i++) {
            bot.girarIzquierda();
        }
        bot.avanzar();
        bot.log();
    }
    
}
