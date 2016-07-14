package bd_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
         if (!ps1.jtf1.equals("")) {
            op.actualizar(Integer.parseInt(ps1.jtf.getText()), ps1.jtf1.getText(), 1);
         } else if (!ps1.jtf2.equals("")) {
            op.actualizar(Integer.parseInt(ps1.jtf.getText()), ps1.jtf2.getText(), 2);
         } else if(!ps1.jtf3.equals("")){
            op.actualizar(Integer.parseInt(ps1.jtf.getText()), ps1.jtf3.getText(), 3);
         }
      } else if (e.getActionCommand() == "Ok2") {
         ArrayList<Producto> a = new ArrayList();
         a = op.lista();
         for (int i = 0; i < a.size(); i++) {
            ps3.area.append(a.get(i).toString());
         }
      }
   }
}
