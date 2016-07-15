package bd_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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
   
   public void actualizar(int Doctor,String CURP, Timestamp fecha) {
      try{
            
            PreparedStatement updateEmp = acceso.prepareStatement("UPDATE Cita SET Medico = ?, Paciente = ?, Fecha=? WHERE Medico = ? AND Paciente=?");
            updateEmp.setInt(1,Doctor);
            updateEmp.setString(2,CURP);
            updateEmp.setTimestamp(3, fecha);
            updateEmp.setInt(4, Doctor);
            updateEmp.setString(5, CURP);
            int res = updateEmp.executeUpdate();
      
            if(res > 0)
                JOptionPane.showMessageDialog(null,"La fecha ha sido modificada correctamente");
            else 
               JOptionPane.showMessageDialog(null, "numero de empleado desconocido", "Modificar empleado",
                    JOptionPane.ERROR_MESSAGE);
        } catch(SQLException e){
            System.out.println("error: failed to create a connection object.");
            e.printStackTrace();
        } catch(Exception e){
            
        }
   }


   public ArrayList<String> lista(String CURP) {
      ArrayList lista = new ArrayList();
      
      try {
         PreparedStatement stmt;
         stmt = acceso.prepareStatement("SELECT Medico,Paciente,Fecha FROM Cita WHERE Paciente= ?");
         stmt.setString(1, CURP);
         ResultSet res = stmt.executeQuery();
         while (res.next()) {
            
            lista.add(res.getString(1));
            lista.add(res.getString(2));
            lista.add(res.getTimestamp(3).toString());
         }
      } catch (Exception e) {

      }
      return lista;
   }
}