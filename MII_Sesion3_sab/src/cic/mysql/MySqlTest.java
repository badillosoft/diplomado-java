package cic.mysql;

import java.sql.*;

public class MySqlTest {
    
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/CIC";
        String user = "root";
        String password = "kmmx";
        
        Connection conn = DriverManager.getConnection(url, user, password);
        
        Statement statement = conn.createStatement();
        
        statement.execute("INSERT INTO usuarios (id_usuario, nombre, apellido_p, apellido_m) VALUES (3, 'Calos', 'To', 'Me');");
        
        ResultSet res = statement.executeQuery("SELECT * FROM usuarios;");
        
        while (res.next()) {
            String nombre = res.getString("nombre");
            String apellido_p = res.getString("apellido_p");
            String apellido_m = res.getString("apellido_m");
            
            System.out.printf("%s %s %s\n", nombre, apellido_p, apellido_m);
        }
        
        
        conn.close();
    }
    
}
