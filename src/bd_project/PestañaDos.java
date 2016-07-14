package bd_project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class PestañaDos extends JPanel {
   JTextArea area;
   JButton b1;
   
   public PestañaDos(){
      area = new JTextArea(10,20);
      JScrollPane areares = new JScrollPane(area);
      b1 = new JButton("Ver");
      setLayout(new GridBagLayout());
    	GridBagConstraints gc = new GridBagConstraints();
      
    	gc.gridx = 0;
    	gc.gridy = 0;
      add(areares);

      gc.gridx = 2;
    	gc.gridy = 5;
      add(b1);
   }
   
   public void escuchaBotonP1(ActionListener ae) {
      b1.setActionCommand("Ok2");
      b1.addActionListener(ae);
   }
   
   public JPanel pestaña(){
      return new PestañaDos();
   }
}