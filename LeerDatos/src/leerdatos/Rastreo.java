package leerdatos;

public class Rastreo {

    public static void main(String[] args) {
        double xo = 24;
        double yo = 12;
        double a;
        double ux, uy;
        double vx, vy;
        double xp, yp;
        double d;
        double mu;
        double mv;
        
        Robot2D bot = new Robot2D();
        
        xp = bot.x + Math.cos(bot.t);
        yp = bot.y + Math.sin(bot.t);
        
        ux = xo - bot.x;
        uy = yo - bot.y;
        
        vx = xp - bot.x;
        vy = yp - bot.y;
        
        d = ux * vx + uy * vy;
        
        mu = Math.sqrt(ux * ux + uy * uy);
        mv = Math.sqrt(vx * vx + vy * vy);
        
        a = Math.acos(d / (mu * mv));
        
        if (a >= 0 && a < Math.PI) {
            bot.girarIzquierda();
        } else {
            bot.girarDerecha();
        }
        
        bot.avanzar();
    }
    
}
