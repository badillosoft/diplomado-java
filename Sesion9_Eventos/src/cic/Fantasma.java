package cic;

public class Fantasma implements FocoEvents {
    
    boolean visible = true;
    
    @Override
    public void encender() {
        this.visible = false;
        System.out.println("El fantasma ha desaparecido");
    }
    
}
