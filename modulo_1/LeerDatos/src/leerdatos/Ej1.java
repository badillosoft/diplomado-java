package leerdatos;

import java.util.Scanner;

public class Ej1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        
        System.out.print("Dame N: ");
        N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.printf("%d ", i);
        }
        
        System.out.println();
    }
    
}
