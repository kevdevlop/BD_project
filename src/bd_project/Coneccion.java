package bd_project;

import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Coneccion {
   private static Connection con;
   private static String usr = "2143030382";
   private static String pwd = "2143030382";
   private static String host = "labred.cua.uam.mx";
   private static String BD = "m2143030382";
   private static String url = "jdbc:mysql://"+host+"/"+BD;
   private static String sql = "com.mysql.jdbc.Driver";

   public Coneccion(){
      con = null;
   }
   
   public static Connection obtener()  {
      if (con == null) {
         try {
            Class.forName(sql);
            con = DriverManager.getConnection(url,usr,pwd);
            JOptionPane.showMessageDialog(null, "Conección exitosa");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falló la conección");
         } catch (ClassNotFoundException ex) {
              Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      return con;
   }

   public static void cerrar() {
      if (con != null) {
          try {
              con.close();
          } catch (SQLException ex) {
              Logger.getLogger(Coneccion.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
   }
}