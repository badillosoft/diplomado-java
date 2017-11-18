package cic;

import java.sql.*;

public class DBManager {
    
    Connection conn;
    Statement statement;
    
    public DBManager(String dbName, String user, String password) {
        String url = String.format("jdbc:mysql://localhost/%s", dbName);
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            statement = conn.createStatement();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean insert(String table, String[] fields, Object[] values) {
        String[] valuesStr = new String[values.length];
        
        for (int i = 0; i < values.length; i++) {
            Object value = values[i];
            if (value == null) {
                valuesStr[i] = "NULL";
            } else if (value instanceof Integer) {
                valuesStr[i] = String.format("%d", value);
            } else if (value instanceof Float || value instanceof Double) {
                valuesStr[i] = String.format("%f", value);
            } else if (value instanceof Boolean) {
                valuesStr[i] = String.format("%s", value);
            } else {
                valuesStr[i] = String.format("'%s'", value);
            }
        }
        
        String query = String.format("INSERT INTO %s (%s) VALUES (%s);",
            table, String.join(",", fields), String.join(",", valuesStr));
        
        System.out.println(query);
        
        try {
            return !statement.execute(query);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet executeQuery(String query) {
        try {
            return statement.executeQuery(query);
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
