/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii_sesion4;

import java.sql.*;

/**
 *
 * @author kmmx
 */
public class SistemaProductos {
    
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost/cic", "root", "kmmx");
        
        Statement st = conn.createStatement();
        
        st.execute("CREATE TABLE IF NOT EXISTS productos (" +
            "id_productos INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
            "nombre VARCHAR(128) NOT NULL," +
            "descripcion VARCHAR(256) NOT NULL," +
            "costo FLOAT NOT NULL," +
            "costo_unitario FLOAT NOT NULL," +
            "creacion DATETIME NOT NULL," +
            "modificacion DATETIME NOT NULL," +
            "bloqueado BOOLEAN NULL" + 
            ");"
        );
        
        conn.close();
    }
    
}
