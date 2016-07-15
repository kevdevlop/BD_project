package bd_project;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class BD_project {

    public void ventana(PestañaUno uno,PestañaDos dos,Container c) {
      JTabbedPane panelConFichas = new JTabbedPane();
      panelConFichas.addTab("Modificar", null, uno);
      panelConFichas.addTab("Consultar", null, dos);
      c.add(panelConFichas);
   }

   public static void main(String[] args) {
      BD_project prueba = new BD_project();
      PestañaUno ps1 = new PestañaUno();
      PestañaDos ps2 = new PestañaDos();
      Controlador control = new Controlador(ps1,ps2);
      JFrame frame = new JFrame("Tarea 4");
      prueba.ventana(ps1,ps2,frame);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(450, 400);
      frame.setVisible(true);
   }
}
