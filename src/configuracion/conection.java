/*  Chimaltenango 15 de Agosto del 2023
 *  Programador: Daniel Angel Ambrocio Coj
 *  Nombre de la Empresa: "Puzzle Haven"
 *  Es la coneccion de java y SQL
 */

package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conection {

    
    Connection con;
    
    
    public conection (){
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio","root","");
        
        
        
        } catch (ClassNotFoundException | SQLException e){
            System.err.println(" No se pudo conectar a la base de datos. Error: " +e);
        
        }
        
    
    
    }
    
    public Connection getConnection() {
        return con;
    
    }
    
    
    
}
