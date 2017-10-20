package cic;

import java.util.ArrayList;

public class FocoEventManager {
    
    ArrayList<FocoEvents> listeners = new ArrayList();
    
    void addListener(FocoEvents obj) {
        this.listeners.add(obj);
    }
    
    void encender() {
        for (FocoEvents obj : this.listeners) {
            obj.encender();
        }
    }
    
}
