package bd_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operaciones {
   Coneccion con;
   Connection acceso;

   public Operaciones() {
      try {
         con = new Coneccion();
         acceso = con.obtener();
      } catch (Exception e) {

      }
   }
   
   public void actualizar(int id, String nombre, int campo) {
      if (campo == 1) {
         try {
            PreparedStatement updateEmp = acceso.prepareStatement("UPDATE alumno SET Marca = ? WHERE Id = ?");
            updateEmp.setString(1, nombre);
            updateEmp.setInt(2, id);
            int res = updateEmp.executeUpdate();
            if (res > 0) {
               JOptionPane.showMessageDialog(null, "Producto con Id: " + id + "\n" + " Actualizado");
            } else {
               JOptionPane.showMessageDialog(null, "Id desconocido");
            }
         } catch (Exception e) {

         }
      } else if (campo == 2) {
         try {
            PreparedStatement updateEmp = acceso.prepareStatement("UPDATE alumno SET Tipo = ? WHERE Id = ?");
            updateEmp.setString(3, nombre);
            updateEmp.setInt(2, id);
            int res = updateEmp.executeUpdate();
            if (res > 0) {
               JOptionPane.showMessageDialog(null, "Producto con Id: " + id + "\n" + " Actualizado");
            } else {
               JOptionPane.showMessageDialog(null, "Id desconocido");
            }
         } catch (Exception e) {

         }
      } else if(campo == 3){
         try {
            PreparedStatement updateEmp = acceso.prepareStatement("UPDATE alumno SET Precio = ? WHERE Id = ?");
            updateEmp.setFloat(4, Float.parseFloat(nombre));
            updateEmp.setInt(2, id);
            int res = updateEmp.executeUpdate();
            if (res > 0) {
               JOptionPane.showMessageDialog(null, "Producto con Id: " + id + "\n" + " Actualizado");
            } else {
               JOptionPane.showMessageDialog(null, "Id desconocido");
            }
         } catch (Exception e) {

         }
      }
   }

   public void eliminar(int id) {
      Statement stmt = null;
      try {
         stmt = acceso.createStatement();
         int res = stmt.executeUpdate("DELETE FROM alumno WHERE Id = " + id);
         if (res == 1) {
            JOptionPane.showMessageDialog(null, "Producto con Id: " + id + " Eliminado");
         } else if (res == 0) {
            JOptionPane.showMessageDialog(null, "Id desconocido");
         }
      } catch (Exception e) {

      }
   }

   /*public ArrayList<Producto> lista() {
      ArrayList lista = new ArrayList();
      Producto bici;
      try {
         PreparedStatement stmt;
         stmt = acceso.prepareStatement("SELECT * FROM alumno");
         ResultSet res = stmt.executeQuery();
         while (res.next()) {
            bici = new Producto();
            bici.setMarca(res.getString(1));
            bici.setId(Integer.parseInt(res.getString(2)));
            bici.setTipo(res.getString(3));
            bici.setPrecio(Float.parseFloat(res.getString(4)));
            lista.add(bici);
         }
      } catch (Exception e) {

      }
      return lista;
   }*/
}