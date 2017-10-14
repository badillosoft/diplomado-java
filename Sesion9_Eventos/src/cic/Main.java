package cic;

public class Main {
    
    public static void main(String[] args) {
        
        Foco foco = new Foco();
        Cuca cuca = new Cuca();
        Fantasma fantasma = new Fantasma();
        
        foco.addListener(cuca);
        foco.addListener(fantasma);
        
        foco.encender();
        foco.encender();
        foco.encender();
        foco.encender();
        
    }
    
}
