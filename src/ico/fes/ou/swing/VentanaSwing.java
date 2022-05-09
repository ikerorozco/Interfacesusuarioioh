/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ou.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ikero
 */
public class VentanaSwing extends JFrame{
  private FlowLayout layout;
  private JTextField Cuadrotexto;
  
     public VentanaSwing() throws HeadlessException {
        this.setTitle("Mi ventana Swing");
        this.setSize(300, 200);
        this.setVisible(true);
        layout= new FlowLayout();
        this.setLayout(layout);
         Cuadrotexto = new JTextField(15);
        this.getContentPane().add(Cuadrotexto);
        this.validate();
        
        
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
           //((JFrame)e.getSource()).setVisible(false);
            }
            
            
        });
     }
}