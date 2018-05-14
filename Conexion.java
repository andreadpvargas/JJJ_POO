package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    String ruta = "jdbc:mysql://localhost:3306/sqlpoo";
    String user = "root";
    String pass = "";
    String driver = "com.mysql.jdbc.Driver";
    Connection con;
    Statement stmt;
    public Conexion() {
        try {
    Class.forName(driver);
    con = DriverManager.getConnection(ruta,user,pass);
    stmt = con.createStatement();
    }catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion"+ex);
        }
}
    
    public void modificarBD(String query){
        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet consultarBD(String query){
        ResultSet rs=null;
        try {
            rs=stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
}
