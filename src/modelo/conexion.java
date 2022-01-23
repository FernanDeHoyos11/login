/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO CELERON
 */
public class conexion {
    public static Connection conectar(){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_uni", "root", "");
           return con;
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "error en la conexion a base de datos");
            
        }
        return (null);
    }
}
