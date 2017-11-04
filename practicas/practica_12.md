# Práctica XII - Consulta MySql

Las bases de datos son escenciales para poder almacenar datos y hacer las aplicaciones más útiles. **MySql** es un motor de base de datos que nos va a permitir almacenar datos en forma de tablas y manipular dichos datos mediante consultas estructuradas en el lenguaje *SQL*.

## Realizar una consulta a la base de datos

Una vez instalado y configurado correctamente *MySql* podemos 

~~~java
import java.sql.*;

public class JavaMysqlSelectExample
{

  public static void main(String[] args)
  {
    try
    {
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test";, "root", "kmmx");
      
      String query = "SELECT * FROM users";

      Statement st = conn.createStatement();
      
      ResultSet rs = st.executeQuery(query);
      
      while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        
        System.out.format("%s %s\n", id, firstName, lastName);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.print("Error: ");
      System.err.println(e.getMessage());
    }
  }
}
~~~

<br><br>
<hr>
<small>
Diplomado de Java - Alan Badillo Salas (badillo.soft@hotmail.com)<br>
Instituto Politécnico Nacional - Centro de Investigación en Cómputo
</small>