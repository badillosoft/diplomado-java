package cic;

public class Integral {
    float A;
    float B;
    int N;
    float[] puntos;
    float[] rectangulos;
    
    float evaluar(float A, float B, int N) {
        this.A = A;
        this.B = B;
        this.N = N;
        
        calcularPuntos();
        calcularAreas();
        float suma = sumarAreas();
        return suma;
    }
    
    void calcularPuntos() {
        puntos = new float[N];
        
        int n = N - 1;
        float x = B - A;
        
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = ((float)i / n) * x + A;
        }
    }
    
    void calcularAreas() {
        rectangulos = new float[N - 1];
        
        float pi, pf;
        
        for(int i = 0; i < rectangulos.length; i++) {
            pi = puntos[i];
            pf = puntos[i + 1];
            
            rectangulos[i] = areaRectangulo(pi, pf);
        }
    }
    
    float areaRectangulo(float pi, float pf) {
        float base = pf - pi;
        float altura = (f(pi) + f(pf)) / 2;
        return base * altura;
    }
    
    float f(float x) {
        return x * x + 2;
    }
    
    float sumarAreas() {
        float suma = 0;
        
        for(int i = 0; i < rectangulos.length; i++) {
            suma += rectangulos[i];
        }
        
        return suma; 
    }
    
    public static void main(String[] args) {
        Integral integral = new Integral();
        
        float i1 = integral.evaluar(-2, 2, 2);
        float i2 = integral.evaluar(-2, 2, 4);
        float i3 = integral.evaluar(-2, 2, 8);
        float i4 = integral.evaluar(-2, 2, 100);
        
        System.out.printf("%f %f %f %f\r\n", i1, i2, i3, i4);
        
        int i = 2;
        int n = 10;
        
        float x = i / n;
        
        System.out.println(x);
    }
    
}










