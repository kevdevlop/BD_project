package bd_project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class PestañaDos extends JPanel {
   JTextArea area;
   JButton b1;
   JTextField txt ;
   
   public PestañaDos(){
      area = new JTextArea(10,20);
      JScrollPane areares = new JScrollPane(area);
      b1 = new JButton("Ver");
      JLabel lab1 = new JLabel("CURP paciente: ");
      txt = new JTextField(15);
      
      setLayout(new GridBagLayout());
    	GridBagConstraints gc = new GridBagConstraints();
      
        
        gc.gridx = 0;
    	gc.gridy = 0;
        add(lab1,gc);
        gc.gridx = 1;
        gc.gridy = 0;
        add(txt,gc);
        
        
    	gc.gridx = 1;
    	gc.gridy = 3;
        add(areares,gc);

        gc.gridx = 1;
    	gc.gridy = 5;
        add(b1,gc);
   }
   
   public void escuchaBotonP1(ActionListener ae) {
      b1.setActionCommand("Ok2");
      b1.addActionListener(ae);
   }
   
   public JPanel pestaña(){
      return new PestañaDos();
   }
}