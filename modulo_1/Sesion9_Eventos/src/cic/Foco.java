package cic;

public class Foco extends FocoEventManager {
    
    boolean enendido = false;
    
    @Override
    void encender() {
        this.enendido = true;
        
        // Propagamos el evento encender
        super.encender();
    }
    
}
