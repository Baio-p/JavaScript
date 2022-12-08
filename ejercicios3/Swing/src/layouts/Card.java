package layouts;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Card extends JFrame implements ActionListener{
    JButton btn1,btn2;
    JPanel j1,j2;
    public Card(String titulo){
        super(titulo);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // definimos el layout
        setLayout(new CardLayout());
        // creamos el primer panel
        j1 = new JPanel();
        j1.setSize(400,300);
        j1.setBackground(Color.red);
        add(j1);
        // creamos el segundo panel
        j2 = new JPanel();
        j2.setSize(400,300);
        j2.setBackground(Color.green);
        add(j2);
        // agregamos botones para intercalar los paneles
        btn1 = new JButton("Verde");
        btn2 = new JButton("Rojo");
        // escuchamos las acciones del usuario en esta ventana
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        j1.add(btn1);
        j2.add(btn2);
        // evito que cambie el tamaño
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            System.out.println("verde");
            j2.setVisible(true); 
            j1.setVisible(false); 
        }
        if(e.getSource() == btn2){
            System.out.println("Rojo");
            j2.setVisible(false); 
            j1.setVisible(true); 
        }
    }
}
