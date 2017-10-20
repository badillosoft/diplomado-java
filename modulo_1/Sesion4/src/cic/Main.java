/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author kmmx
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        ISaludar obj1 = new Jedi();
        obj1.saludar();
        
        Jedi anakin = (Jedi)obj1;
        
        // CORRECTO
        Jedi obi = new Jedi();
        
        ISaludar obj2 = obi;
        
        obj2.saludar();
        
    }
}
