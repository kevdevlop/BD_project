package bd_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

   PestañaUno ps1;
   PestañaDos ps2;
   Operaciones op;

   public Controlador(PestañaUno uno, PestañaDos dos) {
      ps1 = uno;
      ps2 = dos;
      op = new Operaciones();
      
      ps1.escuchaBotonP1(this);

      ps2.escuchaBotonP1(this);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getActionCommand() == "Ok1") {
         if(ps1.jtf1.getText().equals("")||ps1.jtf2.getText().equals("")||ps1.jtf3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Completa todos los campos", "Campos Vacios", JOptionPane.INFORMATION_MESSAGE);
            }else{
                int doctor=Integer.parseInt(ps1.jtf1.getText());
                String nombre=ps1.jtf2.getText();
                Timestamp fecha;
                fecha = Timestamp.valueOf(ps1.jtf3.getText());
                op.actualizar(doctor, nombre,fecha);
            }
      } else if (e.getActionCommand() == "Ok2") {
          String result = "";
         ArrayList<String> a = new ArrayList();
         a = op.lista(ps2.txt.getText());
         
            result += "Medico: "+a.get(0)+"\nPaciente: "+a.get(1)+"\nFecha: "+ a.get(2);
         
         ps2.area.setText(result);
      }
   }
}
