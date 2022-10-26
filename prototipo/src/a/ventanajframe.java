package a;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
 
public class ventanajframe extends JFrame implements ActionListener{
	
	JButton btn1, btn2, btn3;
    
    public ventanajframe() {
    	componentes();
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(400,450);
    	setLocationRelativeTo(null);
    	setLayout(null);
    	setResizable(false);
    	setVisible(true);
    	setTitle("** Menu Principal **");
    	
    }
    
    public void componentes() {
    	btn1 = new JButton();
    	btn1.setBounds(120, 50, 150, 20);
    	btn1.setText("Amarillo");
    	btn1.addActionListener(this);
    	add(btn1);
    	
    	btn2 = new JButton();
    	btn2.setBounds(120, 150, 150, 20);
    	btn2.setText("Azul");
    	btn2.addActionListener(this);
    	add(btn2);
    	
    	btn3 = new JButton();
    	btn3.setBounds(120, 250, 150, 20);
    	btn3.setText("Rojo");
    	btn3.addActionListener(this);
    	add(btn3);
    }
    
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() == btn1) {
    		btn1.getParent().setBackground(Color.yellow);
    	}else if (e.getSource() == btn2) {
    		btn2.getParent().setBackground(Color.blue);
    	}else if (e.getSource() == btn3) {
    		btn3.getParent().setBackground(Color.red);
    	}
    	
	}
    
    
}
