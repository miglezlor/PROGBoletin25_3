package boletin25_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos25_3 implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bsaludo;
    JButton bdespedida;
    JLabel etiqueta;
    
    public void crearVentana(){
        marco = new JFrame();
        panel = new JPanel();
        bsaludo = new JButton("Saudo");
        bdespedida = new JButton("Despedida");
        etiqueta = new JLabel();
        
        marco.setSize(300, 200);
        marco.setTitle("CURSO DAM");
        
        bsaludo.addActionListener(this);
        bdespedida.addActionListener(this);
        panel.add(bsaludo);
        panel.add(bdespedida);
        panel.add(etiqueta);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==(bsaludo)){
            etiqueta.setText("Un saudo a DAM");
        }
        else{
            etiqueta.setText("Fin do programa");
        }
    }
}
