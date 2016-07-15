package bd_project;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PestañaUno extends JPanel {
   JLabel jlb, jlb1, jlb2,jlb3,jlb4,jlb5;
   JButton b1;
   JTextField jtf1,jtf2,jtf3;

   public PestañaUno() {
      jtf1 = new JTextField(15);
      jtf2 = new JTextField(15);
      jtf3 = new JTextField(15);
      jlb = new JLabel("Cita");
      jlb1 = new JLabel("Doctor: ");
      jlb2 = new JLabel("Paciente: ");
      jlb3 = new JLabel("Fecha: ");
      jlb5 = new JLabel("Fecha aaaa-mm-dd  hh:mm:ss");
      JLabel jlb6 = new JLabel("Modifica la fecha de tu cita");
      b1 = new JButton("Ok");
      jlb5.setFont(new Font("prueba",1,10));
      jlb.setFont(new Font("prueba",1,14));
      setLayout(new GridBagLayout());
      GridBagConstraints gc = new GridBagConstraints();

      
      
      gc.gridx = 0;
      gc.gridy = 0;
      add(jlb, gc);
      gc.gridx = 0;
      gc.gridy = 1;
      add(jlb1, gc);
      gc.gridx = 0;
      gc.gridy = 2;
      add(jlb2, gc);
      gc.gridx = 0;
      gc.gridy = 3;
      add(jlb3, gc);
      gc.gridx = 0;
      gc.gridy = 4;
      add(jlb5, gc);
      
      gc.gridx = 1;
      gc.gridy = 1;
      add(jtf1, gc); 
      gc.gridx = 1;
      gc.gridy = 2;
      add(jtf2, gc); 
      gc.gridx = 1;
      gc.gridy = 3;
      add(jtf3, gc); 
      
      gc.gridx = 5;
      gc.gridy = 4;
      add(b1, gc);
      
      gc.gridx = 1;
      gc.gridy = 6;
      add(jlb6, gc);
   }

   public void escuchaBotonP1(ActionListener ae) {
      b1.setActionCommand("Ok1");
      b1.addActionListener(ae);
   }

   public JPanel pestaña() {
      return new PestañaUno();
   }
}