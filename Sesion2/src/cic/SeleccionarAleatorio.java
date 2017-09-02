package cic;

public class SeleccionarAleatorio {

    public static void main(String[] args) {
        int alumno = 1 + (int)(Math.random() * 26);
        
        System.out.printf("El heroe seleccionado es: %d", alumno);
    }
    
}
