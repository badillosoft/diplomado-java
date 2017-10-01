package cic;

import java.util.*;

public class ListaFrutas {
    
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<String>();
        
        frutas.add("Piña");
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Pera");
        frutas.add("Pera");
        frutas.add("Pera");
        frutas.add("Pera");
        
        frutas.remove("Manzana");
        
        Set<String> ufrutas = new HashSet(frutas);
        
        ufrutas.add("Manzana");
        ufrutas.add("Mango");
    }
    
}
