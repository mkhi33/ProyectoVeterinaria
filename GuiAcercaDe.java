import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.FlowLayout;

public class GuiAcercaDe extends JInternalFrame {




    
    private JPanel panel;
    private JLabel label;


    

    public GuiAcercaDe(){
        inicializarComponentes();
        getContentPane().setLayout(null);
 

    }
    
    private void inicializarComponentes(){

        panel = new JPanel();
        label = new JLabel();
        

        setClosable(true);
        diseñoPanel();

        pack();

         
    }

    private void diseñoPanel(){

        // Posicionar los paneles
        getContentPane().add(panel);
        panel.setBounds(0,0, 940, 788);



    
        
        panel.setBackground(new java.awt.Color(0, 0, 51));
        


        // Agregar componentes al panel izquierdo
        panel.add(label);
        


        // Posicionar componentes en el panel izquierdo

        panel.setLayout(null);
        // Textbox



        // Labels y personalización
        label.setBounds(0, 0, 940, 788);
        label.setIcon(new ImageIcon(getClass().getResource("src/images/acercaDe.png")));

        


    }
}
